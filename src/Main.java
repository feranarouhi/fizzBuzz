import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //divisible by 5 = fizz
        //divisible by 3 = buzz
        //divisible by 3 && 5 = fizzBuzz
        //divisible by 2 = same number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter A Number:");
        int number = scanner.nextInt();

        //FIRST WAY TO CODE

        //if (number % 5 == 0 && number % 3 == 0)
        //    System.out.println("FizzBuzz");
        //else if (number % 3 == 0)
        //    System.out.println("Buzz");
        //else if ( number % 5 == 0 )
        //    System.out.println("Fizz");
        //else
        //    System.out.println(number);

        // 2ND WAY TO CODE

        if (number % 5 == 0) {
            if (number % 3 == 0)
                System.out.println("fizzBuzz");
            else System.out.println("fizz");
        }
        else if (number % 3 ==0)
            System.out.println("buzz");
        else System.out.println(number);



    }
}