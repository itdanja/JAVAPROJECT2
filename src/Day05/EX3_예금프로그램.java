package Day05;

import java.util.Scanner;

public class EX3_예금프로그램 { // class s
    public static void main(String[] args) { // main s
        int 계좌번호 = 20221108; // int상자크기[4byte]의 '계좌번호'라는 이름으로 20221108 저장했다.
        int 비밀번호 = 1234;  // int상자크기[4byte]의 '비밀번호'라는 이름으로 1234 저장했다.
        int 예금액 = 0; // 최초 예금액은 0 원

        int 친구계좌번호 = 20221109;
        int 친구예금액 = 0;

        Scanner sc = new Scanner(System.in);
        while ( true ) { // 무한반복 시작
            System.out.println("========== 이젠 은행 메뉴 ==========");
            System.out.print(" 1.예금 2.출금 3.잔고확인 4.종료 5.이체  입력 >>>> : ");

            int 선택 = sc.nextInt();

            if( 선택 == 1 ) { // if 1 s
                System.out.println("==== 예금 화면 ====");
                System.out.print("계좌번호 : "); int 입력계좌 = sc.nextInt();
                if( 계좌번호 == 입력계좌 ){ // 만약에 계좌번호 와 입력받은 입력계좌와 같으면
                    System.out.print("예금액 : "); int 입력금액 = sc.nextInt();
                    예금액 = 예금액 + 입력금액;
                    System.out.println("안내] 입금이 완료 되었습니다,!! ");
                } // if e
                else{ // else s
                    System.out.println("안내] 계좌번호 일치 하지 않습니다. ");
                } // else e
            } // if 1 e

            else if( 선택 == 2 ) { // else if 2 s
                System.out.println("==== 출금 화면 ====");
                System.out.print("계좌번호 : "); int 입력계좌 = sc.nextInt();
                System.out.print("비밀번호 : "); int 입력비밀번호 = sc.nextInt();

                // 만약에 계좌번호와 입력한계좌와 같으면서 비밀번호 와 입력한비밀번호 가 같으면
                if( 계좌번호 == 입력계좌 && 비밀번호 == 입력비밀번호 ){ // if s
                    System.out.print("출금액 : "); int 입력금액 = sc.nextInt();
                    // 만약에 입력받은 금액보다 예금액이 더 적으면 출금불가
                    if( 예금액 < 입력금액  ){ // if s
                        System.out.println("안내] 예금액이 부족합니다. ");
                    }// if e
                    else{ // else s
                        예금액 = 예금액 - 입력금액;
                        System.out.println("안내] 출금 이 완료 되었습니다,!! ");
                    } // else e
                }else{ // else s
                    System.out.println("안내] 정보가 일치하지 않습니다.");
                } // else e

            } // else if 2 e

            else if( 선택 == 3 )   { // else if 3 s
                System.out.println("==== 잔고확인 화면 ====");
                System.out.print("계좌번호 : "); int 입력계좌 = sc.nextInt();
                System.out.print("비밀번호 : "); int 입력비밀번호 = sc.nextInt();

                if( 계좌번호 == 입력계좌 && 비밀번호 == 입력비밀번호 ){
                    System.out.println("잔고 : " + 예금액 ); // 변수출력
                }else{ // else s
                    System.out.println("안내] 정보가 일치하지 않습니다.");
                } // else e
            } // else if 3 e

            else if( 선택 == 4 )   { // else if 4 s
                System.out.println("==== 시스템종료합니다. ====");
                break; // 무한 반복 강제 종료
            } // else if 4 e

            else if( 선택 == 5 ){ //  else if 5 s
                System.out.println("========== 이체 ===========");
                System.out.print("계좌번호 : "); int 입력계좌 = sc.nextInt();
                System.out.print("비밀번호 : "); int 입력비밀번호 = sc.nextInt();
                if( 계좌번호 == 입력계좌 && 비밀번호 == 입력비밀번호 ){ // if s
                    System.out.print(" 이체할 계좌번호 : "); int 입력이체계좌 = sc.nextInt();
                    if( 친구계좌번호 == 입력이체계좌 ){ // if s
                        System.out.print(" 이체할 금액 : "); int 입력금액 = sc.nextInt();
                        if( 예금액 < 입력금액 ){ // if s
                            System.out.println("안내] 예금액이 부족합니다. ");
                        } // if e
                        else{ // else s
                            예금액 = 예금액 - 입력금액; // 본인 예금액 에서 입력한 금액 차감
                            친구예금액 = 친구예금액 + 입력금액; // 친구 예금액 에 입력한 금액 추가
                            System.out.println("안내] 이체가 완료 되었습니다. ");
                        } // else e
                    } // if e
                    else { // else s
                        System.out.println("안내] 없는 계좌번호 입니다. ");
                    } // else e
                } // if e
                else{ // else s
                    System.out.println("안내] 정보가 일치하지 않습니다. ");
                } // else e
            } // else if 5 end
        }  // 무한반복 끝
    } // main e
} // class e

/*
    예금프로그램
    - 전제조건 : 통장 1개  / 계좌번호 : 20221108 / 비밀번호 : 1234 / 예금액 : 0
    - 기능 :   1. 예금   2. 출금    3. 잔고확인     4. 종료

    1. 설계[준비물]
        1.출력 println()   2.입력 Scanner  3. 저장[변수] 3개 + 입력받은 값 \
    2. 순서도
        1. 기본 변수 선언한다[ 3개 ]
        ----------------------  무한 반복 while(true){ } ---------------
        2. 메뉴 출력한다.
        3. 메뉴 번호를 입력받는다.
        4. 입력받은 번호를 저장한다.
        5. 입력받은 값을 제어
            입력받은 값이 1 이면  [ '예금 화면' 출력  ]
            입력받은 값이 2 이면  [ '출금 화면' 출력  ]
            입력받은 값이 3 이면  [ '잔고확인 화면' 출력  ]
            입력받은 값이 4 이면  [ '시스템종료 합니다. ' 출력  ]
        ------------------------------------------------
 */

