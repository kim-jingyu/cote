n = int(input())

arr = [int(input()) for _ in range(n)]

d = [0] * n

d[0] = arr[0]
if n > 1:
    d[1] = d[0] + arr[1]
if n > 2:
    d[2] = max(d[1], arr[2] + d[0], arr[2] + arr[1])
for i in range(3, n):
    d[i] += max(d[i-1], arr[i] + d[i-2], arr[i] + arr[i-1] + d[i-3])

print(max(d))