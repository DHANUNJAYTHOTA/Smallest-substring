import java.io.*;
import java.util.*;
class Substring
{
public static void main(String args[])
{
public static String getSmallest(String s, int k) {
        String smallest = ""; 
        if(s.length() > k)
        {
        for(int i = 0; i < (s.length() - k);i++)
        {
            if(i == 0)
            {
              
                smallest = s.substring(0,k);
               
            }
            
            String sm1 = s.substring(i+1,i+k+1);
          
            
            if(sm1.compareTo(smallest) < 0)
            {
                smallest = sm1;
                
            }
        else
        {
            smallest = s;
            
        }
        
        return smallest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        System.out.println(getSmallest(s));
        System.out.println(s.length();
        
    }
}
