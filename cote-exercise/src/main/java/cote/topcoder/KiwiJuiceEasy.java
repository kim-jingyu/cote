package cote.topcoder;

public class KiwiJuiceEasy {
    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
        for (int i = 0; i < fromId.length; i++) {
            int f = fromId[i];
            int t = toId[i];

            int amountOfMovement = Math.min(bottles[f], capacities[t] - bottles[t]);

            bottles[t] += amountOfMovement;
            bottles[f] -= amountOfMovement;
        }
        return bottles;
    }
}
