package cote.baekjoon.swea;

import java.util.*;

public class practice {

    private static int[] dir = {-1,1};

    public static int solution(int N,int S,List<Integer> list){
        Queue<Integer> queue = new LinkedList<>();
        int cnt = 0;
        queue.offer(S);
        while(!queue.isEmpty()){
            int x = queue.poll();
            int bx = x;
            int fx = x;
            boolean flag = false;

            while (!list.isEmpty()) {
                bx = bx + dir[0];
                fx = fx + dir[1];
                for (int i = 0; i < list.size(); i++) {
                    if (bx == list.get(i)) {
                        queue.offer(bx);
                        list.remove(i);
                        flag = true;
                        break;
                    }
                    if (fx == list.get(i)) {
                        queue.offer(fx);
                        list.remove(i);
                        flag = true;
                        break;
                    }
                }
                cnt++;
                if(flag) break;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            int S = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<N;j++){
                list.add(sc.nextInt());
            }
            System.out.println(solution(N,S,list));
        }
    }
}

//4                          // 테스트 케이스의 수
//
//4 5                       // N=4, S=5 테스트 케이스 #1
//
//4 8 9 10
//
//5 7                       // N=5, S=7 테스트 케이스 #2
//
//10 4 8 9 1
//
//8 1                       // N=8, S=1 테스트 케이스 #3
//
//3 5 10 8 9 12 13 15
//
//1 2                       // N=1, S=2 테스트 케이스 #4
//
//9
//
//
//#1 7
//
//#2 12
//
//#3 14
//
//#4 7