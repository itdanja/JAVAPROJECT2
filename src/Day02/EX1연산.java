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

        /////////////////////////// 비교 연산자--> true/false /////////////////////
        // 1.  > 크다 , 초과
        System.out.println( 10 > 3 );   // 10 이 3보다 크다 /  true
        // 2.  < 작다 , 미만
        System.out.println( 10 < 3 );   // 10 은 3보다 작다 / false
        // 3.  >= 이상 , 크거나같다
        System.out.println( 10 >= 3 );  // 10 은 3보다 이상 / true
        // 4.  <= 이하 , 작거나같다
        System.out.println( 10 <= 3 );  // 10 은 보다 이하 / false
        // 5.  == 같다 , 동일하다
        System.out.println( 10 == 3 );  // 10 과 3은 같다   / false
        // 6.  != 같지않다 , 아니다 등
        System.out.println( 10 != 3 );  // 10 과 3과 다르다 / true
        //////////////////////////// 논리 연산자 [  비교연산자 2개 이상일떄 ]
        // 1. && : and
        System.out.println( " && : " + ( 10 >= 3 && 20 >= 10 ) ); // true and true => true
                        // 10 이 3보다 이상 [이면서] 20이 10보다 이상
        System.out.println( " && : " + ( 10 >= 3 && 20 >= 30 ) ); // true and false => false
                        // 10 이 3보다 이상 [ 이면서 ] 20 이 30보다 이상
        // 2. || : or
        System.out.println( " || : " + ( 10 >= 3 || 20 >= 10 ) );   // true or true => true
        System.out.println( " || : " + ( 10 >= 3 || 20 >= 30 ) );   // true or false => true
        // 3. ! : not [ 부정 / 반대 ]
        System.out.println( " ! : " +  !( 10 >= 3 ) ); // true 가 ! 만나면 false / false 가 ! 만나면 true

    } // main end
} // class end
/*
    연산자
    1. 산술연산자
        + 더하기 -빼기 *곱하기 /나누기[몫] %나누기[나머지]
    2. 비교연산자
        >초과 <미만 >=이상 <=이하 ==같다 !=같지않다
    3. 논리연산자 : 비교연산자 2개 이상일경우
        - 초등학생이 사탕 이면서 초콜릿 먹을래  [ 2개 다 먹을래 ]
        - 초등학생이 사탕 이거나 초콜릿 먹을래  [ 둘 중 하나 먹을래 ]
        && : [ and ] 이면서 면서 이고 모두 그리고  : 모두 참 이면 참
        || : [ or ] 이거나 거나 또는 하나라도      : 하나라도 참 이면 참
        ! : [ not ] 반대 [ true -> false   / false -> true ]
 */























