package hexlet.code;

import java.util.Objects;
import java.util.function.Predicate;

public class StringSchema {
    private Predicate<String> operator = value -> true;

    public StringSchema required() {
        operator = operator
                .and(Objects::nonNull)
                .and(sentence -> sentence.length() > 0);
        return this;
    }

    public StringSchema minLength(int minLength) {
        operator = operator.and(sentence -> sentence.length() >= minLength);
        return this;
    }

    public StringSchema contains(String value) {
        operator = operator.and(sentence -> sentence.contains(value));
        return this;
    }

    public boolean isValid(String value) {
        return operator.test(value);
    }
}
