package day4;

public class BreakContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break
		/*
		break:跳出。
		break作用的范围：要么是switch语句，要么是循环语句。
		记住：当break语句单独存在时，下面不要定义其他语句，因为执行不到。
			break跳出所在的当前循环。
			如果出现了循环嵌套，break想要跳出指定的循环，可以通过标号来完成。
		*/
		for(int x=0; x<=3; x++){
			
			if(x==2){
				break;
			}
			System.out.println(x);
		}
		
		
		System.out.println("---------------------------");
		/*
		continue:继续。
		作用的范围：循环结构。
		continue：结束本次循环，继续下次循环。
		如果continue单独存在时，下面不要有任何语句，因为执行不到。
		*/
		
		for(int x=0; x<=3; x++){
			
			if(x==2){
				continue;
			}
			System.out.println(x);
		}
		
		

	}

}
