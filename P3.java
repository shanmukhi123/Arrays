import java.util.Scanner;
class P3
{
   public static void main(String args[])
{
   int a[]={1,2,3,4,5};
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
int i;
for( i=0;i<a.length;i++)
{
   if(b==a[i])
System.out.println(i+1);

}
if(i==a.length)
{System.out.println("-1");}
}
}
