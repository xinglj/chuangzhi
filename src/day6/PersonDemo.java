package day6;

public class PersonDemo {
	
	private String name;
	private int age;
	
	
	
	public void setName(String name){
		this.name = name;
	}
	
	
	public String getName(){
		return name;
	}
	
	void eat(){
		
		System.out.println(name + "person chifan");
		
	}
	
	
	
	static void sleep(){
		System.out.println("person sleep");
	}

}



class person{
	
	
	public static void main(String[] args) {
		
		PersonDemo p1 = new PersonDemo();
		p1.setName("zhangdan");
		System.out.println(p1.getName());
		PersonDemo.sleep();
		
		
	}
	
}