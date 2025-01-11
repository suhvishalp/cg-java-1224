import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4, 3, 1, 2};
		
		System.out.println("Minimum swaps : " );
		
		minSwapsToSort(arr);
	}
	
	public static int minSwapsToSort(int [] arr) {
		
		int n = arr.length;
		int swaps = 0;
				
		//create a pair of (value, index) for each element in the array
		List<Pair> pairList = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
						
			pairList.add(new Pair(arr[i], i));	//4 0	|	3 1		| 	1 2 |  	2 3
			
			//1 2		2 3  	3 1		4 0
		}
		
		//just for debugging print the pairs
		System.out.println(pairList);
		
		//sort the pairlist based on values 
		//	Collections.sort(pairList, (p1, p2) -> Integer.compare(p1.value, p2.value));
		pairList.sort(Comparator.comparingInt(pair -> pair.value));
		
		System.out.println("After Sort:" );
		System.out.println(pairList);
		
		
		//detect cycles 
		boolean[] visited = new boolean[n];
		
		//	0		1		2		3
		//[true 	true 	true  true]
		
						//0
		for(int i=0 ; i<n ;	i++) {
			
			if(visited[i] || pairList.get(i).index == i) {
				continue;
			}
			
			int cycleSize = 0;		
			int x = i;			
			
			while(!visited[x]) {			
				
				visited[x]= true;
				x = pairList.get(x).index;		
				cycleSize++;	
				System.out.println("while :" + cycleSize);
				System.out.println("pair " + pairList.get(x));
			}	
			
			if(cycleSize > 1) {
				swaps += (cycleSize - 1);
				
				System.out.println("Current swap number :" + swaps);
			}
			
		}
		
		return swaps;
	}
	
	//to map array element to their index
	static class Pair {
		int value, index;
		
		Pair(int value, int index){
			this.value = value;
			this.index = index;
		}
		
		public String toString() {
			return "[value: " + value + " " + "Index :" + index + "] \t";
		}
	}
	
	
}
