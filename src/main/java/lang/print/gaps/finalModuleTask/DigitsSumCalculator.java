package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void main(String[] args) {
        calculateSum(1234);
    }

    public static void calculateSum(int number) {

            String sumNumbers1 = String.valueOf(number);
            char extractSimbol1 = sumNumbers1.charAt(0);
            String valueSimbol1 = String.valueOf(extractSimbol1);
            int sumSimbol1 = Integer.parseInt(valueSimbol1);
            String sumNumbers2 = String.valueOf(number);
            char extractSimbol2 = sumNumbers2.charAt(1);
            String valueSimbol2 = String.valueOf(extractSimbol1);
            int sumSimbol2 = Integer.parseInt(valueSimbol1);
            char extractSimbol3 = sumNumbers2.charAt(2);
            String valueSimbol3 = String.valueOf(extractSimbol1);
            int sumSimbol3 = Integer.parseInt(valueSimbol1);
            char extractSimbol4 = sumNumbers2.charAt(3);
            String valueSimbol4 = String.valueOf(extractSimbol1);
            int sumSimbol4 = Integer.parseInt(valueSimbol1);
            int sumSimbol5 = sumSimbol1 + sumSimbol2 + sumSimbol3 + sumSimbol4;
            System.out.println(sumSimbol5);
    }
}
