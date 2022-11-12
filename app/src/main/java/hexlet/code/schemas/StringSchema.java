package hexlet.code.schemas;

import java.util.Objects;

public class StringSchema extends BaseSchema {
    public StringSchema required() {
        operator = operator
                .and(Objects::nonNull)
                .and(sentence -> ((String) sentence).length() > 0);
        return this;
    }

    public StringSchema minLength(int minLength) {
        operator = operator.and(sentence -> sentence == null || ((String) sentence).length() >= minLength);
        return this;
    }

    public StringSchema contains(String value) {
        operator = operator.and(sentence -> sentence == null || ((String) sentence).contains(value));
        return this;
    }
}
