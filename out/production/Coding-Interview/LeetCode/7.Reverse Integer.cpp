class Solution {
public:
    int reverse(int x) {
        if(x<-INT_MAX || x>INT_MAX)return 0;
        
        long long ans = 0;
        int minus = 0;
        if(x<0){
            minus = 1;
            x = abs(x);
        }
    
        while(x>0){
            int r = x%10;
            ans = ans*10 + r;
            x = x/10;
        }
        
        if(ans>INT_MAX || ans<-INT_MAX)return 0;
        
        if(minus)return -ans;
        
        return ans;
    }
};