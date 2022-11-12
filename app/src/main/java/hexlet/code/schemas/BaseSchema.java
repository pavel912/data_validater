package hexlet.code.schemas;

import java.util.function.Predicate;

public abstract class BaseSchema {
    public Predicate<Object> operator = value -> true;

    public boolean isValid(Object value) {
        return operator.test(value);
    }
}
