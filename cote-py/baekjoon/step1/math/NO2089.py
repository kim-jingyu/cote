N = int(input())
answer = ""

while N:
    if N % (-2):
        answer = '1' + answer
        N = (N // -2) + 1
    else:
        answer = '0' + answer
        N //= -2

print(answer)