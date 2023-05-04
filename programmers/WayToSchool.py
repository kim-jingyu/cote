def solution(m, n, puddles):
    answer = 0

    # dp 0으로 채우기
    dp = [ [0] * (m+1) for i in range(n+1) ]

    puddles = [ [i,j] for [j,i] in puddles]

    # 점화식: dp[i][j](새로 값을 넣을 칸) = dp[i-1][j](왼쪽 칸까지의 이동수) + dp[i][j-1](윗쪽 칸까지의 이동수)
    for i in range(1, n+1):
        for j in range(1, m+1):
            # 집인 경우, 반복문 건너뛰기
            if (i==1 and j==1):
                dp[i][j] = 1
                continue
            # 물웅덩이인 경우, 0으로 채우기
            if [i, j] in puddles:
                dp[i][j] = 0
                continue
            dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000007

    answer = dp[n][m]
    return answer


puddles = [
    [2, 2]
]

print(solution(4, 3, puddles))
