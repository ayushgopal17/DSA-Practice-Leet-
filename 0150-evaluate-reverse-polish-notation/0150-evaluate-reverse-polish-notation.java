class Solution {
    public int evalRPN(String[] token) {
        int n=token.length;
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<n;i++){
            if(token[i].equals("+")){
                int num2=st.pop();
                int num1=st.pop();
             
             st.push(num1+ num2);}
             else if(token[i].equals("-")){
                int num2=st.pop();
                int num1=st.pop();

                st.push(num1-num2);
             }
             else if(token[i].equals("*")){
                int num2=st.pop();
                int num1=st.pop();

                st.push(num1 * num2);
             }
             else if(token[i].equals("/")){
                int num2=st.pop();
                int num1=st.pop();
                st.push(num1 / num2);
             }
             else{
                st.push(Integer.parseInt(token[i]));
             }
             }
             return st.pop();
            }
        }