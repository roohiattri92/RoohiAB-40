package super_7;

public class This_calling1 {
	static int age;
	String name;
	double salary;
	
void add(int age,String name,double salary)

	{
	this.name=name;
	this.age=age;
	this.salary=salary;
		System.out.println("iam" +name+ "and my age is" +age+ "my salary is" +salary+ "a");
	}
static  void sub(int a)
{
	System.out.println(age);
}

	public static void main(String[] args) {
	
System.out.println("b");
sub(7);
This_calling1 q1=new This_calling1();
q1.add(32,"ram",43.657);


	}
}
