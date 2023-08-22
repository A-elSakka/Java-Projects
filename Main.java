package javacourse;
import java.util.Scanner;
public class Main {
//    A program that takes the grade from the user and analyses it based on the American grading system
//    also the grades input is in int which is from 0-100 
//    Making the class to calc based on the user input
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // User Input
        System.out.println("Please enter the mark from [0-100] that you want to calculate based on the American grading system [A - A+ - A+ - A- and less]");
        int inpt = in.nextInt();    
        if (inpt < 0 || inpt > 100 ){
            System.out.println("Invalid input. Please try again.");
    }else {
            String grade = calcmrk(inpt);
            System.out.println("Your grade equals = "+grade);
    }
} 
        
    
    public static String calcmrk(int mark){
        if (mark >= 95){
            return "A+";
        }else if (mark <= 89 && mark >= 85) {
            return "A";
        }else if (mark <= 84 && mark >=80) {
            return "A-";
        }else if(mark <= 79 && mark >= 75){
            return "B+";
        }else if (mark <= 74 && mark >= 70){
            return "B";
        }else if (mark <=69 && mark >= 65){
            return "C+";
        }else if (mark <=64 && mark >= 60){
            return "C";
        }else if (mark <=59 && mark >= 55){
            return "D+";
        }else if (mark <=54 && mark >= 50){
            return "D";
        }else if (mark <=49 && mark >= 40){
            return "E";
        }else {
            return "F for Failure.";
        }
    }
}
