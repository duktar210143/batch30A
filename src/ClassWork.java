//import java.util.Scanner;
//public class ClassWork {
//    /* take values of length and breadth of a rectangle from user and check if it is square or not *\
//     */
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int length;
//        int breadth;
//
//        System.out.print("enter the value of  length");
//        length = sc.nextInt();
//
//        System.out.print("enter the value of breadth");
//        breadth = sc.nextInt();
//
//        if(length==breadth){
//            System.out.println("the given length and breadth of a rectangle is a square");
//
//        }
//        else{
//            System.out.println("the given length and breadth of a rectangle is not a square");
//        }
//
//
//
//    }
//}



/*QN2 print two int values from a user and print the greatest value among the two*/
//
//import java.util.Scanner;
//public class ClassWork{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int first_number;
//        int second_number;
//
//        /* requesting values from user */
//
//        System.out.print("enter the first number");
//        first_number = sc.nextInt();
//
//        System.out.print("enter the second number");
//        second_number = sc.nextInt();
//
//        if(first_number>second_number){
//            System.out.println(first_number +"is the greatest among the two number you entered");
//        }
//
//       else{
//
//           System.out.println(second_number +"is the greatest number among the two numbers you entered");
//       }
//
//
//    }
//
//}

/* Qn3 A shop will give discount of 10% if the cost of purchased quantity is more than
1000
ask user for quantity
suppose, one unit cost 100
judge and print total cost of user
 */

//import java.util.Scanner;
//
//public class ClassWork{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int enter_quantity;
//        int after_discount;
//
//        System.out.print("input the quantity");
//        enter_quantity = sc.nextInt();
////        algorithm
//
//        if(enter_quantity*100>1000) {
//            after_discount = (enter_quantity*100) - ((enter_quantity * 100) / 10);
//            System.out.println("after discount the total cost is " + after_discount);
//        }
//        else{
//            System.out.println(enter_quantity*100);
//        }
//
//
//
//    }
//}

//qn4 4. A school has following rules for grading system:
// a. Below 25 - F
// b. 25 to 45 - E
// c. 45 to 50 - D
// d. 50 to 60 - C
// e. 60 to 80 - B
// f. Above 80 - A
// Ask user to enter marks and print the corresponding grade.

//import java.util.Scanner;
//public class ClassWork{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        /* representation*/
//        int total_marks;
//        /*input*/
//        System.out.print("enter the acquired marks of a student");
//        total_marks = sc.nextInt();
//
//        if(total_marks<=25){
//            System.out.println("the student acquired"+"F"+"needs to try harder");
//        }
//        else if(total_marks>25 && total_marks<45){
//            System.out.println("the student acquired "+ "E"+"still needs improvement");
//
//        }
//        else if(total_marks>=45 && total_marks<50){
//            System.out.println("the student acquired "+ " " + "D" + " work harder");
//        }
//        else if(total_marks>=50 && total_marks<60){
//            System.out.println("the student acquired " + " " +"c" + "GOOD");
//        }
//        else if(total_marks>=60 && total_marks<80){
//            System.out.println("the student acquired " + " " +"B" + "Very GOOD");
//        }
//        else if(total_marks>=80 && total_marks<100){
//            System.out.println("the student acquired " + " " +"B" +" "+ "excellent");
//        }
//
//
//    }
//}

//qn5 Take input of age of 3 people by user and determine oldest and youngest among them?

//import java.util.Scanner;
//
//public class ClassWork{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        /* representation */
//        int first_person;
//        int second_person;
//        int third_person;
//
//        /*input*/
//        System.out.print("enter the age of the first person");
//        first_person = sc.nextInt();
//        System.out.print("enter the age of the second person");
//        second_person = sc.nextInt();
//        System.out.print("enter the age of the third person");
//        third_person = sc.nextInt();
//
//        /* Algorithm */
//        if(first_person>second_person && first_person>third_person){
//            System.out.println("the oldest among the three is the first_person");
//        }
//        else if(first_person<second_person && first_person<third_person){
//            System.out.println("the smallest among the three is the first_person");
//        }
//        if(second_person>first_person && second_person>third_person){
//            System.out.println("the oldest among the three is the second_person");
//        }
//        else if(second_person<second_person && second_person<third_person){
//            System.out.println("the smallest among the three is the second_person");
//        }
//        if(third_person>second_person && third_person>second_person){
//            System.out.println("the oldest among the three is the third_person");
//        }
//        else /*(third_person<first_person && third_person<second_person)*/{
//            System.out.println("the smallest among the three is the third_person");
//        }
//
//    }
//
//}

//6. A student will not be allowed to sit in exam if his/her attendance is less than 75%.
// Take following input from user Number of classes held Number of classes attended.
// And print percentage of class attended Is student is allowed to sit in exam or not.
//
//import java.util.Scanner;
//
//public class ClassWork{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int classes_held;
//        int classes_attended;
//
//        System.out.print("enter the total number of school opening days");
//        classes_held = sc.nextInt();
//        System.out.print("enter the total number of school days attended by student");
//        classes_attended= sc.nextInt();
//
//        if(classes_attended<(classes_held*75)/100){
//            System.out.println("the student is not allowed to attend the exams");
//        }
//        else{
//            System.out.println("the student is allowed to attend the exams");
//
//        }
//
//    }
//}

//qn7 Modify the above question to allow student to sit if he/she has medical cause.
// Ask user if he/she has medical cause or not (‘Y' or 'N’) and print accordingly.
//
//import java.util.Scanner;
//
//public class ClassWork {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Number of classes held: ");
//        int classes_held = sc.nextInt();
//
//        System.out.print("Number of classes attended: ");
//        int classes_attended = sc.nextInt();
//
//        if (classes_attended > classes_held) {
//            System.out.println("You are joking right");
//            System.exit(0);
//        }
//
//        float result = (classes_attended * 100) / classes_held;
//        String output = "Wrong input";
//
//        if (result >= 75) {
//            output = "You are allowed to take exam with " + result;
//        }
//        if (result < 75) {
//            output = "You are not allowed to take exam with " + result;
//        }
//
//        System.out.println(output);
//
//        System.out.print("Did you have a medical cause? (Y/N): ");
//        String yn = sc.next().toUpperCase();
//        if (yn.length() > 1) {
//            System.out.println("You Should have typed Y or N.");
//        }
//        if (yn.contains("Y")) {
//            System.out.println("Ok you are allowed to sit in the exam");
//        }
//        if (yn.contains("N")) {
//            System.out.println("You are still not allowed to sit in the exam");
//        }
//
//    }
//}




