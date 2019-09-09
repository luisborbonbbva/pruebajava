public class Printer {
    
    public static String printerError(String s) {

    	int cont1 = 0, cont2 = 0;
    	String S2; 
      
    	for ( int i = 0; i< s.length(); i++) {
    		
    		if (s.charAt(i) > 'm' ) {
    			
    			cont2++;
    			
    		}
    		
    	}
  
      S2 = cont2 + "/" + s.length();      
    	return S2;
}
}
