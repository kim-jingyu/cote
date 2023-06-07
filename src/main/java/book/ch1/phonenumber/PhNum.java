package book.ch1.phonenumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class PhNum {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동");
        person1.addPhoneNumber(new PhoneNumber("010-1234-5678"));
        person1.addPhoneNumber(new PhoneNumber("01011112222"));

        Person person2 = new Person("김철수");
        person2.addPhoneNumber(new PhoneNumber("010-3333-4444"));

        Person person3 = new Person("이영희");
        person3.addPhoneNumber(new PhoneNumber("010-5555-6666"));

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson(person1);
        phoneBook.addPerson(person2);
        phoneBook.addPerson(person3);

        System.out.println(phoneBook.search(new PhoneNumber("01012345678")));
        System.out.println(phoneBook.search(new PhoneNumber("01011112222")));
        System.out.println(phoneBook.search(new PhoneNumber("01033334444")));
        System.out.println(phoneBook.search(new PhoneNumber("01055556666")));
        System.out.println(phoneBook.search(new PhoneNumber("01000000000")));
    }

    private static class PhoneNumber {
        public final String phoneNumber;

        public PhoneNumber(String rawPhoneNumber) {
            this.phoneNumber = rawPhoneNumber.replaceAll("[^0-9]", "");
        }

        @Override
        public String toString() {
            return "PhoneNumber{" +
                    "phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof PhoneNumber)) return false;
            return phoneNumber.equals(((PhoneNumber) o).phoneNumber);
        }
    }

    private static class Person {
        public final String name;
        private final List<PhoneNumber> numbers;

        public Person(String name) {
            this.name = name;
            numbers = new ArrayList<>();
        }

        public void addPhoneNumber(PhoneNumber number) {
            numbers.add(number);
        }

        public boolean hasPhoneNumber(PhoneNumber number) {
            return numbers.contains(number);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", numbers=" + numbers +
                    '}';
        }
    }

    private static class PhoneBook {
        private final Set<Person> people;

        public PhoneBook() {
            people = new HashSet<>();
        }

        public void addPerson(Person person) {
            people.add(person);
        }

        public Person search(PhoneNumber number) {
            return people.stream()
                    .filter(p -> p.hasPhoneNumber(number))
                    .findFirst()
                    .orElse(null);
        }

        @Override
        public String toString() {
            return "PhoneBook{" +
                    "people=" + people +
                    '}';
        }
    }
}