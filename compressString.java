
public class compressString {
	public static void main(String args[]){
		String m = "111111122222111235555";
		System.out.print(compress(m));

	}
	public static String compress(String m){
		StringBuffer mm = new StringBuffer();
		if(m == null || m.length() <= 1){
			return m;
		}
		char temp = m.charAt(0);
		for(int i = 1; i < m.length() ;i++){
			if(m.charAt(i) != temp){
				mm.append(temp);
				temp = m.charAt(i);
			}
		}
		return mm.toString();
	}
}
