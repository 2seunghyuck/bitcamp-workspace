// 주제: 메모리 크기에 따른 부동소수점의 크기

package com.eomcs.basic.ex03;

class Exam0340 {
    public static void main(String[] args) {
        
        // 4바이트 메모리에 부동소수점 저장하기
        System.out.println("1------------");
        System.out.println(999.9999f);
        System.out.println(999999.9f);
        System.out.println(9.999999f);

        // 4바이트 메모리는 최대 7자리 부동소수점을 저장할 수 있다.
        // 초과하는 경우 반올림 처리되거나 저장하지 않는다.
        System.out.println("2------------");
        System.out.println(999.99994f);
        System.out.println(9999999.4f);
        System.out.println(9.9999994f);
        // 메모리 크기를 넘는값은 반올림 처리되어 저장된다.
        System.out.println("3------------");
        System.out.println(987654321.1234567f);
        System.out.println(987654321123456.7f);
        System.out.println(9.876543211234567f);

        // 8바이트 메모리에 부동소수점 저장하기
        System.out.println("4------------");
        System.out.println(987654321.1234567);
        System.out.println(987654321123456.7);
        System.out.println(9.876543211234567);

        // 8바이트 메모리에는 최대 16자리의 부동소수점을 저장할 수 있다.
        // 초과하면 반올림 처리되거나 저장되지 않는다.
        System.out.println("5------------");
        System.out.println(987654321.123456789);
        System.out.println(98765432112345678.9);
        System.out.println(9.87654321123456789);

        // 유효자릿수
        // - 소수점을 제외한 숫자의 갯수
        // - 4바이트 메모리 - 최대 7자리
        // - 8바이트 메모리 - 최대 16자리
        // 초과하는 수는 반올림 처리되거나 버려진다.
        // 유효자릿수라 하더라도 100% 정확하지 않다.
        // IEEE 754 규격에 따라 2진수로 전환할 때 일부 값은 정확하게 변환되지 않는경우가있다.

        // 부동소수점의 일부는 정확하게 2진수로 변환할 수 없다.
        System.out.println("6------------");
        System.out.println(7 * 0.1);
    }
}
