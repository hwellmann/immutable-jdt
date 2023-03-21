package demo.immutables;

import org.immutables.value.Value;

@Value.Immutable
public interface Foo2 extends Mixin2<ImmutableFoo2> {

    String bar();

    String blax();

    @Override
    default ImmutableFoo2 withProperty(String key, Object value) {
        return null;
    }
}
