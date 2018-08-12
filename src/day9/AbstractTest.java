package day9;
/**
* @author xinglj
* @version 2018年8月10日
* 类说明
*/
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programmers p1 = new Programmers("张三",01,10000);
		p1.work();

	}

}

/*
 * 雇员示例：
需求：公司中程序员有姓名，工号，薪水，工作内容。
项目经理除了有姓名，工号，薪水，还有奖金，工作内容。
对给出需求进行数据建模。
 * 
 * 
 * 程序员：  属性：姓名，工号，薪水                              行为：工作内容
 * 经理  ：   属性：姓名，工号，薪水，还有奖金           行为：工作内容
 * 
 * 
 * 程序员和经理没啥关系，但是都是雇员 Employee，也有相同的属性和行为
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











