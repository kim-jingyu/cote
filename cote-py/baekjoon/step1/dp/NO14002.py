N = int(input())
arr = list(map(int, input().split()))

d = [1] * N

for i in range(N):
    for j in range(i):
        if arr[i] > arr[j]:
            d[i] = max(d[i], d[j] + 1)

max_length = max(d)
print(max_length)

temp = []

for i in range(N - 1, -1, -1):
    if d[i] == max_length:
        temp.append(arr[i])
        max_length -= 1

temp.reverse()
print(*temp)
