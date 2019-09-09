class Persist {
	public static int persistence(long n) {
   	
    	int cont = 0;

    	while (n > 9) {
    		
    		n = modular(n);
    		
    		cont++;
    	}
    	
      return cont;
}
    	

    public static int modular(Long x) {
	
    	long mult=1;
	
    	while (x > 1) {
			
    		mult=mult*(x%10);
    		x = x/10;
		
    	}
    	
    	return (int) mult;    }	
    	
}
    	
    	