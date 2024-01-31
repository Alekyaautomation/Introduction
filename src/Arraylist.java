import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a =new ArrayList<String>();
a.add ("Selenium");
a.add ("Automation");
a.add("java");
a.add("Udemy");
System.out.println(a.get(3));
System.out.println(a.contains("java"));

//for loop ArrayList

for(int i=0;i<a.size();i++)
{
System.out.println(a.get(i));	
}


//enhanced for loop
for(String S:a)
{
System.out.println(S);	
}



}

}
