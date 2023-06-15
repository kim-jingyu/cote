package cote.programmers;

/**
 * 2023 KAKAO BLIND RECRUITMENT
 * 택배 배달과 수거하기
 */
public class DeliveryAndPickups {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int deliveryValue = 0;
        int pickupValue = 0;

        for (int cur = n - 1; cur >= 0; cur--) {
            deliveryValue += deliveries[cur];
            pickupValue += pickups[cur];

            while (deliveryValue > 0 || pickupValue > 0) {
                deliveryValue = deliveryValue - cap;
                pickupValue = pickupValue - cap;
                answer += (cur + 1) * 2L;
            }
        }

        return answer;
    }
}
