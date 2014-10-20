
public class battery {
	public static void main(String args[]){
		int[] level = {20,9,6};
		int[] sol = new int[3];
		//check(100, level, 0,sol);
		//check(99, level, 0,sol);
		check(7,level, 0,sol);

	}
	public static void check(int input, int[] level,int index,int[] sol){
		if(index == 2){
			if(input%6 == 0){
				sol[2] = input/6;
				print(sol);
				return;
			}
			//System.out.print("no change");
			return ;
		}
		for(int i= 0 ; i * level[index] < input; i++){
			sol[index] = i;
			check(input - i*level[index], level, index+1, sol);
		}
	}
	public static void print(int[] sol){
		System.out.println("sol[0] is"+sol[0]);
		System.out.println("sol[1] is"+sol[1]);
		System.out.println("sol[2] is"+sol[2]);
		System.out.println("");
	}
}
