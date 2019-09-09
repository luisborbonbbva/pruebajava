public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {

    	int i, max = 0;     
      
    	for (i = 0; i < array.length -1 ; i++ ) {
    		    		
    		if (   array[i]*array[i+1] > max || max == 0) {
    			
    			max = array[i]*array[i+1];
    		}
    		
    	}

   	  return max;
    }
 }