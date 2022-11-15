package hexlet.code.schemas;

public final class StringSchema extends BaseSchema {
    public StringSchema required() {
        getListOperators().add(sentence -> sentence != null && ((String) sentence).length() > 0);
        return this;
    }

    public StringSchema minLength(int minLength) {
        getListOperators().add(sentence -> sentence == null || ((String) sentence).length() >= minLength);
        return this;
    }

    public StringSchema contains(String value) {
        getListOperators().add(sentence -> sentence == null || ((String) sentence).contains(value));
        return this;
    }
}
