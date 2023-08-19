N = int(input())
cached = [0] * (N + 1)

for i in range(2, N + 1):
    cached[i] = cached[i - 1] + 1
    if i % 2 == 0:
        cached[i] = min(cached[i], cached[i // 2] + 1)
    if i % 3 == 0:
        cached[i] = min(cached[i], cached[i // 3] + 1)

print(cached[N])