package day9;
/**
* @author xinglj
* @version 2018��8��10��
* ��˵��
*/
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programmers p1 = new Programmers("����",01,10000);
		p1.work();

	}

}

/*
 * ��Աʾ����
���󣺹�˾�г���Ա�����������ţ�нˮ���������ݡ�
��Ŀ������������������ţ�нˮ�����н��𣬹������ݡ�
�Ը�������������ݽ�ģ��
 * 
 * 
 * ����Ա��  ���ԣ����������ţ�нˮ                              ��Ϊ����������
 * ����  ��   ���ԣ����������ţ�нˮ�����н���           ��Ϊ����������
 * 
 * 
 * ����Ա�;���ûɶ��ϵ�����Ƕ��ǹ�Ա Employee��Ҳ����ͬ�����Ժ���Ϊ
 * 
 * 
 * */


abstract class Employee{
	
	String name;
	int id;
	double pay;

	Employee(String name,int id,double pay){
		
		this.name = name;
		this.id = id;
		this.pay = pay;
	}
	
	public abstract void work();
	
}




class Programmers extends Employee{
	
	Programmers(String name,int id,double pay){
		super(name,id,pay);
	}
	
	
	public void work(){
		System.out.println("build java.......");
	}
}


class manager extends Employee{
	
	int pay2;
	
	manager(String name,int id,double pay){
		super(name,id,pay);
	}
	
	public void work(){
		System.out.println("manager");
	}
}











