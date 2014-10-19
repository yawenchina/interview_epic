import java.util.*;
public class createNum {

	public static void main(String args[]){
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(3);
		set.add(5);
		ArrayList<String> result = new ArrayList<String>();
		StringBuffer bf = new StringBuffer();
		createNumber(bf, result, 4, set);
		print(result);


	}
	public static void print(ArrayList<String> result){
		for(String one: result){
			System.out.println(one);
		}
	}

	public static void createNumber(StringBuffer bf, ArrayList<String> result, int N, HashSet<Integer> nouse){

		if (bf.length() == N) {
			result.add(new String(bf.toString()));
			return ;
		}
		if(bf.length() == 0){
			bf.append((char)('0'+4));
			createNumber(bf,result,N,nouse);
			bf.deleteCharAt(bf.length()-1);
		}
		for (int i = 1; i <= 9 ;i++) {
			if(nouse.contains(i) || i == 4){
				continue;
			}
			if(bf.length() >= 1){
				if(bf.charAt(bf.length()-1) == (char)(i+'0')){
					continue;
				}
			}
			bf.append((char)(i+'0'));
			createNumber(bf, result,N, nouse);
			bf.deleteCharAt(bf.length()-1);
		}



	}
}
