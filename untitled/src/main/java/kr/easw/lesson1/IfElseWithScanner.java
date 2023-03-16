package kr.easw.lesson1;

import java.io.InputStream;
import java.util.Scanner;

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
        // 주어진 InputStream 파라미터를 기준으로 새 Scanner 객체를 생성합니다.
        Scanner scanner = new Scanner(inputStream);
        // 다음 콘솔 입력을 가져옵니다.
        scanner.close();
        return scanner.nextInt();
        // 다음과 같은 코드로 축약도 가능합니다.
        // return new Scanner(inputStream).nextInt();
    }

    /**
     * 해당 메서드는 다음과 같은 역할을 가져야 합니다 :
     * <p>
     * 입력된 숫자가 홀수인지의 여부
     *
     * @param target - 대상 숫자
     * @return 홀수 여부
     */
    public static boolean isOdd(int target) {
        // 대상을 2로 나눠 남은 나머지가 0인지 확인합니다.
        if (target % 2 == 0) {
            // 만약 0이라면, odd(홀수)가 아니므로 false를 반환합니다.
            return false;
        } else {
            // 만약 0이 아니라면, odd임으로 true를 반환합니다.
            return true;
        }
        // 다음과 같은 코드로 축약도 가능합니다.
        // return target % 2 != 0;
    }
}
