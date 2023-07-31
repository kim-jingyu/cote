S = input()
nums = [0] * 26

for value in S:
    idx = ord(value) - ord('a')
    nums[idx] += 1

print(' '.join(map(str, nums)))