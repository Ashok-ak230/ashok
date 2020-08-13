package task.mytask.phnno;

class Quatar extends Country 
{

	@Override
	public boolean phoneNumberFormat(String number) {
char[] arr=number.toCharArray();
		
		if(!(arr.length==14))
			return false;
		 if(!(arr[0]=='+' && arr[1]=='9' && arr[2]=='7' && arr[3]=='4' && arr[4]==' ' && arr[5]=='3' && arr[6]=='3' && arr[9]=='-'))
            return false;
		 for(int i=7;i<number.length()-5;i++)
			{
				if(!(arr[i]>='0' && arr[i]<='9'))
					return false;
	}
		 for(int i=10;i<number.length();i++)
			{
				if(!(arr[i]>='0' && arr[i]<='9'))
					return false;
	}
		 
		return true;
	}
}