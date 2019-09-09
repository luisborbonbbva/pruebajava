import java.util.Arrays;

public class CountingDuplicates {
  public static int duplicateCount(String text) {

    	String text2;
    	char[] text4; 
    	
    	int i = 0, cont  = 0, cont2 = 0 ;
    	
    	text2= text.toLowerCase();
    	text4 = text2.toCharArray();
    	Arrays.sort(text4);
    	
    	for ( i = 1; i < text.length(); i ++ ) {
    		
    		if (  text4[i] == text4[i-1]  ) {
    			
    			cont++;
    			
    		} else if (cont > 0  )  {
    			
    			cont2++;
    			cont = 0;
    			
    		} else {  cont = 0; }
    		
    		if (cont > 0  && i == text.length()- 1 ) {
    			
    			cont2++;
    		}
    		
    		
    	}
    		
    	return cont2;

}
}