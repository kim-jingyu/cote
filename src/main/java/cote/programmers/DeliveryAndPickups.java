package cote.programmers;

public class DeliveryAndPickups {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int tempCap = cap;

        while (deliveries[n - 1] == 0) {
            dfs(n, answer, cap, tempCap, deliveries, pickups);
        }

        return answer;
    }

    private void dfs(int n,long answer, int cap, int tempCap, int[] deliveries, int[] pickups) {
        while (deliveries[n - 1] == 0) {
            int count = 0;
            while (tempCap == 0) {
                while (deliveries[count] == 0) {
                    deliveries[count]--;
                    tempCap--;
                }
                count++;
            }
            answer = Integer.toUnsignedLong(count * 2);
            while (tempCap == 2) {
                while (pickups[count] == 0) {
                    pickups[count]--;
                    tempCap++;
                }
                count--;
            }
        }
    }

}
