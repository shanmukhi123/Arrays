class P1
{
   public static void main(String args[])
{
   int a[]={1,2,3,4,5};
int sum=0;
for(int i=0;i<5;i++)
{
   sum=sum+a[i];
}

int avg=sum/5;
System.out.println("Sum="+sum+" Average ="+avg);
}
}