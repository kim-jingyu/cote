import sys

while True:
    values = sys.stdin.readline().rstrip('\n')
    if not values:
        break

    low_alphabet = 0
    high_alphabet = 0
    num = 0
    empty = 0

    for value in values:
        if value.isalpha():
            if value.islower():
                low_alphabet += 1
            elif value.isupper():
                high_alphabet += 1
        elif value.isdigit():
            num += 1
        elif value.isspace():
            empty += 1

    print(low_alphabet, high_alphabet, num, empty)
