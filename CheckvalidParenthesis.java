import java.util.Stack;

public class CheckvalidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack <Character>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            // System.out.println(ch);
            if(ch == '('){
                stack.push(ch);
            }else if(ch =='{'){
                stack.push(ch);
            }else if(ch == '['){
                stack.push(ch);
            }

            else if(ch == ')'){
                if((!stack.isEmpty()) && stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else if(ch == '}'){
                if((!stack.isEmpty()) && stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else if(ch == ']'){
                if((!stack.isEmpty()) && stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        if(stack.isEmpty())
        {
            return true;
        }else{
            return false;
        }
    }

    //Main fzunction
    public static void main(String[] args){
        String str1 = "()[]{}";
        if(isValid(str1) == true){
            System.out.println("Accepted");
        }
        else{
            System.out.println("Not Accepted");
        }
    }
}
