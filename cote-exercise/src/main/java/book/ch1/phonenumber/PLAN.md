# ✏️ 문제
## 전화번호 검색
- 사용자가 입력한 전화번호를 가진 사람들을 전화번호부에서 검색하는 기능 구현하기

# 🎯 설계
1. 전화번호는 어떤 형식으로 나타낼 것인가
   - 입력받은 문자열에서 숫자만 남겨 일관된 형식으로 전화번호를 변환시킨다.
2. 전화번호부에 저장되어 있는 사람은 어떻게 나타낼 것인가
   - 한 사람은 여러 개의 전화번호를 가질 수 있다.
   - 전화번호를 추가할 수 있는 메서드를 추가한다.
3. 사람과 전화번호는 어떻게 비교할 것인가
   - 사람이 전화번호를 가지고 있는지 검사하기 위해 메서드를 추가한다.
4. 전화번호부는 어떤 형식으로 나타낼 것인가
   - 전화번호부는 단순히 여러 사람을 담는 용도이므로 여러 개의 Person 객체를 가지고 있을 수 있다.
   - 사람을 추가할 수 있는 메서드를 추가한다.
   - 전화번호를 이용해서 사람을 찾는 메서드를 추가한다.
     - 전화번호가 올바른 사람을 찾고, 없는 경우 null 을 반환한다.