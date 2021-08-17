import java.util. HashMap;
import java.util.Scanner;

   
public  class ValueExists{
Scanner input=new Scanner(System.in);
    
	public void checkValue(){
	
	 HashMap<String,String> map=new HashMap<String,String>();
	 for(int i=0; i<3; i++){
	 System.out.println("1.enter the null");
	 String name=input.next();
	 System.out.println("2.enter address  ");
	 String address=input.next();
	   map.put(name,address);
	   }
	   
	  
	 System.out.println("HashMap="+map);
	 int len=map.size();
	 System.out.println("size of map="+len);
	 Syste.out.println("check value");
	 
	 String check=input.next();
	 boolean keyExist=map.containsKey(check);
	   
	 System.out.println("1 IS EXIST:" +keyExist);
	 
	 keyExist=map.containsKey();
	   System.out.println("10 IS EXIST:" +keyExist);
    }
	
     public static void main(String []args){
	    ValueExists obj=new ValueExists();
	  obj.checkValue();
	  }
	  }
	