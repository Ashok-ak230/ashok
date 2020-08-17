
public class replacefirst {
	String Replacefirst(String str,char oldChar, char newChar)
	{
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			
			if(arr[i]==oldChar)
			{
				arr[i]=newChar;
				break;
			}
		}
		String manStr=new String(arr);
		return manStr;
		
	}

	public static void main(String[] args) {
		replacefirst first=new replacefirst();
		String data=first.Replacefirst("Java Jodan",'J','W');
		System.out.println(data);
	}

}
