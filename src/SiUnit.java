//import java.util.Scanner;
//public class SiUnit {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        float principal;
//        float rate;
//        float time;
//        float Si;
//
//        //input
//        System.out.print("input principal");
//        principal = sc.nextFloat();
//        System.out.print("input rate ");
//        rate = sc.nextFloat();
//        System.out.print("input time");
//        time = sc.nextFloat();
//
//        //algorithm
//        Si = (principal * time * rate)/100;
//
//        //output
//        System.out.println("the simple interst is" + Si);
//
//
//
//    }
//
//}

//import java.util.Scanner;
//
//import static java.lang.Character.toLowerCase;
//
//
//public class SiUnit{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter a character");
//        char chr = toLowerCase(sc.next().charAt(0));
//
//        if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o'|| chr=='u'){
//            System.out.print("character" + " " + chr + " is a vowel");
//        }
//        else{
//            System.out.print("character" + " " + chr + " is a consonant");
//        }
//    }
//}
import java.util.Scanner;
public class SiUnit{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int num = sc.nextInt();

        int rem = num %10;
        int quot = num/10;
        int result = rem * 10 +quot;

        if(result == num )
            System.out.println(num + "is a palindrome number");
        else
            System.out.println(num+ "is not a palindrome");
    }
}