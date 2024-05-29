package operations.unionbuilders;

import operations.interfaces.SetFactory;

import java.util.Collection;
import java.util.TreeSet;

public class TreeSetFactory<T> implements SetFactory<T> {
    @Override
    public Collection<T> createSet() {
        return new TreeSet<>();
    }

    @Override
    public Collection<T> createSet(Collection<T> collection) {
        return new TreeSet<>(collection);
    }
}

