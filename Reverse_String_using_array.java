public class Main
{
    public String reverse(String s)
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
        return new String(ch); //array to String
        
    }
    public static void main(String args[])
    {
                Main obj=new Main();
        System.out.println(obj.reverse("cutie"));
    }
}
