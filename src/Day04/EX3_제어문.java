package Day04;

public class EX3_제어문 { // c s
    public static void main(String[] args) { // m s

        // 제어문 [ IF : 만약에~ ]
            // 0.  ( 조건 ) 안에  조건이 true인 경우에만 다음코드 실행
            // 1. 형태
                // 1.  if( 조건 )  실행문;
                // 2.  if( 조건 ) { 실행문; 실행문; }
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

    } // m e
}  // c e
