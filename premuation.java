 /*感觉和上面的题又有点像， 给一个string， 里面不能有数字。 然后所有的大写字
母和非字母符号不能动， 其他的小写字母可以随意动。 输出所有的可能。
e.g.  input Oh my-god!
output  Om hd-goy! Oy hm-dog! 等等。。*/



public class permutation {
	public static void main(String args[]){
		String m = "fsa";
		char[] array = m.toCharArray();
		permutateHelper(array,0);


	}
	public static void permutateHelper (char[] array, int index) {
		if(index == array.length-1){
			System.out.println(new String(array));
			return;
		}
		for(int i = index; i < array.length ;i++){
			swap (i, index, array);
			permutateHelper (array, index+1);
			swap (index, i, array);
		}




	}
	public static void swap (int i, int j, char[] array){

		char m = array[i];
		array[i] = array[j];
		array[j] = m;

	}
}
