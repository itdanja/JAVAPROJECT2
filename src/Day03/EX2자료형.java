package Day03;

public class EX2자료형 { // class s
    public static void main(String[] args) { // main s
        // 자료형
            // 1. 8가지 형태 존재
        // 1. boolean : 1비트 [ true 혹은 false ]
            // boolean 변수명1 = 10; // 오류 10 남기에는 boolean 상자가 너무 작다
        boolean 변수명2 = true;        System.out.println("변수명2 출력 : " + 변수명2 );
        // 2. char : 2바이트 [ 문자 1개 저장 ]  // 문자 : 1개   / 문자열 : 문자여러개
            //char 변수명3 = "안녕하세요"; // 오류 "안녕하세요"는 문자열이기때문에 불가능
        char 변수명4 = '안';            System.out.println("변수명4 출력 : " + 변수명4 ); //  '문자' vs "문자열"
        // 2-2 String : 문자열 클래스
        String 변수명5 = "안녕하세요";  System.out.println("변수명5 출력 : " + 변수명5 );
        // 3. byte : 1바이트 [ 정수 -128 ~ +127 ]
            // byte 변수명6 = 300;     // 오류 : byte 300를 저장할수 없다.
        byte 변수명7 = 100;            System.out.println("변수명7 출력 : " + 변수명7 );
        // 4. short : 2바이트 [ 정수 -+ 3만정도 ]
        // short 변수명8 = 40000; // 오류 : short 4만을 저장할수 없다.
        short 변수명9 = 30000;         System.out.println("변수명9 출력 : " + 변수명9 );
        // 5.[*] int : 4바이트 [ 정수 -+ 20억정도 ]
            // 자료형 없는 정수 데이터 [ 자동으로 int형 ]
        // int 변수명10 = 3000000000;
        int 변수명11 = 2000000000;     System.out.println("변수명11 출력 : " + 변수명11 );
        // 6. long : 8바이트 [ 정수 -+ 20억이상 ]
            // long 변수명 = 숫자(int) L
        long 변수명12 = 300000000000L; System.out.println("변수명12 출력 : "+변수명12 );
        // 7. float : 4바이트 [ 실수 : 소수점 7자리 표시  ]
        float 변수명13 = 1.123456789F; System.out.println("변수명13 출력 : "+변수명13 );
        // 8.[*] double : 8바이트 [ 실수 : 소수점 16자리 표시 ]
        double 변수명14 = 1.123456789123456789;  System.out.println("변수명14 출력 : "+변수명14);

    } // main end
} // class end

/*
!!! 컴퓨터 0 혹은 1 만 알고 있다.
용량 단위
	0 , 1 : 2진수 , 비트 , 기계어[PC]
	-- 1비트 : 0 혹은 1			=> 1bit
	-- 1바이트 : 1비트 8칸  == 01010101 	=> 1byte
	-- 1킬로바이트 : 1024바이트		=> 1kbyte
	-- 1메가바이트 : 1024킬로바이트	=> 1mbyte
	-- 1기가바이트 : 1024메가바이트	=> 1gbyte


 */

/*
기본자료형[ 자료형 ]
- 논리 boolean
- 문자
	- char		    :문자1개	 ' '
	- String클래스	:문자열 " "
- 정수 [ 소수점이 없는 숫자 ]
	- byte 		    : +-100정도
	- short 		: +-3만정도
	- int 		    : +- 20억정도
	- long 		    : +-20억이상
- 실수 [ 소수점이 있는 숫자 ]
	- float		    : 소수점7자리
	- double  		: 소수점16자리

 */
