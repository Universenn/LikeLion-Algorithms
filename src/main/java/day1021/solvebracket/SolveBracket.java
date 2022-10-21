package day1021.solvebracket;

import java.util.Stack;

public class SolveBracket {
    public boolean solution1(String s){

        while (s.indexOf("()")>=0){
            s = s.replace("()","");
        }
        boolean result =(s.length() == 0);


        return result;
    }

    public boolean solution2(String s){
        while (s.indexOf("()") >= 0){
            String[] split = s.split("\\(\\)");
            s = String.join("",split);
        }
        return s.length() == 0;
    }

    public boolean solution(String s){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.size() == 0 && ch == ')') return false;
            if ('(' == s.charAt(i)){
                st.push(ch);
            } else if (ch == ')') {
                st.pop();
            }
        }
        return st.isEmpty();
    }



    public static void main(String[] args) {
        String q1 = "(())";
        String q2 = "()()";
        String q3 = "(())()";
        String q4 = ")()(";
        String q5 = "(()(";
        // "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"
    }
}
