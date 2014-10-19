import java.util.*;
public class giveChange {
	public static void main(String args[]){
		int change = 10*100;
		int use = 1*100;
		int res = change-use;
		ArrayList<Integer> result = new ArrayList<Integer>();
		int[]  rule = {500,100,25,10,5,1};
		change(result,  res, rule);
		
		print(result);
	}
	public static void print(ArrayList<Integer> result){
		for(int one : result){
			System.out.print(one);
		}

	}
	public static void change(ArrayList<Integer> result, int res, int[] rule){
	/*index 0 : 5*100 
		index 1 : 1*100;
		index 2: 25
		index 3: 10
		index 4: 5;
		index 5: 1;

	*/
	for(int i = 0 ; i < rule.length; i++){
		if(res > rule[i]){
			int number = res/rule[i];
			result.add(number);
			res = res%rule[i];
		}else{
			result.add(0);
		}
	}

	}
}