package task.mytask.phnno;

class Brazil extends Country{
	@Override
	public boolean phoneNumberFormat(String number) {
		char[] arr=number.toCharArray();
		
		if(!(arr.length==17))
			return false;
		if(!(arr[0]=='+'&&arr[1]=='5'&&arr[2]=='5'&&arr[3]==' '&&arr[4]=='1'&&arr[5]=='5'&&arr[6]==' '&&arr[12]=='-'))
			return false;
		for(int i=7;i<number.length()-5;i++)
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