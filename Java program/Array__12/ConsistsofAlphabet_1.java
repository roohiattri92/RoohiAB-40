package Array__12;
import java.util.Arrays;
public class ConsistsofAlphabet_1 {
public static void main(String[] args) {
String name="My 2ame Is Ramanpreet Kaur";
boolean q;
char[] a1= name.toCharArray();
System.out.println(Arrays.toString(a1));
System.out.println(name.length());
for(int i=0;i<name.length();i++) {
	


q=Character.isAlphabetic(a1[i]);
System.out.println(q);
/*if(q==true)
{
	System.out.println("yes this contains alphabets");
}
else
{
	System.out.println("Not contains Alphabets" );*/
}
	}

}

