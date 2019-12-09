import java.util.Scanner;
class A9
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
System.out.println("Enter how many numbers");
int n=sc.nextInt();
int i,j,k;
int a[]=new int[n];int sum=0;
System.out.println("Enter the numbers");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n-1;i++)
{
   for(j=i+1;j<n;j++)
{
    if(a[i]==6 && a[j]==7)
{
  for( k=i;k<=j;k++)
  {  a[k]=0;}
}
}
}
for(i=0;i<n;i++)
{
 sum=sum+a[i];
}
System.out.println(sum);
}
}