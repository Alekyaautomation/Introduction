public class Practicestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S="Rahul Shetty Academy";
String S1="Rahul Shetty Academy";
String S2="Hello";
//Literals same name with multiple values it wont create new object.it will refer to the existing


String S3=new String("Welcome");
String S4=new String("Welcome");
//new same name with multiple values it will create new object for each value


String S6="Rahul Shetty Academy";
String[]SplittedString=S.split(" ");
System.out.println(SplittedString[0]);
System.out.println(SplittedString[1]);
System.out.println(SplittedString[2]);

String S7 = "Rahul Shetty Academy";
String[]SplittedString1 = S7.split("Shetty");
System.out.println(SplittedString[0]);
System.out.println(SplittedString[1]);

String S8 = "Rahul Shetty Academy";
String[] SplittedString2 = S8.split("Shetty");
System.out.println(SplittedString[1].trim());


//character by character 

for(int i=0;i<S.length();i++)
{
	System.out.println(S.charAt(i));
}


//Reverse String

for(int i=S.length()-1;i>=0;i--)
{
	System.out.println(S.charAt(i));
}


	}

}
