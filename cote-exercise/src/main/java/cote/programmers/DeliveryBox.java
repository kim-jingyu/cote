package cote.programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DeliveryBox {
    public int solution(int[] order) {
        int answer = 0;

        int deliveryIndex = 0;
        Stack<Integer> secondBelt = new Stack<>();

        for (int box = 1; box <= order.length; box++) {

            // 택배수거순서 != 현재 택배상자
            if (order[deliveryIndex] != box) {
                secondBelt.push(box);
                continue;
            }

            // 택배수거순서 == 현재 택배상자
            deliveryIndex++;
            answer++;

            // 보조 컨베이어 벨트에서 택배 수거가 가능할때
            while (!secondBelt.isEmpty() && order[deliveryIndex] == secondBelt.peek()) {
                secondBelt.pop();
                deliveryIndex++;
                answer++;
            }
        }
        return answer;
    }
}
