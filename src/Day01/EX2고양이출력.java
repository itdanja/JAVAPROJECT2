package Day01; // 1. 패키지[폴더] 명

public class EX2고양이출력 { // 2. class start
    public static void main(String[] args) { // 3.main start
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__) |"); // | : 시프트+원화기호
    } // main end
} // class end


/*
    결과물
        \    /\
         )  ( ')
        (  /  )
         \(__)|
 */
/*
    문자열 출력 : " " 큰따옴표 안에 있는 문자만 가능
    이스케이프[ 제어 / 기능 ]문자
            \   : 엔터 위에 원화기호
            \\  : \ 출력
            \"  : " 출력
 */
