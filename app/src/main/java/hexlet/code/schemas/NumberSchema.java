package hexlet.code.schemas;

import java.util.Objects;

public final class NumberSchema extends BaseSchema {
    public NumberSchema required() {
        setOperator(getOperator()
                .and(Objects::nonNull)
                .and(value -> value instanceof Integer));
        return this;
    }

    public NumberSchema positive() {
        setOperator(getOperator()
                .and(value -> isNotRequired(value) || (int) value > 0));
        return this;
    }

    public NumberSchema range(int start, int end) {
        setOperator(getOperator()
                .and(value -> isNotRequired(value) || (int) value >= start)
                .and(value -> isNotRequired(value) || (int) value <= end));
        return this;
    }

    private boolean isNotRequired(Object value) {
        return value == null || !(value instanceof Integer);
    }
}
