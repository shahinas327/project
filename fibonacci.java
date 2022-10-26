import java.util.Scanner;
public class fibonacci
{
    public static int fibonacciRecursion(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if (n == 1 || n == 2)
        {
            return 1;
        }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }
    public static void main(String args[])
    {
        int fiblength;
	Scanner sc=new Scanner(System.in);
        System.out.println("enter the length ");
	fiblength=sc.nextInt();
	int[] num= new int[fiblength];
	num[0]=0;
	num[1]=1;
        for (int i = 2;i<fiblength;i++)
        {
	num[i]=num[i-1]+num[i-2];
	}
	System.out.println("fibonacci series");
	for(int i=0;i<fiblength; i++)
	{
            System.out.println(num[i]  + " ");
        }
    }
}