N = int(input())

# cache = [-1] * 91
# cache[0] = 0
# cache[1] = 1
#
#
# def fibo(num):
#     if cache[num] == -1:
#         cache[num] = fibo(num - 1) + fibo(num - 2)
#
#     return cache[num]
#
#
# print(fibo(N))

MOD = 10007

cached = [-1] * 91
cached[0] = 0
cached[1] = 1

for i in range(2, N + 1):
    if cached[i] < 0:
        cached[i] = cached[i-1] + cached[i-2]
        cached[i] %= MOD
    print(f'cached[i] = {cached[i]}')

print(cached[N])