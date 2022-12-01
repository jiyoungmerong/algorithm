package BoJ;

import java.util.Scanner;
public class Main {

    public static boolean[] arr = new boolean[246913];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        get_decimal();

        while(true) {
            int num = scanner.nextInt();
            int cnt = 0;

            if(num==0)
                break;
            for(int i = num+1; i<=2*num; i++) {
                if(!arr[i])
                    cnt++;
            }
            System.out.println(cnt);
        }
    }

    public static void get_decimal() { // 소수 구하는 메소드
        arr[0] = arr[1] = true; // 0 과 1 은 소수가 아니므로 ture

        for(int i = 2; i <= Math.sqrt(arr.length); i++) {
            if(arr[i])
                continue;
            for(int j = i*i; j<arr.length; j+=i)
                arr[j] = true;
        }
    }

}