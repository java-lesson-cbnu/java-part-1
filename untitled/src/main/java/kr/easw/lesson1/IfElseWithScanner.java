package kr.easw.lesson1;

import java.io.InputStream;

public class IfElseWithScanner {

    public static void main(String[] args) {
        int number = parseNextNumber(System.in);
        System.out.println("입력한 숫자는 " + number + "입니다.");
        if (isOdd(number)) {
            System.out.println("입력한 숫자는 홀수입니다.");
        } else {
            System.out.println("입력한 숫자는 짝수입니다.");
        }
    }

    /**
     * 해당 메서드는 다음과 같은 역할을 가져야 합니다 :
     * <p>
     * 콘솔에서 입력값을 받고, 해당 입력 값을 숫자로 반환해야 합니다.
     *
     * @param inputStream 콘솔의 InputStream
     * @return 사용자가 콘솔에서 입력한 숫자
     */
    public static int parseNextNumber(InputStream inputStream) {
        throw new RuntimeException("이 코드 라인을 지우고, 이곳에서 작성하십시오.");
    }

    /**
     * 해당 메서드는 다음과 같은 역할을 가져야 합니다 :
     * <p>
     * 파라미터 (매개 변수)로 지급된 변수의 값을 확인하고, 홀수라면 true, 짝수라면 false를 반환해야 합니다.
     *
     * @param number 홀수 여부를 확인해야 할 숫자
     * @return 홀수 여부
     */
    private static boolean isOdd(int number) {
        throw new RuntimeException("이 코드 라인을 지우고, 이곳에서 작성하십시오.");
    }
}
