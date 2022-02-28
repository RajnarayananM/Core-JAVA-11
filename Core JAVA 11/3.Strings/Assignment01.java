package Strings;

public class Assignment01 {

	public static void main(String[] args) {
		
		String str = "Hello world";
		String str1 = "Hello";
		String str2 = "How are you";
		String str3 =  "Java String pool refers to collection of Strings which are stored in heap memory";
		String str10 = "java string pool refers to collection of strings which are stored in heap memory";
		
		int len =str.length();
		System.out.println("The lenght of the string " +len);
		
		System.out.println(str1+" " +str2);
		
		String str4 = str3.toUpperCase();
		System.out.println(str4);
		
		String str5 = str3.toLowerCase();
		System.out.println(str5);
		
		String str6 = str3.replace('a', '$');
		System.out.println(str6);
		 
	    String str7 = str3.concat("collection");
	    System.out.println(str7);
	
	    if(str3.contains("collection")) {
	    	System.out.println("Collection is available ");
	    }else {
	    	System.out.println("not avaliable");
	    }
	    if(str3.compareTo(str10)==0) {
			System.out.println("str3 compared to srt10");
		}else {
			System.out.println("str3 not compared to str10");
	}
	    
	    
	    if(str3.equals(str10)) {
			System.out.println("str3 == str10");
		}else 
		{
			System.out.println("str3 !=str10");
	}
	    
	    StringBuffer buffer = new StringBuffer("StringBuffer");
	    buffer.append("is a peer class of" + "String" +"that provides much of the functionality of strings");
	    System.out.println("Buffer : "+buffer); 
	    
	    StringBuffer buffer1 = new StringBuffer("It is used to at the specified index position”");
	    buffer1.insert(16, "insert text");
	    System.out.println("Buffer "+buffer1);
	    
	    
	    StringBuffer buffer2 = new StringBuffer("This method returns the reversed object on which it was called");
	    buffer2.reverse();
	    System.out.println("Buffer "+buffer2);
	    
	    
	    StringBuffer builder = new StringBuffer("StringBuffer");
	    builder.append("is a peer class of" + "String" +"that provides much of the functionality of strings");
	    System.out.println("Builder : "+builder); 
	    
	    StringBuffer builder1 = new StringBuffer("It is used to at the specified index position”");
	    builder1.insert(16, "insert text");
	    System.out.println("Builder1 "+builder1);
	    
	    
	    StringBuffer builder2 = new StringBuffer("This method returns the reversed object on which it was called");
	    builder2.reverse();
	    System.out.println("Builder2 "+builder2);
	}
}
	
	


