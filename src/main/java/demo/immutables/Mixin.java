package demo.immutables;

import java.util.Arrays;
import java.util.List;

/**
 * This allows to mixin the old-style error/Warning stuff into immutable objects
 */
public interface Mixin<T> {

    T withProperty(String key, Object value);

    default List<String> warnings() {
        return (List<String>) Arrays.asList("foo", "bar");
    }

}