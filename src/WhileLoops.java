//public class WhileLoops {
//    public static void main(String[] args) {
//        int counter = 1;
//
//        while(counter<=10){
//            System.out.println("hello world"+ counter);
//            counter++;
//        }
//    }
//}publi

import java.util.Scanner;
public class WhileLoops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value ");
        int num = sc.nextInt();
        int sum = 0;
        int first;
        int last;


        while (num>0){
            first = num/10;
            last = num%10;
            sum = sum+last;
        }
        System.out.println("addition"+ sum);

    }
}



