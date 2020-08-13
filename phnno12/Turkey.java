package task.mytask.phnno;

class Turkey extends Country 
{

	@Override
	public boolean phoneNumberFormat(String number) {
char[] arr=number.toCharArray();

	if(arr.length==12)
	{
		  if(!(arr[0]=='0' && arr[1]=='5' && arr[2]=='0'&& arr[4]=='-'&& arr[8]=='-'))
	            return false;
		 if(!(arr[3]>='0' && arr[3]<='9'))
				return false;
		 for(int i=5;i<number.length()-4;i++)
			{
				if(!(arr[i]>='0' && arr[i]<='9'))
					return false;
			}
		 for(int i=9;i<number.length();i++)
			{
				if(!(arr[i]>='0' && arr[i]<='9'))
					return false;	
	}}
	else if(arr.length==14)
	{
		 if(!(arr[0]=='+' && arr[1]=='9' && arr[2]=='0' && arr[3]==' ' && arr[4]=='5' && arr[5]=='0' && arr[7]=='-'))
	            return false;
			 if(!(arr[6]>='0' && arr[6]<='9'))
					return false;
			 for(int i=8;i<number.length();i++)
				{
			 if(!(arr[i]>='0' && arr[i]<='9'))
						return false;	
	}}
	else
	{
		return false;
	}
	
	return true;

	}
}

