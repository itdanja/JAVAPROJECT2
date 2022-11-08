package Day05; // 패키지 명

import java.util.Scanner;

public class EX1_제어문 { // class s

    public static void main(String[] args) { // main s

        // --- 입력받은 점수 이 90점 이상 합격 아니면 불합격
        // 개발 순서도[알고리즘]
        // 1. 점수 입력하라고 안내문구 출력한다.
        System.out.print(" 점수입력 : ");
        // 2. 입력받는다.
            // 1. 입력객체 만든다.
        Scanner sc = new Scanner(System.in);
            // 2. 입력객체를 통한 메소드로 입력받는다.
        // 3. 입력받은 값을 변수에 저장한다.
        int 점수 =  sc.nextInt();
        // 4. 2가지 경우의수
            // 1 : 90점 이상이면 합격 출력한다.
            // 2 : 90점 미만이면 불합격 출력한다.
        if ( 점수 >= 90 ) System.out.println("합격");
        else System.out.println("불합격");

        // * 5가지 경우의수
        if( 점수 >= 90 ) System.out.println("A등급");
        else if( 점수 >= 80 ) System.out.println("B등급");
        else if( 점수 >= 70 ) System.out.println("C등급");
        else if( 점수 >= 60 ) System.out.println("D등급");
        else System.out.println("탈락");

    } // main e
} // class e
