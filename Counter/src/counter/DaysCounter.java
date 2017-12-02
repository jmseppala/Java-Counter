

package counter;

/**
*  DaysCounter is a class that calculates days between two dates given by user. 
   Also percentage of year and weeks are printed.
   @author Jari-Matti Seppälä
   @version 0.1
*/

import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.text.NumberFormat;

public class DaysCounter 
{

    public static void main(String[] args)               
    {

        Scanner reader = new Scanner(System.in);

        System.out.println("Please give current date as dd/mm/yyyy");
        String currentTime = reader.nextLine();

        System.out.println("Please also give later date as dd/mm/yyyy");
        String laterTime = reader.nextLine();

        try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        // Convert user input to dates
        Date current = sdf.parse(currentTime);        
        Date later = sdf.parse(laterTime); 
        
        // Initialize calendar
        Calendar calendar=Calendar.getInstance();  
        
        // Current date formatted for printing
        DateFormat today = DateFormat.         
        getDateInstance(DateFormat.SHORT); 
        
        // Later - current difference
        double difference = (double) ((later.getTime() - 
        current.getTime())/(1000*60*60*24));
        
        // Move days to daysPrint variable
        int daysPrint = (int)difference;
        
        // Calculate percentage of year and move that to percentagePrint variable
        double percentagePrint = difference/365;
         
        // Weeks
        double weeksPrint = difference/7;
        
        // Decimals for printing percentage
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(2);
        
        // Printings
        System.out.println("Hello! Current date is "    
        + today.format(calendar.getTime()));

        System.out.println("According to dates submitted by you there are " + daysPrint +
        " days left to that later date!");
    
        System.out.println("Percentage of year " + numberFormat.format(percentagePrint*100));
       
        System.out.println("Weeks " + numberFormat.format(weeksPrint));
           
}
        // Catch exception
       catch (ParseException e)                                
  {
       System.out.println("You gave at least one of two dates as a wrong format!"
       + " Please try again using format dd/mm/yyyy");   
  }
       
  }
 
}


    







