package day4;

public class BreakContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break
		/*
		break:������
		break���õķ�Χ��Ҫô��switch��䣬Ҫô��ѭ����䡣
		��ס����break��䵥������ʱ�����治Ҫ����������䣬��Ϊִ�в�����
			break�������ڵĵ�ǰѭ����
			���������ѭ��Ƕ�ף�break��Ҫ����ָ����ѭ��������ͨ���������ɡ�
		*/
		for(int x=0; x<=3; x++){
			
			if(x==2){
				break;
			}
			System.out.println(x);
		}
		
		
		System.out.println("---------------------------");
		/*
		continue:������
		���õķ�Χ��ѭ���ṹ��
		continue����������ѭ���������´�ѭ����
		���continue��������ʱ�����治Ҫ���κ���䣬��Ϊִ�в�����
		*/
		
		for(int x=0; x<=3; x++){
			
			if(x==2){
				continue;
			}
			System.out.println(x);
		}
		
		

	}

}