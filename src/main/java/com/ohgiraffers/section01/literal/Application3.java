package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args) {


        // 문자열 합치기 결과를 예측하고 사용할 수 있다.
        // 1. 두 개의 문자열 합치기
        System.out.println("=========== 두 개의 문자열 합치기 ============");
        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println("9" + "9");


        // 2. 세 개의 문자열 합치기
        System.out.println("=============== 세 개의 문자열 합치기 ==============");
        System.out.println(9 + 9 + "9");     //189
        System.out.println(9 + "9" + 9);     //999
        System.out.println("9" + 9 + 9);     //999 앞 문자를 따라가기 때문에 뒤에도 다 문자로 됨

        System.out.println("9" + (9 + 9));   //918

        System.out.println("10과 20 의 합 : " + (18 + 20));
        System.out.println("10과 20 의 차 : " + (18 - 20));
        System.out.println("10과 20 의 곱 : " + (18 * 20));
        System.out.println("10과 20 의 나누기 한 몫 : " + (18 / 20));
        System.out.println("10과 20 의 나누기 한 나머지 : " + (18 % 20));

        System.out.println("기차");
        System.out.println("기차" + "칙칙폭폭");
        System.out.println("기차" + 123 + 45 + "출발");
        System.out.println("기차" + (123 + 45) + "출발");    // 괄호치면 먼저 계산 됨 *뒤에 있어도 숫자로 인식함*
        System.out.println(123 + 45 + "기차" + "출발");








    }
}
