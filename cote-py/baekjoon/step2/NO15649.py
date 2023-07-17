import itertools

n, m = map(int, input().split())

arr = list(str(i) for i in range(1, n + 1))

for value in list(itertools.permutations(arr, m)):
    print(' '.join(value))
