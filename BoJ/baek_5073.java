package BoJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) { // 무한루프
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int max = Math.max(Math.max(a, b), c); // 세 변의 길이 중 가장 긴 값 찾기

            if(a == 0 && b == 0 && c == 0) // 세 변의 길이가 모두 0일 때 탈출
                break;

            if(a == b && b == c){
                System.out.println("Equilateral"); // 세 변의 길이가 모두 같을 경우
            }
            else if(max >= a + b || max >= a + c || max >= b + c){
                System.out.println("Invalid"); // 삼각형 조건을 만족하지 못 할 경우
            }
            else if(a == b || a == c || b == c){
                System.out.println("Isosceles"); // 두 변의 길이가 같을 경우
            }
            else if(a != b && b != c && a != c){
                System.out.println("Scalene"); // 세 변의 길이가 모두 다를 경우
            }
            else
                System.out.println("Invalid");

        }
    }

}
