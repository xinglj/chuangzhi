package day5;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printArr();
//		System.out.println(getNumWeek(8));
//		getNumWeek(2);
		int arr[] = {4,2,3,1,8};
//		printArr2(arr);
		
		
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x]+ " ");
		}
		
		System.out.println();
//		bubbleSort(arr);
//		selectSort(arr);
////		
//		for(int x=0;x<arr.length;x++){
//			System.out.print(arr[x]+ " ");
//		}
//		
//		System.out.println(getMax(arr));
//		
		
		reversal(arr);
		
		
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x]+ " ");
		}
		
	}
	
	
	

	//ð��   0-1 1-2  2-3  3-4�ĶԱ� ���Դ�Y��ʼ�Աȣ��ڽ��д�ѭ�� 
	
	
	
	public static void bubbleSort(int[] arr){
		
		for(int x=0; x<arr.length-1;x++){
			
			for(int y=0; y<arr.length-1;y++){
				
				if(arr[y]>arr[y+1]){
					int tmp;
					tmp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = tmp;
				}
			}
			
		}
	
	}
	
	
	
	//ѡ������0-1  0-2 0-3 0-4�Ա� ���Խ���x=0  y=1,y=2�Ŀ�ʼ�Ա� �ڽ��д�ѭ��  
	
	
	public static void selectSort(int [] arr){
		
		for(int x=0; x<arr.length-1;x++){
			for(int y=x+1; y<arr.length-1;y++){
				
				if(arr[x]>arr[y]){
					int tmp;
					tmp = arr[x];
					arr[x] = arr[y];
					arr[y] = tmp;
				}
			}
		}
		
	}
	
	
	
	
	//��ȡ���������ֵ
	
	public static int getMax(int [] arr){
		
		int max = arr[0];
		int tmp;
		for(int x=1; x<arr.length;x++){
			
			if(arr[x] > max){
				
				max = arr[x];
				
			}
		}
		
		return max;
			
	}
	
	
	//����һ�����飬������з�ת��

	public static void reversal(int [] arr){
		
		for(int start=0,end=arr.length-1; start<end; start++,end--){
			
			int tmp;
			tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
			
		}
		
	}
	
	
	
	
	
	
	
	// ����һ�����飬����������������
	
	public static void printArr(){
		
		int arr1[] = {95,89,65,102};
		int [] arr2 = new int[]{67,43,89,56};
		
		for(int i=0; i<arr1.length;i++){
			
			System.out.println("arr1["+i+"]="+arr1[i]);
			
		}
		
		for(int y=arr1.length-1;y>=0;y--){
			
			System.out.println("arr1["+y+"]="+arr1[y]);
			
		}
		
		
	}
	
	
	
	
	
	//����һ�������������ڼ�
	
	public  static String getNumWeek(int num){
		
		
		
		if(num <1 || num >7){
			return "error num";
			
		}
		String arr[] = {" .. ","����1","����2","����3","����4","����5","����6","����7"};
		return arr[num];
		
	}
	
	
	
	
	//��������Ĺ���
	
	
	public static void printArr2(int[] arr){
		
		for(int x=0; x<arr.length; x++){
			System.out.print(arr[x] + " ");
		}
		
		
	}
	
	
	
	
	
	
	
	
	

}
