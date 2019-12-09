import java.util.Scanner;
class P5
{
  public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of values");
int n=sc.nextInt();
int t;
int a[]=new int[n];
for(int i=0;i<a.length;i++)
{
   a[i]=sc.nextInt();
}
for(int i=0;i<a.length-1;i++)
{
 for(int j=i+1;j<a.length;j++)
{
   if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;

}
}
}
System.out.println("Smallest 2 numbers are:"+a[0]+" and "+a[1]);
System.out.println("Biggest 2 numbers are:"+a[n-1]+" and "+a[n-2]);
}
}