N, B = map(str, input().split())
B = int(B)
B_arr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

N = list(N[::-1])

answer = 0

for index, n in enumerate(N):
    temp = 0
    for j, b in enumerate(list(B_arr)):
        if b == n:
            temp = j
            break
        j += 1

    answer += (B ** index) * temp

print(answer)