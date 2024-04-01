class Solution {
public:
    int lengthOfLastWord(string s) {
        int res=0,t=0;

        for(int i=s.length()-1;i>=0;i--){
            if(res!=0 && s[i]==' '){
                break;
            }
            else if(s[i] !=' '){
                t++;
                res++;
            }
        }
        return res;
    }
};