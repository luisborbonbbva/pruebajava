import java.util.ArrayList;

public class PrimeDecomp {
   
    public static String factors(int n) {

    	int numant = 0, cont = 0, x = 0, i = 0;
    	
    	String ret = "";
    	
        ArrayList<Integer> primos = new ArrayList<Integer>();
        
        for ( i = 2; i <= n / i; i++) {
            while (n % i == 0) {
            	
                primos.add(i);
                n = n/i;
                
            }
        }
        
        
        if (n > 1) {
        	primos.add(n);
        }
        
        
        
        for (i = 0; i < primos.size(); i++) {
        	
        	if ( primos.get(i) != numant ) {
        		
        		x = contar(primos, primos.get(i) );
        		
        		numant = primos.get(i);
        		
        		if ( x == 1 ) {
        			
        			ret =  ret + "(" + primos.get(i) + ")" ;
        			
        		} else {	
        		
        			ret = ret + "(" + primos.get(i) + "**" + x + ")" ;	
        		
        		}
        
        	}
        }
         
        return ret;
       
}
    
    
    public static int contar(ArrayList<Integer> arr, int b) {
    	
    	int cont = 0;

        for (Integer num : arr) {        	
        	if ( num == b  ) {        		
        	cont++;	
        	}
        } 
        return cont;
    }    
    
    
    
}