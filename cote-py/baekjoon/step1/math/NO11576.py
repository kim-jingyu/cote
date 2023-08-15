A, B = map(int, input().split())
m = int(input())
A_values = list(map(int, input().split()))
A_values.reverse()

temp = 0

for i, a in enumerate(A_values):
    temp += ((A ** i) * a)

answer = []
while True:
    if temp:
        divided = temp % B
        answer.append(divided)
        temp = temp // B
    else:
        break

answer.reverse()
print(*answer)
