package restservices.helloworld.test;

public class Sample {

	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	public void newMethod() {
		System.out.print("I am a learner");
	}
	public void oneMore() {
		System.out.println("i learned");
	}
	
	public void oneMore1() {
		System.out.println("i am still learning");
	}
	public void oneMore11() {
		System.out.println("i am still learning today");
	}
	public void test() {
		int a =5;
		fun();
		System.out.print(getA());
		System.out.println(getName());
	}
	private void fun() {
		setName("kamal");
		setA(5);
	}
	
	
}
