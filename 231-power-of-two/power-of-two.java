class Solution {
    public boolean isPowerOfTwo(int n)
     {
        int t=n;
        if(t<=0)
        {
            return false;
        }
        while(t>1)
        {



         if(t%2!=0)
         {
            return false;
            
         }
         t=t/2;

        }
        
            return true;
        
        
    }
}