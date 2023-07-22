import sys
from itertools import combinations
while True:
    arr = list(map(int, sys.stdin.readline().split()))
    if arr[0] == 0:
        break

    temp = arr[1:]
    for value in combinations(temp, 6):
        result = [*value]
        print(*result)
    print()