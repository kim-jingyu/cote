import sys
from itertools import permutations

n = int(input())
arr = list(map(int, sys.stdin.readline().split()))
result = -1e9

for values in list(permutations(arr, n)):
    temp = 0
    for i in range(n - 1):
        temp += abs(values[i] - values[i+1])
    result = max(result, temp)

print(result)