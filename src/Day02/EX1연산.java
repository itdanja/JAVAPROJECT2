// 한줄 주석[ 실행x 구역 / 역할 (메모/기록) ]
/*
    여러줄 주석
 */
package Day02;  // 현재클래스가 속해 있는 폴더 이름 표시

public class EX1연산 { // class start
    // { } 마다 tab키 1번
    // 2. main함수[ 코드 실행 함수 ]
        // ma+엔터
    public static void main(String[] args) { // main start
        // 3. 출력함수
            // sout+엔터
        System.out.println("자바 안녕");
        // 4. 코드 실행 [ 왼쪽에 화살표 클릭 -> run  혹은 ctrl+shift+f10 ]

        ////////////////////////// 산술 연산자 //////////////////////
        // *** 1. + 더하기
        System.out.println( 10 + 10 );    // 20
        // 2. * 곱하기
        System.out.println( 10 * 10 );    // 100
        // 3. - 빼기
        System.out.println( 10 - 5 );     // 5
        // 4. / 나누기 후 몫
        System.out.println( 10 / 3 );     // 3    [ 몫 ]
        // *** 5. % 나누기 후 나머지
        System.out.println( 10 % 3 );     // 1    [ 나머지 ]
        /////////////////////////// 연결 연산자 ////////////////////
        // *** 1. + 연결연산자    (  "문자열" + 10  )
        System.out.println( "더하기 : " +  10 + 10  );
        System.out.println( "더하기 : " +  (10 + 10)  );
                //  A-10 : 문자 [ 문자와 숫자 ]
                //  "10" : 문자 [ " " 안에 있으면 ]
                //   10 + 10 : 숫자 [ 숫자+숫자 = 숫자 ]
                //  "10"+10 : 문자 [ 문자+숫자 = 문자 ]

    } // main end
} // class end
