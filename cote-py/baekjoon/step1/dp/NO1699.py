# 1 -> 1^2
# 2 -> 1^2 + 1^2
# 3 -> 1^2 + 1^2 + 1^2
# 4 -> 2^2
# 5 -> d[1] + 2^2
# 6 -> d[2] + 2^2
# 7 -> d[3]+ 2^2
# 8 -> d[4] + 2^2
# 9 -> 3^2
# 10 -> d[1] + 3^2
# 11 -> d[2] + 3^2
# 12 -> d[3] + 3^2
# 13 -> d[4] + 3^2
# 14 -> d[5] + 3^2
# 15 -> d[6] + 3^2
# 16 -> 4^2
import math
N = int(input())
d = [0] * (N + 1)
temp = 0

for i in range(1, N + 1):
    if math.sqrt(i).is_integer():
        d[i] = 1
        temp = 1
        continue
    d[i] = d[temp] + 1
    temp += 1

print(d[N])