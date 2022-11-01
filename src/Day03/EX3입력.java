package Day03;

import java.util.Scanner; // import : 가져오다 // 패키지명.클래스명

public class EX3입력 { // class s
    public static void main(String[] args) { // main s

        // * 입력 객체 [ Scanner : 입력클래스 ] Scanner scanner = new Scanner( System.in );

        // 첫글자 대문자 클래스 뜻
        // 변수명 : 아무거나 / 의미있는 단어
            // 1.  클래스 상단 import java.util.Scanner; 자동 작성됨
                // Scanner 클래스 사용시 클래스 가져온다.
                // System , String : java.lang 패키지는 자동 import
        Scanner scanner = new Scanner( System.in );
        // 1. 문자열 입력받기  [ scanner.next() ]
        System.out.print("이름 입력 : "); // 입력전에 무엇을 입력해야 하는지 안내출력
        String 입력1 = scanner.next(); // 입력받은 문자열 을 왼쪽변수[이름]에 저장
        // 2. 정수[int] 입력받기 [ scanner.nextInt() ]
        System.out.print("나이 입력 : ");
        int 입력2 = scanner.nextInt();
        // 3. 실수[double ] 입력받기 [ scanner.nextDouble() ]
        System.out.print("키 입력 : ");
        double 입력3 = scanner.nextDouble();
        System.out.println("---------- 회원가입 완료 ------------");
        System.out.println("이름\t나이\t키");    // \t 탭 [5칸 이동]
        System.out.println( 입력1 +"\t"+ 입력2 +"\t"+ 입력3 );
            // "이름" : 문자열
            // 입력1 : 입력1 이라는 변수 호출 [ 변수는 " " 안에 있으면 안된다 ]

    } // main end
} // class end
/*
    클래스 [ 미리 만들어진 설계도 ]
        1. System [ java.lang ]
        2. String [ java.lang ]
        3. Scanner [ java.util ]
            1. 입력 객체
                Scanner scanner = new Scanner( System.in );
            2. 입력받은 데이터 가져오기
                1. 문자열 입력
                    scanner.next();
                2. 정수 입력
                    scanner.nextInt()
                3. 실수 입력
                    scanner.nextDouble();

 */