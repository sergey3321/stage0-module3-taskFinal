package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int num = number;
        int reversed = 0;
            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
        }
        System.out.println(reversed);
    }
}


