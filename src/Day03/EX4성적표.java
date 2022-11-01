package Day03;

import java.util.Scanner;

// 1. 클래스 선언
public class EX4성적표 { // class s
    // 2. main 함수 선언
    public static void main(String[] args) { // main s

        // 입력받기위한 준비물 [ !!입력 객체 ]
        // 3. Scanner 클래스로 객체 만들기
        Scanner scanner = new Scanner(System.in);
        // 4. 이름 입력받아서 변수에 저장
        System.out.print(" 이름 : "); // 1. 무엇을 입력해야 하는지 안내 문구 출력
        String 이름 = scanner.next();  // 2. 입력받은 문자열을 왼쪽 변수에 대입
        // 5. 국어 점수 입력받기
        System.out.print(" 국어 : ");
        int 국어 = scanner.nextInt();
        // 6. 영어 점수 입력받기
        System.out.print(" 영어 : ");
        int 영어 = scanner.nextInt();
        // 7. 수학 점수 입력받기
        System.out.print(" 수학 : ");
        int 수학 = scanner.nextInt();

            int 총점 = 국어 + 영어 + 수학;
            int 평균 = 총점/3;

        // 8. 결과 출력 [ 모든 변수 출력 ]
        System.out.println("------------------ 성적표 ------------");
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
        System.out.println( 이름 +"\t"+ 국어 +"\t" + 영어 + "\t" + 수학 + "\t" + 총점+"\t"+평균);




    } // main e
} // class e
