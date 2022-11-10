package Day06;

import java.util.Scanner;

public class EX1_키오스크 { // c s
    public static void main(String[] args) { // m s
        // 1. 준비물 : 변수   // 변수선언 : 자료형 변수명 = 값
        int 콜라재고 = 10;      int 콜라장바구니 = 0;
        int 환타재고 = 10;      int 환타장바구니 = 0;
        int 사이다재고 = 10;    int 사이다장바구니 = 0;
        Scanner sc = new Scanner(System.in); // 입력객체[입력변수]선언
        // 2. 프로그램 반복실행[무한루프]
        while (true) { // while s
            System.out.println("--------- ezen console kiosk ---------");
            System.out.print("[0.관리자모드] 1.콜라(300원) 2.환타(400원) 3.사이다(500원) 4.결제 ");
            int 선택 = sc.nextInt();
            if( 선택 == 1 ) { // if 1 s
                // 1.만약에 재고가 없으면 구매불가
                if( 콜라재고 == 0 ){
                    System.out.println("--[알림] 콜라 재고가 부족합니다.");
                }else{//1.만약에 재고가 있으면
                    System.out.println("--[알림] 콜라 1개 장바구니 담았습니다. ");
                    콜라재고 = 콜라재고 - 1; // 콜라재고  1 감소
                    콜라장바구니 = 콜라장바구니 + 1 ; // 콜라장바구니 1 증가
                }
            }// if 1 e
            else if( 선택 == 2 ){ // if 2 s

                // 1. 만약에 재고가 없으면 구매불가
                if( 환타재고 == 0 ){ // 환타재고 변수의 값이 0 과 같으면
                    System.out.println("--[알림] 환타 재고 부족합니다.");
                }else{ // 환타재고 변수의 값이 0 이 아니면
                    System.out.println("--[알림] 환타 1개 장바구니 담았습니다.");
                    환타재고 = 환타재고 - 1;
                    환타장바구니 = 환타장바구니 + 1;
                }

            } // if 2 e
            else if( 선택 == 3 ){

                // 1.만약에 재고가 없으면
                if( 사이다재고 == 0 ){ //만약에 사이다재고 변수의 값이 0 과 같으면
                    System.out.println("--[알림] 사이다 재고 부족합니다. ");
                }else{
                    System.out.println("--[알림] 사이다 1개 장바구니 담았습니다. ");
                    사이다재고 = 사이다재고 -1;       // 재고 1 감소
                    사이다장바구니 = 사이다장바구니 + 1 ; // 장바구니 1 증가
                }

            }
            else if( 선택 == 4 ){ // 결제
                // 1. 모든 장바구니의 이름과 개수 금액 , 총금액
                System.out.println(">>>>>>>>>>> 구매 목록 ");
                System.out.println("제품명\t수량\t금액"); 	// 	\t : 5칸 들여쓰기
                if( 콜라장바구니 != 0 ) { // 만약에 콜라 장바구니에 콜라가 1개 이상 담겨져 있으면
                    System.out.println("콜라\t"+콜라장바구니+"\t\t"+(콜라장바구니*300)+"원" );      // 변수는 " " 처리 안됌...
                }
                if( 환타장바구니 != 0 ){  // 만약에 환타 장바구니에 환타가 1개 이상 담겨져 있으면
                    System.out.println("환타\t"+환타장바구니+"\t\t"+(환타장바구니*400)+"원");
                }
                if( 사이다장바구니 != 0 ){  // 만약에 사이다 장바구니에 사이다가 1개 이상 담겨져 있으면
                    System.out.println("사이다\t"+사이다장바구니+"\t\t"+(사이다장바구니*500)+"원");
                }
                int 총금액 =  (콜라장바구니*300)   +  (환타장바구니*400)  +  (사이다장바구니*500) ;
                System.out.println(" 총 결제 예정 금액 : " + 총금액+"원" );

                //  * 결제 여부 확인 [ 1.결제 2.취소 ]
                    // 1.만약에 결제를 선택하면 금액 입력받는다.
                    // 2.입력받은 금액이 총금액보다 작으면 결제 실패 --> 초기 메뉴로
                System.out.println("-------------------------------------");
                System.out.println("1.결제 2.취소 ");
                int 선택2 = sc.nextInt();
                if( 선택2 == 1 ){
                    System.out.println("-- [알림] 금액 투여 해주세요 : ");
                    int 입력금액 = sc.nextInt();
                    if( 입력금액 < 총금액 ){   // 만약에 총금액이 입력받은 금액보다 크면
                        System.out.println("-- [알림] 금액이 부족합니다. ");
                        // * 취소했을때 장바구니에 있던 수량을 재고로 다시 이동
                        콜라재고 = 콜라재고 + 콜라장바구니;
                        콜라장바구니 = 0;
                        환타재고 = 환타재고 + 환타장바구니;
                        환타장바구니 = 0;
                        사이다재고 = 사이다재고 + 사이다장바구니;
                        사이다장바구니 = 0;
                    }else{ // 결제 성공했을때
                        System.out.println("-- [알림] 주문 완료! 감사합니다. 주문번호: A3-1 ");
                        System.out.println("-- [알림] 남은 금액 : " + (입력금액-총금액) );
                        콜라장바구니 = 0;
                        환타장바구니 = 0;
                        사이다장바구니 = 0;
                    }
                } // if end
                else if( 선택2 == 2 ){ // 취소
                    // * 취소했을때 장바구니에 있던 수량을 재고로 다시 이동
                    콜라재고 = 콜라재고 + 콜라장바구니;
                    콜라장바구니 = 0;
                    환타재고 = 환타재고 + 환타장바구니;
                    환타장바구니 = 0;
                    사이다재고 = 사이다재고 + 사이다장바구니;
                    사이다장바구니 = 0;
                } // else if end
            } // if 4 end
        } // while e
    } // m e
} // c e
/*
    키오스크 요구사항
        - 콜라(300) , 환타(400) , 사이다(500) 판매
        - 기본 재고 10개씩 _ 재고가 없으면 판매불가
        - 초기 메뉴 : [0.관리자모드] 1.콜라 2.환타 3.사이다 4.결제
            - 1. 콜라 선택하면 장바구니에 콜라 1개 담기
            - 2. 만약에 콜라 재고가 없으면 안내문구
            - 3. 환타/사이다 동일한코드
            - 4. 결제
                - 1. 현재 장바구니 상태 출력
                - 2. 결제 여부 확인 [ 결제 또는 취소 ]
                - 3. 결제선택하면 금액 입력받는다.
                    - 1. 장바구니에 총 금액보다 적으면 결제불가
                    - 2. 장바구니에 총 금액보다 크면 결제후 남은금액 출력 / 완료
                - 4. 초기 메뉴로 돌아가기

     [0.관리자모드]
        관리자 모드를 선택 했을때
        1. 비밀번호 입력받아서 비밀번호가 1234 이면
                관리자메뉴 표시 아니면 초기메뉴로 돌아간다.
        2. 관리자메뉴 [ 1.재고채우기 2.매출 3.종료 ]
            1. 재고채우기 선택했을때
                   1. 재고메뉴 [ 1.콜라 2.환타 3.사이다 4.종료]
                        * 1~3 선택시 수량을 입력받아 해당 제품의 재고에 더하기

            2. 매출 선택했을때
                - 제품별 판매량 누적 더하는 변수 3개 선언
                - 제품별 판매량 변수  * 금액 출력한다.
 */