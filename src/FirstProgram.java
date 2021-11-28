import java.util.Scanner;
public class FirstProgram {
    public static void main(String[]args){
        //
        Scanner sc = new Scanner(System.in);
        //step1 representation
        int first;
        int second;
        int result;


        //step 2 input
        System.out.print("Enter first number");
        first = sc.nextInt();
        System.out.print("eneter second number");
        second = sc.nextInt();

        //step 3 algorithm
        result = first + second;

        //step 4 output
        System.out.print("sum is" + result);

    }

}
