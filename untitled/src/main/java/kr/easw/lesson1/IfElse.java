package kr.easw.lesson1;

public class IfElse {
    private static int TARGET_NUMBER = 1998872;
    
    private static int IS_ODD = false;
    public static void main(String[] args) {
        if(IS_ODD != isOdd(TARGET_NUMBER)) {
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
    public static int isOdd(int target) {
        throw new RuntimeException("이 코드 라인을 지우고, 이곳에서 작성하십시오.");
    }
}
