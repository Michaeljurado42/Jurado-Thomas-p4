package cs1302.calc;

/* Implement the Math intere using iteration here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * REPLACE ME WITH ACTUAL JAVADOC FOR THIS CLASS.
 *
 * @author AUTHOR
 */
public class IterativeMath implements Math {

    public int inc(int n) {
     return n+1;
    } // inc

    public int dec(int n) {
        return n-1;
    } // dec

    public int add(int lhs, int rhs) {
    	int sum = lhs;
    	if(rhs == 0) return sum;
    	while(rhs >=1){
    		sum = inc(sum);
    		rhs = dec(rhs);
    	}
    	return sum;		
    } // add

    public int sub(int lhs, int rhs) {
        int dif = lhs;
        if(rhs ==0) return dif;
        while(rhs>=1){
        	dif = dec(dif);
        	rhs = dec(rhs);
        }
        return dif;
    } // sub

    public int mul(int lhs, int rhs) {
        int product =lhs;
        if( (rhs ==0) || (lhs == 0) ) return 0;
        while(rhs >1){
        	product = add(product,lhs); //rhs is subtracted by one by the end of this method and control returns here.
        	
          rhs = sub(rhs,1); // rhs = 0 after subtracting the final one. Thus zero is returned by the subtraction 
        						// method and the loop ends after rhs is checked and found to be under 1.
        }
        return product;
    } // mul

    public int div(int lhs, int rhs) {
        int quotient = 0;
        if(rhs ==0) return 0;
        while(lhs >= 1){
        	lhs = sub(lhs,rhs);
        	quotient = add(quotient,1);
        }
        return quotient;
    } // div

    public int fac(int n) {// not working.
    	  int product =1;
        if( n == 0 || n ==1) return product;
        while(n >=1){
        product = mul(product,n);
        n= sub(n,1);
        }
        return product;
    } // fac

    public int pow(int lhs, int rhs) {
        int sum = 1;
        if (rhs == 0) { return 1; }
        while (rhs >= 1) {
          rhs = sub(rhs, 1);
        	sum= mul(lhs,sum);
        }
        return sum;
    } // pow

    public static void main(String[] args){
    	IterativeMath i = new IterativeMath();
    	System.out.println("Add: "+ i.add(99,2));
    	System.out.println("Subtract: "+ i.sub(80,12));
    	System.out.println("MULTIPLY: " + i.mul(8,7));
    	System.out.println("Div"+ i.div(100,2));
    	System.out.println("power"+ i.pow(3,5));
      System.out.println("Facts"+ i.fac(6));
    }
} // IterativeMath
