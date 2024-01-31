import java.util.Arrays;
import java.util.List;

public class Practicejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=10;
char letter= 'a';
String name= "Java";
float weight=59.5f;
boolean b=true;

System.out.println("enter the value" + num);
System.out.println("Enter the first letter" + letter);
System.out.println("Enter the course" + name);
System.out.println("Enter the weight" + weight);
System.out.println("Enter the Statment" + b);


//Array

int[]a = new int[3];
a[0]=5;
a[1]=4;
a[2]=3;
System.out.println(a[1]);

//Array with another method



int []array={5,4,3};
System.out.println(array[2]);



//for loop


int[] array2 = {9, 4, 2};
for (int i = 0; i < array2.length; i++) 
{
	System.out.println(array2[i]);
}


int [] array1 = {2,5,7};
for (int i=0;i<3; i++){

System.out.println(array1[i]);

	}


//Array of String

String[] S= {"Core", "java" };

for(int i=0; i<S.length;i++)
{
	System.out.println(S[i]);
}
 
String[] S1 = {"core" ,"java"};
for(int i=0;i<2; i++)
 {
	System.out.println(S1[i]);
 }

 //enhance loop
   
String[] name1 = {"Camel", "Street"};

for (String S2 : name1)
{
    System.out.println(S2);
}

//Array to ArrayList Conversion

String[] val = {"Ramesh", "Academy", "Selenium"};
List<String> valArrayList = Arrays.asList(val);
valArrayList.contains("Selenium");
boolean arrayContainsSelenium = Arrays.asList(val).contains("Selenium");
boolean arrayListContainsSelenium = valArrayList.contains("Selenium");

System.out.println("Array contains 'Selenium': " + arrayContainsSelenium);
System.out.println("ArrayList contains 'Selenium': " + arrayListContainsSelenium);

}
}

