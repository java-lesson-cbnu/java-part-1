package kr.easw.lesson1;

public class IfElse {
    private static int TARGET_NUMBER = 1998872;

    private static boolean IS_ODD = false;

    public static void main(String[] args) {
        if (IS_ODD != isOdd(TARGET_NUMBER)) {
            System.out.println("오답입니다.");
        } else {
            System.out.println("정답입니다.");
        }
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