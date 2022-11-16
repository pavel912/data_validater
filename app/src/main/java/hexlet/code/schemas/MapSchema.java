package hexlet.code.schemas;

import java.util.HashMap;
import java.util.Map;

public final class MapSchema extends BaseSchema {
    public MapSchema required() {
        addToListOperators(value -> value instanceof HashMap<?, ?>);
        return this;
    }

    public MapSchema sizeof(int size) {
        required();
        addToListOperators(value -> ((HashMap<?, ?>) value).size() >= size);
        return this;
    }

    public MapSchema shape(Map<String, BaseSchema> schemas) {
        required();
        addToListOperators(checkedMap -> ((HashMap<?, ?>) checkedMap)
                .keySet() //get keySet of checked Map
                .stream()
                .allMatch(checkedMapKey -> schemas // check every key
                        .get(checkedMapKey) // get Schema of a key
                        .isValid(((HashMap<?, ?>) checkedMap)
                                .get(checkedMapKey)))); // check if value of a key is valid
        return this;
    }
}
