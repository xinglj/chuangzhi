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
	
	
	//需求2： 定义一个功能，画一个矩形在控制台。  矩形用*表示
	
	public static void juXing(int row, int col){
		
		for(int x=1; x<=row; x++){
			
			for(int y=1;y<=col; y++){
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	
	}
	
	
	
	
	//需求3： 定义一个功能，比较两个数是否相等。
	
	public static boolean equlsDemo(int a, int b){
		
		if(a==b){
			return true;
		}else
			return false;
	}
	
	
	
	//需求4： 定义一个功能，获取两个整数中较大的那个数。
	
	public static int getMax(int a, int b){
		
		if(a>b){
			return a;
		}else {
			return b;
		}
	}
	
	
	//需求5：定义功能，打印99乘法表。
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
	 * 根据考试成绩获取学生分数对应的等级
	90~100		A
	80~89		B
	70~79		C
	60~69		D
	60以下		E
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
