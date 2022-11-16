package hexlet.code.schemas;

public final class NumberSchema extends BaseSchema {
    public NumberSchema required() {
        addToListOperators(value -> value instanceof Integer);
        return this;
    }

    public NumberSchema positive() {
        required();
        addToListOperators(value -> (int) value > 0);
        return this;
    }

    public NumberSchema range(int start, int end) {
        required();
        addToListOperators(value -> (int) value >= start && (int) value <= end);
        return this;
    }
}
