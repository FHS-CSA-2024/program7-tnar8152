//import stuff here

//Your code here

//Paste console output below:
/*


*/
import java.util.Scanner;
public class programTn7
{
    public static void main (String [] args){
        // 1 schruteBuck = 20 klevins
        final double schruteBuck = 20;
        // 1 klevin 12 stanley nickels
        final double klevin = 12;
        // String noOfSchruteBucks = "7.17.9";
        //Enter schrute-bucks: 7; 
        //Enter klevins: 17;
        //Enter stanley-nickels: 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter schrute-bucks:");
        double noOfSchruteBucks = scanner.nextDouble();
        
        System.out.print("Enter klevins:");
        double noOfKlevins = scanner.nextDouble();
        System.out.print("Enter stanley-nickels:");
        double noOfstanleyNickels = scanner.nextDouble();
        
        double toklevin = noOfstanleyNickels / klevin;
    
        double convertValueSchruteBucks = (noOfKlevins+toklevin)/schruteBuck;
        
        double convertedValue= noOfSchruteBucks + convertValueSchruteBucks;
        double finalSchruteBucks =Math.round(convertedValue * 100.0) / 100.0;
        System.out.println("Decimal schrute-bucks  Value is  = $" + finalSchruteBucks);
        
    }
