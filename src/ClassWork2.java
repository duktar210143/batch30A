//write a program to input basic salary of an employee and calculate its gross salary according to the following

//import java.util.Scanner;
//public class ClassWork2 {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        int Salary ;
//        int Total_Salary;
//
//        System.out.print("enter the salary of the employee");
//        Salary = sc.nextInt();
//
//        if(Salary<=10000) {
//            Total_Salary = Salary + (20 * Salary) / 100 + (80 * Salary) / 100;
//            System.out.println(Total_Salary);
//        }
//        else if   (Salary <= 2000) {
//            Total_Salary = Salary + (25 * Salary) / 100 + (90 * Salary) / 100;
//            System.out.println(Total_Salary);
//        }
//
//        else {
//            Total_Salary = Salary + (30 * Salary) / 100 + (95 * Salary) / 100;
//            System.out.println(Total_Salary);
//
//        }
//    }
//}

import java.util.Scanner;

public class  ClassWork2{
    public static void main(String []args) {
        double units;
        double charge = 0;
        double additional;
        double total;
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter Electricity unit");
        units = ss.nextDouble(); // get units from user
        if (units > 0 && units <= 50) {
            charge = units * 0.50; // calculate charge
        }
        else if (units > 50 && units <= 150) {
            charge = units * 0.75;
        }
        else if (units > 150 && units <= 250) {
            charge = units * 1.20;
        }
        else if (units > 250) {
            charge = units * 1.50;
        }
        additional = charge * 0.2; // calculate additional charge
        total = charge + additional; // calculate total amount
        System.out.println("total electricity bill=" + total);

    }

}