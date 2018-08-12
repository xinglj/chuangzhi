package day8;

/**
 * 
 * @author xinglj
 *
 * 2018年7月24日下午3:31:36
 */

 
public class ArrayTool {
	
	
	private ArrayTool(){
		
	
	}
	
	
	// 数组最大值
	
	public static int getMax1(int arr[]){
		
		int max = arr[0];
		
		
		for(int x=1; x<arr.length;x++){
			
			if(max < arr[x]){
				int tmp;
				tmp = arr[x];
				arr[x] = max;
				max = tmp;
				
			}
	
		}
		return max;
		
	}
	
	
	
	public static int getMax2(int[] arr)
	{
		int maxIndex = 0;
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>arr[maxIndex])
					maxIndex = x;//
		}

		return arr[maxIndex];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
