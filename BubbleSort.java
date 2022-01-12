import java.util.Scanner;
public class BubbleSort
{
   public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size:");
       int n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("Elements:");
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       for(int i=0;i<n-1;i++)
       {
           boolean swap=false;
           for(int j=0;j<n-i-1;j++)
           {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap=true;
                }
           }
           if(swap==false)
            break;
       }
       for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    } 
}