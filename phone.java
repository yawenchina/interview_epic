/*老式电话有12个键，题目给出每个电话按键对应的输出值（0-5个可能的输出值），
例如2对应a,b,c,2；而0、5和#都对应空输出。2按一次是a, 两次是b， 四次是2，五次
又是a, 以此类推。所以"225"是"b", 而"22#222"是“bc"。用户输入一串电话按键的字
符串，打印对应的输出字符串*/


/*这道题要注意！！！：
 * 将所有数字的翻译存储到数组里面 ！！！ 要讨论开头为####***的情况！！！！！**/
public class phoneNumber {
	public static void main(String args[]){
		String[] dail = {"abc2","def3","ghi4","jkl5","mno6","pqrs7","tuv8","wxyz9"};
		 String m = "2234555***553101";
		  String mm= "***####2234555***553101";
		 System.out.println(change(dail, m));
		 System.out.println(change(dail, mm));

	}
	public static String change(String[] dail, String m){
			char[] array = m.toCharArray();
			int i = 0;
			while(i < m.length() && (m.charAt(i) == '*' || m.charAt(i) == '#')){
				i++;
			}
			char temp = m.charAt(i);
			int time = 1;
			StringBuffer bf = new StringBuffer();
			for(int j = i+1; j < m.length(); j++){
				char t = m.charAt(j);
				if(t == '*' || t == '#'){
					continue;
				}else if ( t== '1' || t == '0') {
					bf.append(t);
				}else if(t == temp){
					time++;
				}else{
					int index = temp-'2';
					String s = dail[index];
					int size = s.length();
					bf.append(s.charAt(time%size-1));
					temp = t;
					time = 1;
				}
			}
			if(time != 0){
				bf.append(temp);
			}
			return bf.toString();



	}
}
