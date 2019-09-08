import java.util.ArrayList;

public class SumOfSquares {
    
    public static int nSquaresFor(int n) {

    	int retorno=0;
    	
    	if (escuad(n)) {
    		
    		retorno = 1;
    		
    	} else if ( dos(n) ) {
    		
    		retorno = 2 ;
    	} 	   	
    	
    	else if ( (n - 7)%8 == 0  ) {
    		
    		retorno = 4;  }
    			
    		else if ( tres(n)  ) {
    	
    		retorno = 3;
    		
    	} else { retorno = 4; }
    	
    	return retorno;
    	
    }


    static boolean escuad(int x)  
    { 
        double r = Math.sqrt(x);      
        return ((r - Math.floor(r)) == 0); 
    }     
    
   public static boolean dos(int valor) {
    	
        int i, x = 0;
    	
        boolean retorno = true;
        
        ArrayListInteger arr = new ArrayListInteger();
        
        arr = factPrimos(valor);
    	
        for (i = 0; i  arr.size(); i++) {
        	
        	if ( arr.get(i) % 4 == 3%4 ) {
        		
        		x = contar(arr, arr.get(i) );
        		
        		if (x%2 != 0) {
        			
        			retorno = false;
        		}
        		
        	}
 
        }  
        
        return retorno;
    	
    }    
   
   
   public static boolean tres(int valor) {
   	
       int j, maxj2 = 0;
   	
       double x ;
       double maxj;
       
       boolean retorno = true;
       
             
       maxj =  ( Math.log10(valor15) )( Math.log10(4) ) ;
       
       maxj2 = (int) maxj;
          	   
           for (j = 1; j= maxj2; j++) {
    	          	   
        	   
        	   x =  (( valor  Math.pow(4, j) ) - 7 )8 ; 
        	   
        	   if ( (x - Math.floor(x)) == 0 ){

        		   System.out.println( j   + j );
        		   j = valor + 1;  
        		   retorno = false;
        	   }
        	    
           }
       
       return retorno;
   	
   }       
    
    public static ArrayListInteger factPrimos(int valor) {
        int n = valor;
        ArrayListInteger primos = new ArrayListInteger();
        
        for (int i = 2; i = n  i; i++) {
            while (n % i == 0) {
                primos.add(i);
                n = ni;
            }
        }
         
        if (n  1) {
            primos.add(n);
        }
        return primos;
    }    
    
    
    
    public static int contar(ArrayListInteger arr, int b) {
    	
    	int cont = 0;

        for (Integer num  arr) {        	
        	if ( num == b  ) {        		
        	cont++;	
        	}
        } 
        return cont;
    }    
}