N = int(input())
dp = [0] * 501
dp[0] = 1
dp[1] = 1


def factorial(n):
    if dp[n] > 0:
        return dp[n]
    elif dp[n] == 0:
        dp[n] = n * factorial(n - 1)
        return dp[n]


arr = list(str(factorial(N)))
arr.reverse()
cnt = 0
for value in arr:
    if value == '0':
        cnt += 1
    else:
        break

print(cnt)