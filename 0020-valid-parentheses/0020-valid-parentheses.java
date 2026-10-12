class Solution {
    public boolean isValid(String s) {
     String opening = "([{";
     String closing = ")]}";

     Stack<Character> st = new Stack<>();

    for(char ch : s.toCharArray()){
        if(opening.indexOf(ch) != -1){
            st.push(ch);
        }else{
            if(st.size() == 0)return false;

            char temp = st.pop();
            if(getChar(ch) != temp){
                return false;
            }
        }

    }   return st.size() == 0;
    }

    public  char getChar(char ch){
        switch(ch){
            case ')' : return '(';
            case ']' : return '[';
            case '}' : return '{';
            default : return ' ';
        }
    }

}