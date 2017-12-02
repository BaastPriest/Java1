package JavaApplication4;

import java.util.Arrays;

public class JavaApplication4 
{
    public static void main(String[] args) 
    {
        int year = 2000;
        int dayNum = 300;
        int []daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31} ;

        int monthNum = 0;
        
        boolean isLeapYear = ((year%4 == 0)&&(year%100 !=0 || year%400 == 0));
        
        for(int days : daysInMonths)
        {
            if(days == 28 && isLeapYear)days++;  
            
            if(dayNum > days)
            {
                dayNum = dayNum - days;
                monthNum++;
            }    
        }     
        
         StringBuilder sb = new StringBuilder("");

         String []months = {"январь","февраль","март","апрель",
            "май","июнь", "июль", "август", "сентябрь", "октябрь", 
            "ноябрь","декабрь"};
         
         sb.append(months[monthNum]);
         sb.append(" ");
         sb.append(dayNum);

        System.out.println(sb);
    }
}
