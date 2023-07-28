# 1. 테이블 정의
# dp[i] -> i를 1로 만들기 위한 연산 횟수의 최솟값
# 2. 점화식 찾기
# ex) dp[12] = dp[4] + 1 or = dp[6] + 1 or = dp[11] + 1
# 일반화 -> dp[i] = min(dp[i/3] + 1, dp[i/2] + 1, dp[i-1] + 1)
# 3. 초기값 찾기
# dp[1] = 0
# 4. 반목문 돌리면서 테이블 채우기
N = int(input())
cached = [0] * (N + 1)

for i in range(2, N+1):
    cached[i] = cached[i - 1] + 1
    if i % 2 == 0:
        cached[i] = min(cached[i], cached[i // 2] + 1)
    if i % 3 == 0:
        cached[i] = min(cached[i], cached[i // 3] + 1)

print(cached[N])