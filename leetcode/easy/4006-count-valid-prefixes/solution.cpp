class Solution {
public:
    int countValidPrefixes(string s) {
        int count=0;
        int n=s.size();
        int zero=0;
        int one=0;
        for(int i=0;i<n;i++){
            if(s[i]=='1'){
                one++;
            }
            else{
                zero++;
            }
            if(abs(zero-one)<=1){
            count++;
        }
    }
    return count;
    }
};