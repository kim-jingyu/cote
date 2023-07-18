import sys

n = int(input())
arr = list(map(int, sys.stdin.readline().split()))
target = 0
canContinue = True

for i in range(n-1, 0, -1):
    if arr[i-1] > arr[i]:
        target = i-1
        break
else:
    print(-1)
    canContinue = False

if canContinue:
    for i in range(n-1, target, -1):
        if arr[i] < arr[target]:
            arr[target], arr[i] = arr[i], arr[target]
            break
    arr = arr[:target+1] + sorted(arr[target+1:],reverse=True)
    print(*arr)
