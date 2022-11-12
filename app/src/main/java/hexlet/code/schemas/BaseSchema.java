package hexlet.code.schemas;

import java.util.function.Predicate;

public abstract class BaseSchema {
    private Predicate<Object> operator = value -> true;

    public Predicate<Object> getOperator() {
        return operator;
    }

    public void setOperator(Predicate<Object> operator) {
        this.operator = operator;
    }

    public final boolean isValid(Object value) {
        return operator.test(value);
    }
}
