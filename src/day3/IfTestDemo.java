package day3;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class IfTestDemo {

	public static void main(String[] args) {
		
		System.out.println("�����������1-7��");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if(num ==1){
			System.out.println("��һ");
		}else{
			System.out.println("������һ");
		}
		
		
		/*
		һ�����ļ���
		������3 4 5
		�ļ���6 7 8
		�＾��9 10 11
		������12 1 2 
		�����û�������·ݣ�������Ӧ�ļ��ڡ�


		*/
		
		System.out.println("������1-12������");
		Scanner s2 = new Scanner(System.in);
		int num2 = s2.nextInt();
		if(num2>=3 && num2 <=5){
			System.out.println("����");
		}
		
		
		
		
	}
	
}
