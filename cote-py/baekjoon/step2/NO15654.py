import itertools
import sys

n, m = map(int, input().split())
arr = sorted(list(map(int, sys.stdin.readline().split())))

for value in list(itertools.permutations(arr, m)):
    print(' '.join(map(str, value)))
