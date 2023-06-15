package cote.baekjoon.backtracking;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NO1759 {
    private static int n,m,cntVowel,cntConsonant;
    private static String tmp;
    private static String[] arr,ch;
    private static List<String> vowel = List.of("a","e","i","o","u");

    public static void solution(int Level,int start){
        if(Level==n){
            cntVowel=0;
            cntConsonant=0;
            tmp="";
            for(String s:ch){
                if(vowel.contains(s)) cntVowel++;
                else cntConsonant++;
                tmp += s;
            }
            if(cntVowel<1) return;
            if(cntConsonant<2) return;
            System.out.println(tmp);
        }
        else{
            for(int i=start;i<m;i++){
                ch[Level] = arr[i];
                solution(Level+1,i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        String space = sc.nextLine();

        ch = new String[n];

        arr = sc.nextLine().split(" ");
        Arrays.sort(arr);

        solution(0,0);
    }
}

//4 6
//        a t c i s w

//    acis
//            acit
//    aciw
//            acst
//    acsw
//            actw

//    aist
//            aisw
//    aitw

//            astw

//    cist
//            cisw
//    citw

//            istw