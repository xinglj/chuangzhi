package day8;

/**
 * 
 * @author xinglj
 *
 * 2018��7��25������5:52:59
 * ��ע
 * �������ģʽ
 * ��������⣺ ���Ǳ��Ŷ����Ψһ��
 * 
 * ��α�֤�����Ψһ�ԣ�
 * 1������new ����
 * 2�������ṩһ�������ȥ
 * 3���ڸ��ഴ��һ������ʵ��
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

// ����ʽ
class Single{
	
	private static Single s = new Single();
	
	private Single() {
		// TODO Auto-generated constructor stub
	}
	
	public static Single getInstance(){
		
		return s;
	}
	
}

//����ʽ
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




