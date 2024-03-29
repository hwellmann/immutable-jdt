package demo.immutables;

import java.util.Arrays;
import java.util.List;

public interface Mixin<T> {

    T withProperty(String key, Object value);

    default List<String> warnings() {
        return Arrays.asList("foo", "bar");
    }
}