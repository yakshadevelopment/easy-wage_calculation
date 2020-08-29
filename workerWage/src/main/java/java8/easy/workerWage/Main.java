package java8.easy.workerWage;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	public static String convertToTwoDecimalPlace(double value)
	{
		DecimalFormat decimalFormat=new DecimalFormat("0.00");
		return decimalFormat.format(value);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the number of workers in the site");
       int workersNumber=Integer.parseInt(scanner.nextLine());
       if(workersNumber<5)
       {
    	   System.out.println("Number of worker below the range");
    	   System.exit(0);
       }
       int count=0;
       double totalAmount=0.00;
       while(count<workersNumber)
       {
    	  System.out.println("Enter Wage:");
    	  double wage=Double.parseDouble(scanner.nextLine());
    	  if(wage>=100.00 && wage <=250.00)
    	  {
    		  totalAmount=totalAmount+wage;
    		  count++;
    	  }
    	  else
    	  {
    		  System.out.println("Sorry wrong wage figure...");
    	  }
       }
       String totalWage=convertToTwoDecimalPlace(totalAmount);
       double value=totalAmount/(double)workersNumber;
       String averageWage=convertToTwoDecimalPlace(value);
       System.out.println("The Total Wage paid "+totalWage);
       System.out.println("The Average Wage paid "+averageWage);
	}
}