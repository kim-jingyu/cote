N = int(input())
arr = list(map(int, input().split()))

d = [1] * N

for i in range(1, N):
    for j in range(0, i):
        if arr[j] > arr[i]:
            d[i] = max(d[i], d[j] + 1)

print(max(d))