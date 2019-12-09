import java.util.Scanner;
class P6
{
  public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of values");
int n=sc.nextInt();
int t,i;
int a[]=new int[n];
for(i=0;i<a.length;i++)
{
   a[i]=sc.nextInt();
}
for( i=0;i<a.length-1;i++)
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
System.out.println("Sorted array is");
for(i=0;i<a.length;i++){System.out.println(a[i]);}
}
}