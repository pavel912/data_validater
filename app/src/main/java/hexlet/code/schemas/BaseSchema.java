package hexlet.code.schemas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class BaseSchema {
    private List<Predicate<Object>> listOperators = new ArrayList<>();

    public final void addToListOperators(Predicate<Object> predicate) {
        listOperators.add(predicate);
    }

    public final boolean isValid(Object value) {
        return listOperators.stream().allMatch(predicate -> predicate.test(value));
    }
}
