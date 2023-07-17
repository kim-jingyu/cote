import sys
import itertools

n, m = map(int, input().split())
arr = sorted(list(map(int, sys.stdin.readline().split())))

for value in sorted(list(set(itertools.permutations(arr, m)))):
    print(' '.join(map(str, value)))
