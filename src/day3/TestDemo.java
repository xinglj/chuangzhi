package day3;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		3000米长的绳子，每天减一半，问，需要多少天，绳子会小于5米？
		思路：
		1,绳子长度在变化，定义变量记录绳子长度的变化，而且这个变量的初始化值时3000.
		  既然不考虑小数部分，所以可以定义int类型变量 
		2,多少天,不确定,是一个变量.
		3,每天减一半，这时对绳子长度的运算，只要可以减一半，就算一天。
			这就让我想到了一个小思想，就是传说中的计数器思想。
		4,天数的递增，减一半的动作在重复的执行，使用循环结构。
		5,直到小于5米，重复动作结束。这就是循环的条件。 

		*/
		int day = 0;
		
		for (int x=3000;x>5;x=x/2){
			day++;
		}
		System.out.println(day);

	}

}
