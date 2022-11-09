import java.util.Scanner;

public class QuizProject {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int score = 0;

        System.out.println("**********Hello Friend. We are organize a Quiz game for you.***********");

        System.out.println("If you intrested play this game. So write y/n ");
        String options = scan.nextLine();

        switch(options){
            case "y": System.out.println("Welcome Frieds");

            System.out.println("Question.1-\t Which of the following is used in pencils?");
            System.out.println("  (a) \t Graphite");
            System.out.println("  (b) \t Silicon");
            System.out.println("  (c) \t Iron");
            System.out.println("  (d) \t Phosphorous");
            String ans1 = scan.nextLine();
            if ( ans1.equals("a")){
                System.out.println("right answer");
                score += 2;
            }
            else{
                System.out.println("Wrong answer");
            }

            System.out.println("Question.2-\t Chemical formula for water is?");
            System.out.println("  (a) \t NaAlO2");
            System.out.println("  (b) \t H2O");
            System.out.println("  (c) \t Al2O3");
            System.out.println("  (d) \t CaSiO3");
            String ans2 = scan.nextLine();
            if ( ans2.equals("b")){
                System.out.println("right answer");
                score += 2;
            }
            else{
                System.out.println("Wrong answer");
            }

            System.out.println("Question.3-\t The gas usually filled in the electric bulb is?");
            System.out.println("  (a) \t Nitrogen");
            System.out.println("  (b) \t Hydrogen");
            System.out.println("  (c) \t Carbon Dioxide");
            System.out.println("  (d) \t Oxygen");
            String ans3 = scan.nextLine();
            if ( ans3.equals("a")){
                System.out.println("right answer");
                score += 2;
            }
            else{
                System.out.println("Wrong answer");
            }

            System.out.println("Question.4-\t Pascal is the unit for?");
            System.out.println("  (a) \t Conductivity");
            System.out.println("  (b) \t Frequency");
            System.out.println("  (c) \t Thrust");
            System.out.println("  (d) \t Pressure");
            String ans4 = scan.nextLine();
            if ( ans4.equals("d")){
                System.out.println("right answer");
                score += 2;
            }
            else{
                System.out.println("Wrong answer");
            }

            System.out.println("Question.5-\t The ratio of width of our National flag to its length is?");
            System.out.println("  (a) \t 2:4");
            System.out.println("  (b) \t 3:5");
            System.out.println("  (c) \t 2:3");
            System.out.println("  (d) \t 3:4");
            String ans5 = scan.nextLine();
            if ( ans5.equals("c")){
                System.out.println("right answer");
                score += 2;
            }
            else{
                System.out.println("Wrong answer");
            }

            System.out.println("Your final score is: " + score + "/10" + "\nCongratulations");

            break;

            case "n": System.out.println("Sorry!!!"); 
            break;
        }
        
        scan.close();
    }
}
