package hexlet.code.schemas;

import java.util.Objects;

public class NumberSchema extends BaseSchema {
    public NumberSchema required() {
        operator = operator
                .and(Objects::nonNull)
                .and(value -> value instanceof Integer);
        return this;
    }

    public NumberSchema positive() {
        operator = operator
                .and(value -> value == null || !(value instanceof Integer) || (int) value > 0);
        return this;
    }

    public NumberSchema range(int start, int end) {
        operator = operator
                .and(value -> value == null || !(value instanceof Integer) || (int) value >= start)
                .and(value -> value == null || !(value instanceof Integer) || (int) value <= end);
        return this;
    }
}
