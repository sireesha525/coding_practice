class Solution:
    def countDigits(self, num: int) -> int:
        t=num
        c=0
        while(num>0):
            d=num%10
            if(t%d==0):
                c=c+1
            num=num//10
        return c
        