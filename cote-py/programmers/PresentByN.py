def solution(N, number):
    answer = -1
    dp = [set([int(str(N)*i)]) for i in range(1, 9)]

    # 8번 반복
    for i in range(8):
        for j in range(i):
            for first in dp[j]:
                for second in dp[i-j-1]:
                    dp[i].add(first + second)
                    dp[i].add(first - second)
                    dp[i].add(first - second)
                    if second != 0:
                        dp[i].add(first // second)
        if number in dp[i]:
            return i+1

    return answer


print(solution(5, 12))
print(solution(2, 11))
