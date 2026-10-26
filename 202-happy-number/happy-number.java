class Solution {
    public boolean isHappy(int n) 
    {
        while(n!=1&&n!=4)
        {
        int temp=n;
        int sum=0;
        while(temp>0)
        {
            int dig=temp%10;
            sum=sum+dig*dig;
            temp/=10;

        }
        n=sum;
        }
        if(n==1)
        {
            return true;
        }
        return false;
        
    }
}