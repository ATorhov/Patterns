package behavioral.interpreter.second.contracts;

import java.util.Map;

public interface Expression {
    int interpret(Map<String, Integer> variables);
}
