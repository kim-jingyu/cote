N = int(input())

arr = list(map(int, input().split()))

d = [0] * N

d[0] = arr[0]

for i in range(1, N):
    d[i] = arr[i]
    for j in range(i):
        if arr[j] < arr[i]:
            d[i] = max(d[i], arr[i] + d[j])

print(max(d))