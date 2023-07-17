n, m = map(int, input().split())


def calculate(level, arr):
    if level == m:
        print(' '.join(arr))
        return
    for i in range(1, n + 1):
        arr.append(str(i))
        calculate(level + 1, arr)
        arr.pop()


calculate(0, [])
