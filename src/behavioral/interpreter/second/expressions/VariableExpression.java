package behavioral.interpreter.second.expressions;

import behavioral.interpreter.second.contracts.Expression;

import java.util.Map;

public class VariableExpression implements Expression {
    private String variable;
    public VariableExpression(String variable){
        this.variable = variable;
    }
    @Override
    public int interpret(Map<String, Integer> variables) {
        if (variables.containsKey(variable)) {
            return variables.get(variable);
        }
        return 0;
    }
}
