package Day04;

import java.util.Scanner;

public class EX3_제어문 { // c s
    public static void main(String[] args) { // m s

        // 제어문 [ IF : 만약에~ ]
            // 0.  ( 조건 ) 안에  조건이 true인 경우에만 다음코드 실행
            // 1. 형태
                // 1.  if( 조건 )  실행문;
                // 2.  if( 조건 ){ 실행문; 실행문; }
                    // * if(조건);{ }  [ ; 주의 ]
                // 3.  if( 조건 ) { true실행문; }
                //     else { false실행문; }


       //  if( 3 ) System.out.println("실행"); // 오류발생  괄호에 3 넣을수 없다.
        // 1. 3 > 1  TRUE  이므로 실행 가능   if( 조건 ) 조건이 true 인 경우에만 옆에 있는 코드 실행 [ O ]
        if( 3 > 1 ) System.out.println("3이 1보다 크다[참/true]");
        // 2. 3 > 5  FALSE 이므로 실행 불가
        if( 3 > 5 ) System.out.println("3이 5보다 크다[참/true]");

        // 3. 실행코드가 2줄 이상일때는 { } 묶음처리  하자
        if( 3 > 5 )
            System.out.println("3이 5보다 크다[참/true] ");
            System.out.println("FALSE 이까 실행불가 ");
        // 3.
        if( 3 > 5 ){ // if s
            System.out.println("3이 5보다 커");
            System.out.println("falase 이까 실행불가 ");
        } // if end

        // 4.
        if( 3 > 5 ){ // if s
            System.out.println("3이 5보다 크다");
            System.out.println("true 이다 ");
        } // if end
        else { // else s
            System.out.println("3은 5보다 작다.");
            System.out.println("false 이다 ");
        } // else e

        // 5.
        if( 5 > 3 ){ // if s
            System.out.println("5는 3보다 크다.");
            System.out.println("true이다.");
        } // if e
        else { // else s
            System.out.println("5는 3보다 작다.");
            System.out.println("false이다");
        } // else e

        // 6. 입력받은 값이 90보다 크면 합격 아니면 불합격
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수 : ");
        int 점수 = scanner.nextInt();
        if( 점수 >= 90 ) System.out.println("합격");
        else System.out.println("불합격");

        // 문제1 : 입력받은 값이 홀수이면 '홀수입니다'출력 아니면 '짝수입니다' 출력

        // 문제2 : 입력받은 값이 7배수이면 '7배수입니다'출력 아니면 '7배수 아닙니다'출력

        // 문제3 : 국어 , 영어 , 수학  3개의 정수를 입력받아
            // 평균이 90점 이상이면 '합격'  아니면 '불합격' 출력

    } // m e
}  // c e











