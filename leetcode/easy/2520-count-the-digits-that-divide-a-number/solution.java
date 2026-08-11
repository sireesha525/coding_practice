class Solution {
    public int countDigits(int num) {
       int t=num;
       int c=0;
       int d;
        while(num>0){
            d=num%10;
            if(d!=0 && t%d==0){
                c++;
            }
            num=num/10;

        }
    return c;
        
    }
}