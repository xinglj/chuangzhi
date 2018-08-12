package day7;

public class ConsDemo {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.speak();
		Person p2 = new Person("zhangsan2-person(name)");
		p2.speak();
		p2.setName("lisi");
		p2.speak();
		Person p3 = new Person("zhangsan3-",10);
		p3.speak();
		
	}

}




class Person{
	
	private String name;
	private int age;
	
	Person(){
		
		name = "zhangsan-Person";
		age = 10;
		
	}
	
	
	Person(String name){
		this.name = name;
	}
	
	
	Person(String name, int age){
		this.name = "lisi";
		this.age = age;
		
	}
	
	
	public void setName(String n){
		name = n;
	}
	
	
	public void speak(){
		
		System.out.println("name:"+name+"...."+age);
		
	}
	
	
	
	
	
}
