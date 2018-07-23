package day4;

public class Demo99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		 需求：
		打印一个99乘法表。
		
		1*1 = 1
		1*2 = 2 2*2 = 4
		1*3 = 3 2*3 = 6 3*3 =9
		.....
		.....		 
		 */
		
		
		/*
		\n:回车：
		\t:制表符。
		\b:退格。
		\r: 按下回车键。

		windows系统中回车符其实是由两个符号组成的 \r\n.
		linux中回车符是 \n.

			
		System.out.println("\\hello world\\");
		*/
	
		
		for(int x=1; x<=9; x++){
			
			for(int y=1; y<=x; y++){
				
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			
			System.out.println();
		}
		

	}

}
