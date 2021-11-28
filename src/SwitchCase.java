//import java.util.Scanner;
//public class SwitchCase {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a character");
//        char chr = sc.next().toLowerCase().charAt(0);
//
//        switch(chr) {
//            case 'a':
//                System.out.println(("vowe;l"));
//                break;
//
//            case 'e':
//                System.out.println("voweel");
//                break;
//
//            case 'i':
//                System.out.println("voweel");
//                break;
//
//            case 'o':
//                System.out.println("voweel");
//                break;
//
//            case 'u':
//                System.out.println("voweel");
//                break;
//
//            default:
//
//            System.out.println("consonant");
//        }
//
//
//        }
//    }
//
//

import java.util.Scanner;
public class SwitchCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("menu driven program");
        System.out.println("-----------");
        System.out.println("Add Two numbers");
        System.out.println("Simple interest");
        System.out.println("palindrome");
        System.out.println("odd even");
        System.out.println("enter your choice");

        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("enter first number");
                int first = sc.nextInt();
                System.out.println("enter your second number");
                int second = sc.nextInt();
                System.out.println("sum is " + (first + second));
                break;

            case 2:
                System.out.println("enter principle");
                float principal = sc.nextInt();
                System.out.println("enter time ");
                float time = sc.nextInt();
                System.out.println("enter rate");
                float rate = sc.nextFloat();

                System.out.println("simple interest is "+ (principal*rate*time)/100);
                break;

            case 3:
                System.out.println("enter a two digit number");
                int num = sc.nextInt();

                int rem = num %10;
                int quot = num/10;
                int result = rem * 10 +quot;

                if(result == num )
                    System.out.println(num + "is a palindrome number");
                else
                    System.out.println(num+ "is not a palindrome");

                break;

            case 4:
                System.out.println("enter a number");
                int Num =  sc.nextInt();
                if(Num%2==0)
                    System.out.println("EVEN");
                else
                    System.out.println("odd");
                break;

            default:
                System.out.println("wrong choice");


        }
    }

}