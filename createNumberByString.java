import java.util.*;
public class createNumber {
	public static void main(String args[]){
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(3);
		set.add(5);
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		createNumber( res, result, 3, set);

		print(res);


	}
	public static void print(ArrayList<ArrayList<Integer>> result){
			for(ArrayList<Integer> one : result){
				for(int temp : one)
			System.out.println(temp);
				System.out.println("");
			}
	
		
	}

	public static void createNumber( ArrayList<ArrayList<Integer>> res,ArrayList<Integer> result, int N, HashSet<Integer> nouse){

		if (result.size() == N) {
			
			res.add(new ArrayList<Integer>(result));
			return ;
		}
		if(result.size() == 0){
			result.add(4);
			createNumber(res,result,N,nouse);
			result.remove(result.size()-1);
		}
		for (int i = 1; i <= 9 ;i++) {
			if(nouse.contains(i) || i == 4){
				continue;
			}
			if(result.size() >= 1){
				if(result.get(result.size()-1) == i){
					continue;
				}
			}
			result.add(i);
			createNumber(res, result,N, nouse);
			result.remove(result.size()-1);
		}



	}
}
