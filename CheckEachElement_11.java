import java.util.*;
public class CheckEachElement_11
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] ar=new int [4];
        boolean flag=true;
        for(int i=0;i<4;i++)
        {
            ar[i]=sc.nextInt();
            if(ar[i]!=1 && ar[i]!=4)
            {
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("false");
        else
            System.out.println("true");
    }
}