from itertools import combinations

values = [int(input()) for _ in range(9)]
result = []

for i in combinations(values, 7):
    if sum(i) == 100:
        result = i
        break

print('\n'.join(map(str, sorted(result))))
