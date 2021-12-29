package demo.immutables;

import org.immutables.value.Value;

@Value.Immutable
public interface Foo extends Mixin<ImmutableFoo> {

    String bar();

    @Override
    default ImmutableFoo withProperty(String key, Object value) {
        return null;
    }
}
