class Solution {
    public int subtractProductAndSum(int n) 
    {
        int  t=0;
        int c=1;
        int sum=0;
        while(n>0)
        {
            t=n%10;
            c=c*t;
            sum+=t;
            n/=10;

        }
        int g=c-sum;
        return g;
        
    }
}