package StandardOfJava.CodingStar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArithmeticExpressions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input1 = scan.nextInt();
        int input2 = scan.nextInt();

        findExpressions(String.valueOf(input1), input2);
    }

    public static void findExpressions(String number, int target) {
        List<String> expressions = new ArrayList<>();
        generateExpressions(number, "", 0, 1, target, expressions);

        if (!(expressions.isEmpty())) {
            for (String expression : expressions) {
                System.out.println(expression);
            }
        } else {
            // 처리할 내용이 없을 때의 동작
        }
    }

    public static void generateExpressions(String number, String expression, int index, long current, int target, List<String> expressions) {
        if (index == number.length()) {
            if (current == target) {
                expressions.add(expression);
            }
            return;
        }

        for (int i = index; i < number.length(); i++) {
            String currentStr = number.substring(index, i + 1);
            long currentValue = Long.parseLong(currentStr);

            if (index == 0) {
                generateExpressions(number, expression + currentStr, i + 1, currentValue, target, expressions);
            } else {
                // 괄호를 포함하여 사칙연산 수식 생성
                generateExpressions(number, expression + "+" + currentStr, i + 1, current + currentValue, target, expressions);
                generateExpressions(number, expression + "-" + currentStr, i + 1, current - currentValue, target, expressions);
                generateExpressions(number, expression + "*" + currentStr, i + 1, current * currentValue, target, expressions);
                if (currentValue != 0) {
                    generateExpressions(number, expression + "/" + currentStr, i + 1, current / currentValue, target, expressions);
                }
            }

            // 숫자가 '0'일 때 루프를 종료하여 0으로 시작하는 연속된 수를 방지합니다.
            if (number.charAt(index) == '0') {
                break;
            }
        }
    }
}
