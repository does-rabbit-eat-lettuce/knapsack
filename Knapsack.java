
public class Knapsack {
	
	// returns maximum of two integers 
    static int max(int a, int b) { return (a > b)? a : b; } 
      
    // Returns the maximum value that can be put in a knapsack of capacity W 
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
       // Base Case 
	   if (n == 0 || W == 0) 
	       return 0; 
	      
	   // If weight of the nth item >  Knapsack capacity W
	   // then it cannot be included
	   if (wt[n-1] > W) 
	      return knapSack(W, wt, val, n-1); 
	      
	   // Return the maximum of two cases:  
	   // nth item included  
	   // nth item not included 
	   else return max( val[n-1] + knapSack(W-wt[n-1], wt, val, n-1), 
	                    knapSack(W, wt, val, n-1) 
	                     ); 
	 } 
	 

	  public static void main(String args[]) 
	  { 
	       int val[] = new int[]{60, 80, 150}; 
	       int wt[] = new int[]{10, 20, 30}; 
	       int  W = 50; 
	       int n = val.length; 
	       System.out.println(knapSack(W, wt, val, n)); 
	   } 
	

}
