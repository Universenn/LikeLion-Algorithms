package day1021.solvebracket;

public class SolveBracket {
    public boolean solution(String s){

        while (s.indexOf("()")>=0){
            s = s.replace("()","");
        }
        boolean result =(s.length() == 0);


        return result;
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
