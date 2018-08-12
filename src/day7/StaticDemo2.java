package day7;

public class StaticDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2.method();
		Person2 p1 = new Person2("zhangsan", 99);
		p1.show();
		
		
	}
	
	

}



class Person2{
	
	private String name;
	private int age;
	static String conuty = "CN";
	
	Person2(String name,int age){
		
		this.name = name;
		this.age= age;
		System.out.println("name:"+name+"..."+age);
	}
	
	
	public void show(){
		
		System.out.println(Person2.conuty+":"+this.name+"..."+this.age);
	}
	
	public static void method(){
		System.out.println(Person2.conuty);
	}
	
	
}
