class P2
{
   public static void main(String args[])
{
   int a[]={1,2,3,4,5};
int min,max;
min=a[0];
max=a[0];
for(int i=1;i<5;i++)
{
if(a[i]<min)
min=a[i];
if(a[i]>max)
max=a[i];
}
System.out.println("Min number is="+min+"\n Max value ="+max);
}
}