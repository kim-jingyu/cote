N, B = map(int, input().split())
answer = ""

while N > 0:
    rest = N % B
    if rest >= 10:
        temp = chr(rest - 10 + 65)
        answer += temp
    else:
        temp = str(rest)
        answer += temp
    N = (N // B)

print(answer[::-1])