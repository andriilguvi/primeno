import java.io.*;
import java.util.*;
class primeno
{
public static void main(String args[])
{
int num=0;
int i=0;
String pm=" ";
for(i=11;i<=37;i++)
{
int counter=0;
for(num=i;num>=1;num--)
{
if(i%num==0)
{
counter=counter+1;
}
}
if(counter==2)
{
pm=pm+i+" ";
System.out.print(pm);
}
}
}
}
