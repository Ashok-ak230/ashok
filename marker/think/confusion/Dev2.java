package marker.think.confusion;

public class Dev2 {
	public void saveData(Object obj)
	{
		if(obj instanceof AllowStorage)
		{
			System.out.println("save data");
			
		}
		else
		{
			System.out.println("data storage not alowed on the obj");
			
		}
	}

}
