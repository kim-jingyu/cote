package cote.inflearn.greedy;

import java.util.Scanner;

public class Friend {
    static int[] unf;
    private static final String FRIEND = "YES";
    private static final String NOT_FRIEND = "NO";

    public static int Find(int student){
        if(student==unf[student]) return unf[student]; // n번째 학생의 집합번호가 n이면, 집합번호 반환
        else return unf[student] = Find(unf[student]);
    }

    public static void Union(int friend1, int friend2){
        int friend1SetNumber = Find(friend1);
        int friend2SetNumber = Find(friend2);
        if(friend1SetNumber!=friend2SetNumber) unf[friend1SetNumber] = friend2SetNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int friends = sc.nextInt();

        unf = new int[students+1];
        for(int i=1;i<=students;i++) unf[i]=i;

        for(int i=1;i<=friends;i++){
            int friend1 = sc.nextInt();
            int friend2 = sc.nextInt();
            Union(friend1,friend2);
        }

        int person1 = sc.nextInt();
        int person2 = sc.nextInt();
        int person1SetNumber = Find(person1);
        int person2SetNumber = Find(person2);

        if(person1SetNumber == person2SetNumber) System.out.println(FRIEND);
        else System.out.println(NOT_FRIEND);
    }
}

//9 7
//        1 2
//        2 3
//        3 4
//        1 5
//        6 7
//        7 8
//        8 9
//        3 8
