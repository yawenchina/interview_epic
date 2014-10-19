
import java.util.*;
public class run{
	static int tscore = 0;
	static int fscore = 0;
	public static void main(String args[]){
		boolean[][] input = {
			{false, false, false, false, true, false},
			{false, false, false, false, true, false},
			{true, true, true, false, true, false},
			{false, true, false, false, false , false},
			{false, false, false, false, false, false},

		};
		
	
		for(int i = 0 ; i < input.length; i++){
			for(int j = 0; j < input[0].length; j++){
				if(input[i][j]){
					check(i, j, 0, input,true,new ArrayList<Integer>());
						
					
				}else{
					check(i, j, 0, input,false,new ArrayList<Integer>());
				}
			}
		}
		if(tscore > fscore){
			System.out.print(tscore+"ture is larger than"+fscore);
		}else{
			System.out.print(fscore+"false is larger than"+tscore);
		}
	}
	public static void check(int i, int j, int count, boolean[][] input,boolean target,ArrayList<Integer> path){
		if (count == 3){
			//print method to check the path;
			/*if(target){
				for(int m : path){
					System.out.println(m);
				}
			}*/
			if(target){
				tscore++;
			}else{
				fscore++;
			}
			return;
		}
		if (i <0 || j < 0 || i >= input.length || j >= input[0].length ||input[i][j] != target){
			return;
		}
		input[i][j] = !target;
		//this is used to store the path of number,-1 means the end of this point
		path.add(j);
		path.add(i);
		path.add(-1);
		check(i+1, j, count+1, input, target,path);
		if(count < 2){
		check(i, j+1, count+1, input, target,path);
		check(i-1, j, count+1, input, target,path);
		check(i, j-1, count+1, input, target,path);
		}
		input[i][j] = target;
		return  ;

	}


}