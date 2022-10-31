//Assignment No 1
//Create a java program that enters the details of 10 students by creating a class student.
//The details entered are Rollno, Name, Phone number, age and CGPA.
//Display the name of the student with the highest CGPA.
// Display the phone number of the student whose name is ‘ANU’. 
//Display the Rollno of the youngest student in the class.

import java.util.*;
class student
{

String[] name= new String[10];
int rollno[]=new int[10];
int Phone_number[]=new int[10];
int age[]=new int[3];
float CGPA[]=new float[3];


void read()
{
for(int k=0;k<10;k++)
{
Scanner st =new Scanner(System.in);
System.out.println("enter the name");
name[k]=st.nextLine();
System.out.println("enter the roll number");
rollno[k]=st.nextInt();
System.out.println("enter the Phone number");
Phone_number[k]=st.nextInt();
System.out.println("enter the age");
age[k]=st.nextInt();
System.out.println("enter the CGPA");
CGPA[k]=st.nextFloat();
}
}


void cgpa()
{
   String a= name[0];
   float b= CGPA[0];
   for (int j=0;j<10;j++)
  { 
  if (CGPA[j]>b)//cgpa
  {
    a=name[j]; 
    b=CGPA[j];
   }
}
System.out.println("Person with the highest CGPA is - "+a);
}




void phone()
{
   int c = Phone_number[0];
   for (int j=0;j<10;j++)
  { 
  if (name[j].toUpperCase().equals("ANU"))//comparing names
  {
    c=Phone_number[j];
   }
}
System.out.println("Phone number of the person with the name ANU is - "+c);
}



void smallest()
{
   int d= rollno[0];
   int e= age[0];
   for (int j=0;j<10;j++)
  { 
  if (age[j]<e)//age
  {
    d=rollno[j]; 
    e=age[j];
   }
}
System.out.println("Roll number of the youngest is - "+d);
}

}



class Assignment
{
public static void main(String args[])
{
student s1=new student();
s1.read();
s1.cgpa();
s1.phone();
s1.smallest();
}
}
