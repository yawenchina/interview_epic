/*如果一个数的前两位的数字相加等于后面的，称为additive number。
比如112，1＋1＝2，4610， 4＋6＝10。给一串数，找出所有的additive number。*/
/*到时候问问呢负数怎么办！！！*/
 public class addictiveNumber{
	public static void main(String args[]){
  			int[] input = {112, 114, 334,336, 5712, 121224,121212};
  			ArrayList<Integer> result = new ArrayList<Integer>();
  		result = findAddictive(input);
  			print(result);

  		}
  		public static void print(ArrayList<Integer> result){
  			for(int one : result){
  				System.out.println(one);
  			}
  		}
  		public static ArrayList<Integer> findAddictive(int[] input){
  			ArrayList<Integer> result = new ArrayList<Integer>();
  			for(int one : input){
  				if(one < 99){
  					continue;
  				}else{
  					String number = Integer.toString(one);
  					//System.out.println(number);
  					int size = number.length();
  					int start = 0;
  					for(int i = 1; i < size-1; i++){
  						int first = Integer.parseInt(number.substring(start,i));
  						
							
  						int start_two = i;
  						for(int j = start_two+1;j < size ;j++){
  							int second= Integer.parseInt(number.substring(start_two,j));
  							int third = Integer.parseInt(number.substring(j,size));
  							if(first+second == third){
  								result.add(one);
  								System.out.println(first);
  								System.out.println(second);
  								System.out.println(third);
  								System.out.println("");
  							}else{
  								
  							}
  						}
  					}
  				}
  			}
  			return result;
  		}
}
