package kr.easw.lesson1;

public class SwitchCase {
    public static void main(String[] args) {
        int month = IfElseWithScanner.parseNextNumber(System.in);
        int maxDate = getMaxDate(month);
        if (maxDate == -1) {
            System.out.println("유효하지 않은 달입니다.");
        } else {
            System.out.println(month + "월은 " + maxDate + "일입니다.");
        }
    }

    /**
     * 해당 메서드는 다음과 같은 역할을 가져야 합니다 :
     * <p>
     * 콘솔에서 입력값을 받고, 입력된 달의 날 수를 반환합니다.
     * 2월의 경우, 28일이라고 가정합니다.
     * 만약 유효하지 않은 달일 경우, -1를 반환합니다.
     *
     * @param month - 날 수를 알아볼 달
     * @return 해당 달의 날 수
     */
    public static int getMaxDate(int month) {
        switch (month) {
            // 이곳부터 작성하십시오.
            default:
                return -1;
        }
    }
}
