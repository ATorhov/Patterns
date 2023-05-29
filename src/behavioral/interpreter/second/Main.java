package behavioral.interpreter.second;

import behavioral.interpreter.second.contracts.Expression;
import behavioral.interpreter.second.expressions.AddExpression;
import behavioral.interpreter.second.expressions.NumberExpression;
import behavioral.interpreter.second.expressions.SubtractExpression;
import behavioral.interpreter.second.expressions.VariableExpression;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Expression x = new VariableExpression("x");
        Expression y = new VariableExpression("y");
        Expression addition = new AddExpression(x, y);
        Expression subtraction = new SubtractExpression(addition, new NumberExpression(20));

        Map<String, Integer> variables = Map.of("x", 10, "y", 5);
        int result = subtraction.interpret(variables);

        System.out.println("Result: "+result);

    }
}
