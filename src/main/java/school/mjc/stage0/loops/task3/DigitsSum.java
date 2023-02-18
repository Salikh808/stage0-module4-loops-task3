package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int digit, sum = 0;
        while (t > 0) {
//finds the last digit of the given number
            digit = t % 10;
//adds last digit to the variable sum
            sum = sum + digit;
//removes the last digit from the number
            t = t / 10;
        }
    }
}