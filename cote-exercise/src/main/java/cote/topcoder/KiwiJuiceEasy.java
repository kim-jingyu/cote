package cote.topcoder;

public class KiwiJuiceEasy {
    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
        for (int i = 0; i < fromId.length; i++) {
            int f = fromId[i];
            int t = toId[i];

            int restSpace = capacities[t] - bottles[t];

            if (restSpace >= bottles[f]) {
                int amountOfMovement = bottles[f];
                bottles[t] += amountOfMovement;
                bottles[f] -= amountOfMovement;
            } else {
                int amountOfMovement = restSpace;
                bottles[t] += amountOfMovement;
                bottles[f] -= amountOfMovement;
            }
        }
        return bottles;
    }
}
