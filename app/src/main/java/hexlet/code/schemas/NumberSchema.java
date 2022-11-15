package hexlet.code.schemas;

public final class NumberSchema extends BaseSchema {
    public NumberSchema required() {
        getListOperators().add(value -> value instanceof Integer);
        return this;
    }

    public NumberSchema positive() {
        getListOperators().add(value -> isNotRequired(value) || (int) value > 0);
        return this;
    }

    public NumberSchema range(int start, int end) {
        getListOperators().add(value -> isNotRequired(value) || (int) value >= start && (int) value <= end);
        return this;
    }

    private boolean isNotRequired(Object value) {
        return !(value instanceof Integer);
    }
}
