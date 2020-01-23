package stacksandqueues;

//resources:https://stackoverflow.com/questions/16874176/parenthesis-brackets-matching-using-stack-algorithm

import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input) {
        Stack<String>stack= new Stack<>();

        for (int i = 0; i < input.length(); i++) {

//            char currentBracket = input.charAt(i);
            String currentBracket = Character.toString(input.charAt(i));

            if (currentBracket.equals('{')  || currentBracket.equals('(') || currentBracket.equals('[')) {
                stack.push(currentBracket);
            }

            if (currentBracket.equals('}')  || currentBracket.equals(')') || currentBracket.equals(']')) {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }

            else return false;

        }

        return stack.isEmpty();
    }
}
