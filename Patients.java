import java.util.*;
class Patient
{
String patient;
double height;
double weight;
Patient(String p,double h,double w)
{
this.patient=p;
this.height=h;
this.weight=w;
}
double Bmi()
{
double ans;
ans=(weight/(height*height))*703;
return ans;
}
}
class Patients
{
public static void main(String args[])
{
Patient obj1=new Patient("Ram",34,50);
double bm=obj1.Bmi();
System.out.println("Bmi of a patient is "+bm);
}
}