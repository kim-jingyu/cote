n = int(input())
arr = list(map(int, input().split()))

d = [[0] * n for _ in range(2)]

d[0][0] = arr[0]
d[1][0] = arr[0]

for i in range(1, n):
    d[0][i] = max(arr[i], d[0][i-1] + arr[i])
    d[1][i] = max(d[0][i-1], d[1][i-1] + arr[i])

print(max(max(d[0]), max(d[1])))
