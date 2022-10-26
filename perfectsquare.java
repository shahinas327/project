import java.util.Scanner;

public class perfectsquare
{
    public static void main(String[] args)
    {
        Scanner cs=new Scanner(System.in);
        int firstnumber,endnumber,i;
        System.out.println("Enter the First Number: ");
        firstnumber=cs.nextInt();
        System.out.println("Enter the last Number:");
        endnumber=cs.nextInt();
        System.out.println("Perfect square numbers between "+firstnumber+" and "+endnumber+"are:");
        for (i=firstnumber;i<=endnumber;i++)
        {
            double sqr=Math.sqrt(i);
            if(sqr-Math.floor(sqr)==0)
                System.out.println(i+" ");
        }
    }
}