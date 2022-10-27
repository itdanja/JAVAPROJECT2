package Day02;

public class EX2연산문제 { // class s
    public static void main(String[] args) { // main s
        System.out.println("문제1 3753 홀수 판단 : " + ( 3753 % 2 == 1 ) );
        System.out.println("문제2 2056 짝수 판단 : " + ( 2056 % 2 == 0 ) );
        System.out.println("문제3 4872 7배수 판단 : " + ( 4872 % 7 == 0 ));
        System.out.println("문제4 7792 3배수 판단 : " + ( 7792 % 3 == 0 ) );
    } // main e
} // class e
/*
    문제
        - 1.  3753 숫자가 홀수이면     true    짝수이면    false 출력
        - 2.  2056 숫자가 짝수이면     true    홀수이면    false 출력
        - 3.  4872 숫자가 7배수이면    true    아니면     false 출력
        - 4.  7792 숫자가 3배수이면    true    아니면     false 출력
        - 5.  356789 숫자[돈] 지폐수별 출력
            출력 예시 )  십만원:3장  , 만원:5장 , 천원:6장
 */
/*
        홀/짝 구하기 : 어떤 수 의 나누기 2를 했을때 나머지가 0 이면 짝수 / 1이면 홀수
            홀수 : 값 % 2 == 1     //  짝수 : 값 % 2 == 0
        배수 구하기 : 값 의 수 을 나누기 했을때 나머지가 0 이면  값 는 수 의 배수
            배수 : 값 % 수 == 0     값 는 그 수 의 배수이다

 */