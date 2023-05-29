package behavioral.interpreter.first.patterns;

import behavioral.interpreter.first.contracts.Pattern;

import java.util.Stack;

public class InfixToPostfixPattern implements Pattern {
    @Override
    public String conversion(String exp) {

        int priority = 0;
        String postfix = "";
        Stack<Character> s1 = new Stack<Character>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                if (s1.isEmpty())
                    s1.push(ch);
                else {
                    Character chTop = s1.peek();
                    if (chTop == '*' || chTop == '/')
                        priority = 1;
                    else
                        priority = 0;

                    if (priority == 1) {
                        if (ch == '*' || ch == '/' || ch == '%') {
                            postfix += s1.pop();
                            i--;
                        } else {
                            postfix += s1.pop();
                            i--;
                        }
                    } else {
                        if (ch == '+' || ch == '-') {
                            postfix += s1.pop();
                            i--;
                        }
                        s1.push(ch);
                    }
                }
            } else {
                postfix += ch;
            }
        }

        while (!s1.isEmpty()) {
            postfix += s1.pop();
        }

        return postfix;
    }
}
