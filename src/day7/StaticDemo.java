package day7;

public class StaticDemo {
	
	
	int num = 4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new StaticDemo().show();
		
		Person1 p1 = new Person1();
		p1.show();
		Person1 p2 = new Person1();
		p2.name = "zhangsan";
		p2.show();
		
		
		
	}
	
	
	
	public  void show(){
		System.out.println(num);
	}

}



class Person1{
	
	String name;
	static String county = "CN" ;
	
	public void show(){
		System.out.println(county +"...."+ this.name);
	}
}



