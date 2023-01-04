class Solution{
  public int evalRPN(String[] tokens) {
        int stack[]=new int [tokens.length];
        int idx=-1;
        int op1;
        int op2;
        int result=0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i]!="+"&&tokens[i]!="-"&&tokens[i]!="*"&&tokens[i]!="/"){
                idx++;
                stack[idx]=Integer.parseInt(tokens[i]);
            }
            else{
                op1=stack[idx];
                op2=stack[--idx];
                if(tokens[i]=="+"){
                    result=op2+op1;
                    stack[idx]=result;
                }
                else if(tokens[i]=="-"){
                    result=op2-op1;
                    stack[idx]=result;
                }
                else if(tokens[i]=="*"){
                    result=op2*op1;
                    stack[idx]=result;
                }
                else if(tokens[i]=="/"){
                    result=op2/op1;
                    stack[idx]=result;
                }
            }
        }
        return result;
    }
}
