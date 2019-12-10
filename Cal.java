import java.util.*;
class Calculator
{
static double powerInt(int num1,int num2)
{
double a=num1;
double b=num2;
return Math.pow(a,b);
}
static double powerDouble(double num1,double num2)
{
double a=num1;
double b=num2;
return Math.pow(a,b);
}
}
class Cal
{
public static void main(String args[])
{
double p1=Calculator.powerInt(12,10);
double p2=Calculator.powerDouble(23,24);
System.out.println(p1);
System.out.println(p2);
}
}