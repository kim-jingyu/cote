import sys
from itertools import combinations

l, c = map(int, sys.stdin.readline().split())
arr = sorted(list(sys.stdin.readline().split()))
check_arr = ['a', 'e', 'i', 'o', 'u']

for value in combinations(arr, l):
    temp = [*value]
    mo_eum = 0
    ja_eum = 0

    for i in temp:
        if i in check_arr:
            mo_eum += 1
        else:
            ja_eum += 1

    if mo_eum >= 1 and ja_eum >= 2:
        print(''.join(temp))
