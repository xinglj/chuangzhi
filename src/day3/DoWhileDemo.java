package day3;

public class DoWhileDemo {
	public static void main(String[] args) {
		
		/*
		 * do{
		 * 
		 * ��ִ�У������ж�
		 * 
		 * }while(����)
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
		��ϰ��
		1~100֮�� 6�ı������ֵĴ�����
		Ҫ���Լ��������˼�����д���Ͳ��������������
		
		1������һ��������0  �������ӵ�100
		2������һ������ 6�ı���
		

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
