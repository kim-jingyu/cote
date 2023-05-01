ㅔㄱ# n: 사람수, times[] : 심사관별 검사 시간
def solution(n, times):
    start = 1
    end = n*max(times)
    answer = end

    while (start <= end):
        mid = (start + end) // 2

        people = 0
        for time in times:
            people += (mid // time)

        if people < n:
            start = mid + 1
        else:
            end = mid - 1
            answer = min(answer, mid)

    return answer


solution(6, {7, 10})
