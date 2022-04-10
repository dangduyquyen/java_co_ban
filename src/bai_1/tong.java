package bai_1;

import java.util.Scanner;
public class tong
{
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        String s = sr.nextLine();
  int ans=0;
  String t="";
        for(int i=0;i<s.length();i++) 
        { 
                    if(s.charAt(i)>='0' && s.charAt(i)<='9') 
                    {
                        t+=s.charAt(i);
                    }
                    else 
                    { 
                        if(t.length()>0)
                            ans+=Integer.parseInt(t);  
                            t=""; 
                    } 
            }
            if(t.length()>0)
            ans+=Integer.parseInt(t);  
            System.out.println(ans);
        }
}
