package day3;

public class DoWhileDemo {
	public static void main(String[] args) {
		
		/*
		 * do{
		 * 
		 * 先执行，在做判断
		 * 
		 * }while(条件)
		 *
		 * 
		 * 
		 * 
		 * */	

		int x = 1;
		
		do
		{
			
			System.out.println("x="+x);
			x= x+1;
		}while(x < 2);
		
		
		int y = 1;
		while (y<1){
			System.out.println("y="+y);
		}
		
		
		/*
		练习：
		1~100之间 6的倍数出现的次数。
		要求：自己独立完成思想的书写。和步骤的文字描述。
		
		1、定义一个变量到0  随着增加到100
		2、定义一个变量 6的倍数
		

		*/
		int count = 0;
		int a = 0;
		
		while(a<=100){
			if(a%6==0){
				count++;
			}
			a++;
			
		}
		
		
		System.out.println("count:"+count);
		
	}

}
