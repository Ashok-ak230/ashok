package task.mytask.phnno;

class Norway extends Country 
{

	@Override
	public boolean phoneNumberFormat(String number) {
		char[] arr=number.toCharArray();
		
		if(!(arr.length==15))
			return false;
		 if(!(arr[0]=='+' && arr[1]=='4' && arr[2]=='7' && arr[3]=='-' && arr[4]=='4' && arr[6]=='-' && arr[9]=='-' && arr[12]=='-'))
            return false;
		 if(!(arr[5]>='0' && arr[5]<='9'))
				return false;
		 for(int i=7;i<number.length()-6;i++)
		 {
		 if(!(arr[i]>='0' && arr[i]<='9'))
				return false;
		 }
		 for(int i=10;i<number.length()-3;i++)
		 {
		 if(!(arr[i]>='0' && arr[i]<='9'))
				return false;
		 }
		 
		 for(int i=13;i<number.length();i++)
		 {
		 if(!(arr[i]>='0' && arr[i]<='9'))
				return false;
		 }
		return true;
	}
}