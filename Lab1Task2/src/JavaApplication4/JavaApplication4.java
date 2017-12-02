package JavaApplication4;

import java.util.Arrays;

public class JavaApplication4 
{
    public static void main(String[] args) 
    {
       
        int year = 2017;
        int dayNum = 4;
        int []daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31} ;
        StringBuilder sb = new StringBuilder("");
        String []months = {"январь","февраль","март","апрель",
            "май","июнь", "июль", "август", "сентябрь", "октябрь", 
            "ноябрь","декабрь"};
        int monthNum = 0;
        boolean isLeapYear = ((year%4==0)&&(year%100!=0||year%400==0));
        for(int days : daysInMonths)
        {
            if(isLeapYear = true)days++;  
            
        }     
        System.out.println(days, monthNum);
    }
}
