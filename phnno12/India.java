package task.mytask.phnno;

class India extends Country {
	@Override
	public boolean phoneNumberFormat(String number) {
		char[] arr=number.toCharArray();
		
		if(!(arr.length==14))
			return false;
		if(!(arr[0]=='+' && arr[1]=='9' && arr[2]=='1' && arr[3]=='-'))
			return false;
		for(int i=4;i<number.length();i++)
		{
			if(!(arr[i]>='0' && arr[i]<='9'))
				return false;
			}
		
		return true;
	
	}

}
