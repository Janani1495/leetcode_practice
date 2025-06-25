class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();int a=0;int b=0;int ans=0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
               a= stack.pop();
                b=stack.pop();
                ans=a+b;
                stack.push(ans);
            }
            else if(tokens[i].equals("*")){
                a=stack.pop();
                b=stack.pop();
                ans=a*b;
                stack.push(ans);
            }
            else if(tokens[i].equals("-")){
                a=stack.pop();
                b=stack.pop();
                ans=b-a;
                stack.push(ans);
            }
            else if(tokens[i].equals("/")){
                a=stack.pop();
                b=stack.pop();
                ans=b/a;
                stack.push(ans);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }return stack.pop();
    }
}