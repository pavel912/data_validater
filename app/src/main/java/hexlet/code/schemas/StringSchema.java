package hexlet.code.schemas;

import java.util.Objects;

public final class StringSchema extends BaseSchema {
    public StringSchema required() {
        setOperator(getOperator()
                .and(Objects::nonNull)
                .and(sentence -> ((String) sentence).length() > 0));
        return this;
    }

    public StringSchema minLength(int minLength) {
        setOperator(getOperator().and(sentence -> sentence == null || ((String) sentence).length() >= minLength));
        return this;
    }

    public StringSchema contains(String value) {
        setOperator(getOperator().and(sentence -> sentence == null || ((String) sentence).contains(value)));
        return this;
    }
}
