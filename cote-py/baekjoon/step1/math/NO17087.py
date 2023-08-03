from math import gcd
from itertools import combinations


def main():
    N, S = map(int, input().split())
    people = list(map(int, input().split()))
    s = set()
    answer = (10 ** 9)

    for person in people:
        s.add(abs(S - person))

    if N == 1:
        print(s.pop())
        return

    combs = combinations(s, 2)

    for a, b in combs:
        answer = min(answer, gcd(a, b))

    print(answer)


if __name__ == '__main__':
    main()
