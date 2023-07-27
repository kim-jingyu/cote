# 쉬운 계단 수
# 45656 -> 계단 수
# 점화식
# f(n, d) = 길이가 n이고, 마지막 숫자가 d인 계단 수의 개수
# -> (f(N, 0) + f(N, 1) + f(N, 2) ... f(N, 9)) % MOD
# f(n, d) = f(n-1, d-1) + f(n-1, d+1)
#           -> if d > 0    -> if d < 9
# cache[n][d] : 길이가 n이고, 마지막 숫자가 d인 계단수 개수
MOD = 1_000_000_000

# f(1, 1~9) -> 계단 수 1
cache = [[0] * 10 for _ in range(101)]
for d in range(1, 10):
    cache[1][d] = 1

for n in range(2, 101):
    for d in range(10):
        if d > 0:
            cache[n][d] += cache[n-1][d-1]
            cache[n][d] %= MOD

        if d < 9:
            cache[n][d] += cache[n-1][d+1]
            cache[n][d] %= MOD

N = int(input())
answer = 0

for d in range(10):
    answer += cache[N][d]
    answer %= MOD

print(answer)
