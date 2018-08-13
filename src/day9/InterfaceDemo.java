package day9;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		E e1 = new E();
		e1.showDA();
		System.out.println(e1.num1);
		System.out.println(e1.num2);
		
	
		
	}

}



abstract class A{
	
	abstract void showA();
}

abstract class B{
	
	abstract void showB();
}




interface D{
	
	public static int num1 = 9;
	public static final int num2=10;
	
	public abstract void showDA();
	public abstract void showDB();
}

interface G{
	
	public abstract void showG();

}


class C extends A{
	
	public void showA() {
		System.out.println("c 继承了A的抽象方法，并且实现了发现showA");
	}
}


class E implements D{

	@Override
	public void showDA() {
		// TODO Auto-generated method stub
		System.out.println("show da");
	}

	@Override
	public void showDB() {
		// TODO Auto-generated method stub
		System.out.println("show db");
	}
	
	
}

class F extends A implements D,G{

	@Override
	public void showG() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  void showDA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showDB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void showA() {
		// TODO Auto-generated method stub
		
		
	}
	
}


class demoA{
	
}

