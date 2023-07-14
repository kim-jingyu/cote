import sys

earth, sun, moon = map(int, sys.stdin.readline().rstrip().split(" "))
cnt = 1

while True:
    earth_value = cnt % 15
    if earth_value == 0:
        earth_value = 15
    sun_value = cnt % 28
    if sun_value == 0:
        sun_value = 28
    moon_value = cnt % 19
    if moon_value == 0:
        moon_value = 19
    if earth_value == earth and sun_value == sun and moon_value == moon:
        break
    cnt += 1

print(cnt)