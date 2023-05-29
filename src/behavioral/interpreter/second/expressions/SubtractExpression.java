package behavioral.interpreter.second.expressions;

import behavioral.interpreter.second.contracts.Expression;

import java.util.Map;

public class SubtractExpression implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;
    public SubtractExpression(Expression leftExpression, Expression rightExpression){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Map<String, Integer> variables) {
        return leftExpression.interpret(variables) - rightExpression.interpret(variables);
    }
}
