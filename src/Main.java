/*
 * Fizz Buzz:
 * Write a program that prints the numbers from 1 to 100.
 * For multiples of 3 print “Fizz” instead of the number.
 * For the multiples of five print “Buzz”.
 * For numbers which are multiples of both 3 and 5 print “FizzBuzz”.
 */

public class Main {
    public static void main(String args[]){
        boolean found;
        String msg = "";

        for (int i = 1; i <= 100; i++) {
            found = false;
            msg = "";
            
            if ((i % 3) == 0) {
                msg = "Fizz";
                found = true;
            }

            if ((i % 5) == 0) {
                msg += "Buzz";
                found = true;
            }

            if (found)
                System.out.println(msg);
            else
                System.out.println(i);
        }
    }
}
