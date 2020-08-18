
import java.util.*;
public class ReverseString{
	
          String RevStr(String data) {
    	
        	  char[] arr=data.toCharArray();
				
  			String reverse=" ";
  			
  			for(int i=data.length()-1;i>=0;i--){
  			reverse+=arr[i];
  			}
  		
  	    char[] arr1=reverse.toCharArray();
        	  String d=reverse.toString();
    		  String[]arr2 = reverse.split(" ");
    		  for(int j=arr2.length-1;j>0;j--)
    		  {
    			  System.out.println(arr2[j]);
    			  
    		  }
    	  return " ";
			
		}
		 public static void main(String args[]){  
			 ReverseString a=new ReverseString();
			 a.RevStr("This is java programming");
			   }
	}	
		
		
		
		
		
		
		
		
		
		
	
