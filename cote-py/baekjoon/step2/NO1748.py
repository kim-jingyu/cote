s = input()
length = len(s)
answer = 0

for i in range(1, length):
    answer += 9 * pow(10, i-1) * i

rest_count = int(s) - pow(10, length - 1) + 1
answer += rest_count * length

print(answer)