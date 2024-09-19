class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
      return solve(expression,0,expression.length()-1);  
    }
    public List<Integer>solve(String exp,int s,int e){
         List<Integer>list=new ArrayList<>();
         //base case 
         if(s==e){
            int num=exp.charAt(s)-'0';
            list.add(num);
            return list;
         }
         //special base case for double digit
         if((e-s)==1 && Character.isDigit(exp.charAt(s))){
            // int num1=exp.charAt(s)-'0';
            // int num2=exp.charAt(e)-'0';
            int num=Integer.parseInt(exp.substring(s,e+1));
            list.add(num);
            return list;

         }

         for(int i=s;i<=e;i++){
            if(Character.isDigit(exp.charAt(i))){
                continue;
            }
            char ch=exp.charAt(i);
            List<Integer>left=solve(exp,s,i-1);
            List<Integer>right=solve(exp,i+1,e);
            for(int l:left){
                for(int r:right){
                    if(ch=='*'){
                        list.add(l*r);
                    }else if(ch=='+'){
                        list.add(l+r);
                    }else{
                        list.add(l-r);
                    }
                }
            }
         }
       return list;
    }
}