package day4;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printDemo();
		System.out.println(add(3,1));
		System.out.println(add2(3,3));
		juXing(3,4);
		System.out.println(equlsDemo(3, 6));
		print99();
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void printDemo(){
		
		System.out.println("printDemo");
		return;
		
	}
	
	
	public static int add(int a , int b){
		
		return a+b;
	}
	
	
	public static int add2(int a , int b){
		
		int sum = a + b;
		return sum;
		
	}
	
	
	//����2�� ����һ�����ܣ���һ�������ڿ���̨��  ������*��ʾ
	
	public static void juXing(int row, int col){
		
		for(int x=1; x<=row; x++){
			
			for(int y=1;y<=col; y++){
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	
	}
	
	
	
	
	//����3�� ����һ�����ܣ��Ƚ��������Ƿ���ȡ�
	
	public static boolean equlsDemo(int a, int b){
		
		if(a==b){
			return true;
		}else
			return false;
	}
	
	
	
	//����4�� ����һ�����ܣ���ȡ���������нϴ���Ǹ�����
	
	public static int getMax(int a, int b){
		
		if(a>b){
			return a;
		}else {
			return b;
		}
	}
	
	
	//����5�����幦�ܣ���ӡ99�˷���
	/*   1*1
	 *   1*2 2*2
	 *   1*3 2*3 3*3
	 *   ......
	 * 
	 * */
	
	public static void print99(){
		
		for(int x=1; x<=9; x++){
			
			for(int y=1;y<=x;y++){
				System.out.print(y+"*"+x+""+"="+y*x+"  ");
			}
			System.out.println();
		}
	}
	
	/*
	 * 
	 * ���ݿ��Գɼ���ȡѧ��������Ӧ�ĵȼ�
	90~100		A
	80~89		B
	70~79		C
	60~69		D
	60����		E
	 * 
	 * */
	
	
	public static char levelDemo(int a){
		char level;
		if(a>=90 && a<=100){
			level =  'A';
		}else if (a>=80 && a<=90) {
			level =  'B';
		}else {
			level = 'C';
		}
		return level;
	}

}
