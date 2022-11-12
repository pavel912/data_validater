package hexlet.code.schemas;

import java.util.HashMap;
import java.util.Objects;

public class MapSchema extends BaseSchema {
    public MapSchema required() {
        operator = operator.and(Objects::nonNull);
        return this;
    }

    public MapSchema sizeof(int size) {
        operator = operator.and(value -> ((HashMap) value).size() >= size);
        return this;
    }
}
