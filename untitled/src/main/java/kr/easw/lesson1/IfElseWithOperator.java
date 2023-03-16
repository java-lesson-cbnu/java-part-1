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
     * <p>
     *
     * @param first  - 사용자가 입력한 첫번째 숫자
     * @param second - 사용자가 입력한 두번째 숫자
     * @return 더 큰 숫자
     */
    public static int getLargestNumber(int first, int second) {
        // 첫번째 파라미터가 2번쨰 파라미터보다 큰지 비교합니다.
        if (first > second) {
            // 만약 첫번쨰 파라미터가 더 크다면, 첫번째 파라미터를 반환합니다.
            return first;
        } else {
            // 두번째 파라미터가 더 크다면, 두번쨰 파라미터를 반환합니다.
            return second;
        }
        // 다음과 같이 삼항 연산자를 통해 축약할 수도 있습니다.
        // return (first > second) ? first : second;
    }
}
