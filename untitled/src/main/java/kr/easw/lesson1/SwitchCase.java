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
        // month를 기준으로 switch문을 사용합니다.
        // 보통 switch 문에서 break는 거의 필수로 사용되나, return문을 통해 반환을 한다면
        //  코드 플로우가 강제로 중단되어 값을 반환하기 때문에, break와 비슷한 효과를 내게 됩니다.
        switch (month) {
            // 1,3,5,7,8,10,12월 중 하나에 해당한다면 31을 반환합니다.
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            // 2월이라면 28을 반환합니다.
            case 2:
                return 28;
            // 4, 6, 9, 11월 중 하나에 해당한다면 30을 반환합니다.
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            // 만약 모두 해당되지 않는다면, -1을 반환합니다.
            default:
                return -1;
        }
    }
}
