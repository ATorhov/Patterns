package behavioral.interpreter.second.expressions;

import behavioral.interpreter.second.contracts.Expression;

import java.util.Map;

public class NumberExpression implements Expression {
    private int number;
    public NumberExpression(int number){
        this.number = number;
    }

    @Override
    public int interpret(Map<String, Integer> variables) {
        return number;
    }
}
