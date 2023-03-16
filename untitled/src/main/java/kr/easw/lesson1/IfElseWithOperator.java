package kr.easw.lesson1;

public class IfElseWithOperator {
    public static void main(String[] args) {
        // 입력은 이전 실습에서 진행한 메서드를 사용합니다.
        int first = IfElseWithScanner.parseNextNumber(System.in);
        int second = IfElseWithScanner.parseNextNumber(System.in);
        System.out.println(first + "와 " + second + " 중 더 큰 숫자는 " + getLargestNumber(first, second) + "입니다.");
    }

    /**
     * 해당 메서드는 다음과 같은 역할을 가져야 합니다 :
     * 두 수를 입력받아, 더 큰 수를 반환해야 합니다.
     * <p>
     * @param first  - 사용자가 입력한 첫번째 숫자
     * @param second - 사용자가 입력한 두번째 숫자
     * @return 더 큰 숫자
     */
    public static int getLargestNumber(int first, int second) {
        throw new RuntimeException("이 코드 라인을 지우고, 이곳에서 작성하십시오.");
    }
}
