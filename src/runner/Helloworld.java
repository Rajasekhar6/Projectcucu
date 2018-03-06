package runner;
//adding coments sfsfsfsdfdfd
public class Helloworld
{
	int empno;
	String name;
		
	public Helloworld(int empno,String name)
	{
		this.empno=empno;
		this.name=name;
	}

	public String toString()
	{
		return empno +"===="+name;
	}
public static void main(String args[])
{
 
	Helloworld h1 = new Helloworld(1000, "Raja");
	Helloworld h2 = new Helloworld(1010, "Sekhar");

	System.out.println(h1);
	System.out.println(h2);
	


}}
