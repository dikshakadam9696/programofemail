package emails;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Emails {
	public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +  //part before @
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"; 
 
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
 
    /* driver function to check */
 
 
   
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    String email1 = "admin12@gmail.com";
	        String email2 = "kamal45@gmail.com";
	        String email3 = "arpit.mandliya@java2blog.com";
	        String email4 = "piu22gmail.com";
	        String email5 = "dik96@gamil.com";
	        String email6 = "shravani965@gmail.com";
	        String email7 = "mac4444@gmail.com";
	        String email8 = "diptee969@gmail.com";
	        String email9 = "abdula123@gmail.com";
	        String email10 = "jjj222@gmail.com";
	        String[] emailarr= {email1,"\n",email2,"\n",email3,"\n",email4,"\n",email5,"\n",email6,"\n",email7,"\n",email8,"\n",email9,"\n",email10,"\n"};
	      
	        Scanner scanner = new Scanner(System.in);
	    	Scanner sc = scanner;
	    	
	    	{
	    		System.out.print("Enter your Email: ");
	    	}
	    	String str=sc.nextLine();
	    	
	       {
		        System.out.print("Email id is available "+str);
		   } 
	       for (int i = 0; i < emailarr.length; i++) {
	        	
	            String email=emailarr[i];		           
   	  if (isValid(str=emailarr[i])) {
   		  System.out.print(str+" is valid email");  
      	  }
   	   
       Object value = null;
       
		checkArray(emailarr,value); }
   	   }	     
private static void checkArray(String[] emailarr, Object value) {
	// TODO Auto-generated method stub
	
}

private static boolean isinvalid(boolean b) {
		return false;
	}
}
	
