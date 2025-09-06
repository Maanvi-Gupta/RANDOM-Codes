import java.util.*;
public class Main
{
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        if (reverse(s).equalsIgnoreCase(s))
        System.out.println("Yp");
        else
        System.out.println("nope");
    }
    public static String reverse(String s)
    {
        char ch[]=s.toCharArray(); //conversion to character array
        int l=0,r=ch.length-1; // left and right limits setup
        while(l<r) //while the index don't cross each other
        {
            char t=ch[l]; //temporary char storer
            ch[l]=ch[r]; // simple swap
            ch[r]=t;
            l++;
            r--;
        }
        return new String(ch);
}
}
