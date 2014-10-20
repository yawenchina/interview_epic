import java.util.*;
	import java.util.*;
	public class findChange {
		public static void main(String args[]){
			int change = 10000;
			int use = 100;
			int res = change-use;
			ArrayList<Integer> result = new ArrayList<Integer>();
			ArrayList<ArrayList<Integer>> finalR = new ArrayList<ArrayList<Integer>>();
			int[]  rule = {500,100,25,10,5,1};
			change(result,  res, rule, finalR,0);

			print(finalR);
		}
		public static void print(ArrayList<ArrayList<Integer>> result){
			for(ArrayList<Integer> one : result){
				for(int temp : one){
					System.out.print(temp);
				}
				System.out.println("");
			}
			

		}
		public static void change(ArrayList<Integer> result, int res, int[] rule,ArrayList<ArrayList<Integer>> finalR,int index ){
		/*index 0 : 5*100 
			index 1 : 1*100;
			index 2: 25
			index 3: 10
			index 4: 5;
			index 5: 1;

		*/
		if(index == 5){
			result.add(res);
			finalR.add(new ArrayList<Integer>(result));
			return ;
		}
		
		for (int i = 0; i*rule[index] <= res; i++) {
					result.add(i);
				    change(result, res-i*rule[index],rule, finalR,++index);
				 
		 }

	
	

		}
	}

