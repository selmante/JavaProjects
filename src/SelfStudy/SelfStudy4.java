package SelfStudy;

public class SelfStudy4 {

	public static void main(String[] args) {
	int numbers[]= {12, 65, 78, 1, 6, 45, 71, 65, 34, 89},oddCount=0,evenCount=0;
    for (int i=0; i<numbers.length; i++) {
    	if (numbers[i]%2==0) {
    		evenCount++;
    		
    	}
     else { oddCount++;
    }
    }System.out.println("number of even numbers " + evenCount );
    	System.out.println("number of odd numbers " + oddCount );
    	
    }
	}


