# 단어 뒤집기
import sys

n = int(sys.stdin.readline())

for _ in range(n):
    split = sys.stdin.readline().split(" ")
    temp = []

    for string in split:
        new_string = string.strip()
        reversed_string = new_string[::-1]
        temp.append(reversed_string)

    print(" ".join(temp))
