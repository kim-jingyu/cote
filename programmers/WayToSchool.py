def solution(m, n, puddles):
    answer = 0

    # map 1로 채우기
    map = [[1 for j in range(n+1)] for i in range(m+1)]

    # 물웅덩이 0으로 채우기
    for i, j in puddles:
        map[i][j] = 0

    return answer


puddles = [
    [2, 2]
]

print(solution(4, 3, puddles))
