
public class CheckNum {
	public boolean isNum(String in)
	{
		char[] arr=in.toCharArray();
		for(int i=0;i<=in.length();i++) {
			if(arr[i]>='0' && arr[i]<='9')
				return true;
			else 
				return false;
		}
		return false;
	}

	public static void main(String[] args) {
		CheckNum checknum = new CheckNum();
		boolean data=checknum.isNum("9aSh");
		System.out.println(data);

	}

}
