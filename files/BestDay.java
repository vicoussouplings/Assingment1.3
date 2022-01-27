
/*CS 1105 - Assingment 01
Olumayowa Oluwasanmi - B00785929
Brief description: This program identifies which of the three stages
the rider was fastest by calculating the average speed of each stage.
 */

//Importing the scanner
import java.util.Scanner;

//Declare the class
public class BestDay {
    public static void main(String[] args) {

        //Declare the scanner
        Scanner kb = new Scanner(System.in);

        //Rider's name
        String riderName = kb.nextLine();
        

        //STAGE 1
        int stage1Distance = kb.nextInt();
        double stage1Time = kb.nextDouble();

        //STAGE 2
        int stage2Distance = kb.nextInt();
        double stage2Time = kb.nextDouble();

        //STAGE 3
        int stage3Distance = kb.nextInt();
        double stage3Time = kb.nextDouble();

        //Calculate the average speed of 3 stages using distance and time

        //Average of Stage 1
        double averageSpeedStage1;
        averageSpeedStage1 = stage1Distance / stage1Time;

        //Average of Stage 2
        double averageSpeedStage2;
        averageSpeedStage2 = stage2Distance / stage2Time;

        //Average of Stage 3
        double averageSpeedStage3;
        averageSpeedStage3 = stage3Distance / stage3Time;

        //Find the fastest speed w/ a mathematical operator and print the fastest stage
        double fastestStage = Math.max(averageSpeedStage1,averageSpeedStage2);
        double fastestStage2 = Math.max(fastestStage, averageSpeedStage3);

        //Print out the fastest stage
        System.out.println("\"" + riderName + "\"" + " " +  "fastest speed among the three stages was:" + " " + Math.max(fastestStage, fastestStage2) +  "km/h");

    }
}