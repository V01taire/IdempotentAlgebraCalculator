package operations.unionbuilders;

import operations.interfaces.SetFactory;

import java.util.Collection;
import java.util.HashSet;

public class HashSetFactory<T> implements SetFactory<T> {
    @Override
    public Collection<T> createSet() {
        return new HashSet<>();
    }

    @Override
    public Collection<T> createSet(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}

