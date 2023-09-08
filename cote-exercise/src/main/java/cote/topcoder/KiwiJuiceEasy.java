package cote.topcoder;

public class KiwiJuiceEasy {
    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
        for (int i = 0; i < fromId.length; i++) {
            int f = fromId[i];
            int t = toId[i];

            int total = bottles[f] + bottles[t];
            bottles[t] = Math.min(total, capacities[t]);
            bottles[f] = total - bottles[t];
        }
        return bottles;
    }
}
