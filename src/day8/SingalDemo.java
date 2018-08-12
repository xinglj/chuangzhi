package day8;

/**
 * 
 * @author xinglj
 *
 * 2018年7月25日下午5:52:59
 * 备注
 * 单例设计模式
 * 解决的问题： 就是抱着对象的唯一性
 * 
 * 如何保证对象的唯一性？
 * 1、不许被new 对象
 * 2、对外提供一个对象出去
 * 3、在该类创建一个本类实例
 */

class SingalDemo {

	
  
	public static void main(String[] args) {
		
		Single s1 = Single.getInstance();
		s1.getInstance();
		
		Single s2 = Single.getInstance();
		s2.getInstance();
		
		System.out.println(s1==s2);
	}
	

}

// 饿汉式
class Single{
	
	private static Single s = new Single();
	
	private Single() {
		// TODO Auto-generated constructor stub
	}
	
	public static Single getInstance(){
		
		return s;
	}
	
}

//懒汉式
class Single2{
	
	private static Single2 s = null;
	
	private Single2(){
		
	}
	
	public static Single2 getInstance(){
		
		if(s == null){
		    s = new Single2();
		}
		
		return s;
	}
	
	
}




