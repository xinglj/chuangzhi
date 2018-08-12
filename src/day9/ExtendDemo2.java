package day9;
/**
* @author xinglj
* @version 2018年7月26日
* 类说明
*/
public class ExtendDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Zi(6);
	}

}




class Fu{
	
	int num;
	
	Fu(){
		int num = 10;
		System.out.println("A Fu run ");
	}
	
	Fu(int x){
		System.out.println("B fu run "+x);
	}
	
}

class Zi extends Fu{
	
	int num;
	Zi(){
		
		System.out.println("C zi run "+num);
	}
	
	Zi(int x){
		
		this();
		System.out.println("D zi run " +x);
	}
	
}















