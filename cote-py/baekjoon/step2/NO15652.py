n, m = map(int, input().split())


def calculate(level, current, arr):
    if level == m:
        print(' '.join(map(str, arr)))
        return
    for i in range(current, n + 1):
        arr.append(i)
        calculate(level + 1, i, arr)
        arr.pop()


calculate(0, 1, [])
