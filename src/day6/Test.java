package day6;



public class Test {
	
	
	/*
	基础数据了下引用   返回的是x=3
	*/
	
//	public static void main(String[] args) {
//		
//		int x = 3;
//		show(x);
//		System.out.println("x="+x);
//		
//	
//	}
//	
//	
//	public static void show(int x){
//		
//		x = 4;
//	}
//	
		
		
//	}
	
	
	
	
	
	/* 
	 引用数据类型 
	 */
	
	int x = 3;
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.x = 9;
		t.show(t);
		System.out.println(t.x);
		
		
	}
	
	
	
	public static void show(Test t){
		
		t.x = 4;
	}
	
	

}













