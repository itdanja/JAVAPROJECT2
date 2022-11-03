package Day04;

import java.util.Scanner; // Scanner 객체 선언시 필수!!!

public class EX2_문제2 { // c s
    public static void main(String[] args) { // m s

        // * 입력객체선언 : main마다 1번씩만 선언
        Scanner scanner = new Scanner( System.in );
        // 문제3 : 두 실수를 입력받아 앞실수의 값이 뒤실수 값의 몇 % 인지 출력
            // [ 예 ] 54.5    84.3   입력했으면    64.2857~~%
        System.out.print("실수1 : "); double 실수1 = scanner.nextDouble();
        System.out.print("실수2 : "); double 실수2 = scanner.nextDouble();
        System.out.println("결과 : "+ ( 실수1/실수2 )*100 + "%" );
        // 문제4 : 키를 정수로 입력받아 표준체중 출력하기
            // [ 표준체중 계산식 ] (키-100) * 0.9
        System.out.print("키 : ");   int 키 = scanner.nextInt();
        System.out.println("결과 : " + ( 키-100 )*0.9 );
        // 문제5 : inch 를 입력받아 cm 로 변환하기
            // [ 1 inch -> 2.54cm ]
        System.out.print("inch : ");   double 인치 = scanner.nextDouble();
        System.out.println("결과 : " + (인치*2.54) +"cm" );

        // 문제6 : 중간 , 기말 , 수행   3개의 점수를 정수로 입력받아 반영비율별 계산
            // 중간고사 30%  // 기말고사 30%   // 수행평가  40%     // int * double = double
        System.out.print("중간고사 : ");
            double 중간고사 = scanner.nextInt() * 0.3;
        System.out.print("기말고사 : ");
            double 기말고사 = scanner.nextInt() * 0.3;
        System.out.print("수행평가 : ");
            double 수행평가 = scanner.nextInt() * 0.4;
        System.out.println("결과 : " + (중간고사+기말고사+수행평가) );
                                    // 컨트롤+스페이바 : 자동완성[추천]




    } // m e
}// c e
