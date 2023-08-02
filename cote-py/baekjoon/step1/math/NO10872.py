num = int(input())
dp = [0] * 13
dp[0] = 1
dp[1] = 1


def factorial(n):
    if dp[n] > 0:
        return dp[n]
    elif dp[n] == 0:
        dp[n] = n * factorial(n - 1)
        return dp[n]


print(factorial(num))
