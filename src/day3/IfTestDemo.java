package day3;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class IfTestDemo {

	public static void main(String[] args) {
		
		System.out.println("请输入个整数1-7：");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if(num ==1){
			System.out.println("周一");
		}else{
			System.out.println("不是周一");
		}
		
		
		/*
		一年有四季。
		春季：3 4 5
		夏季：6 7 8
		秋季：9 10 11
		冬季：12 1 2 
		根据用户输入的月份，给出对应的季节。


		*/
		
		System.out.println("请输入1-12整数：");
		Scanner s2 = new Scanner(System.in);
		int num2 = s2.nextInt();
		if(num2>=3 && num2 <=5){
			System.out.println("春季");
		}
		
		
		
		
	}
	
}
