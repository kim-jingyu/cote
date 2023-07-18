from itertools import permutations
n = int(input())
arr = list(i for i in range(1, n + 1))
for value in list(permutations(arr)):
    print(*value)