package hexlet.code.schemas;

import java.util.function.Predicate;

public abstract class BaseSchema {
    private Predicate<Object> operator = value -> true;

    public final Predicate<Object> getOperator() {
        return operator;
    }

    public final void setOperator(Predicate<Object> value) {
        this.operator = value;
    }

    public final boolean isValid(Object value) {
        return operator.test(value);
    }
}
