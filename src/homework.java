import java.util.Scanner;
public class homework {
    public static void main(String[] args) {
        double finalgrade = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("what is your grade in the psychometry?");
        double grade1 = s.nextInt();
        System.out.println("what is your grade in the bagrut?");
        double grade2 = s.nextInt();
        System.out.println("what is your grade in english?");
        double grade3 = s.nextInt();
        System.out.println("what is your grade in the quantitative part?");
        double grade4 = s.nextInt();
        if(grade1 >= 700 & grade3 >= 120 & grade4 >= 145)
            System.out.println("you are accepted to liliput college!");
        else if(grade2 >= 102)
            System.out.println("you are accepted to liliput college!");
        else
            finalgrade = (grade1*0.8) + (grade2/1.2);
            System.out.println("your final grade is " + finalgrade);
            if(finalgrade >= 600)
                System.out.println("you are accepted to liliput college!");
            else
                System.out.println("your grade is below the requirement, sorry!");

    }
}