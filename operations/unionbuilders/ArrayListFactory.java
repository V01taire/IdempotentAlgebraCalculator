package operations.unionbuilders;

import operations.interfaces.SetFactory;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListFactory<T> implements SetFactory<T> {
    @Override
    public Collection<T> createSet() {
        return new ArrayList<>();
    }

    @Override
    public Collection<T> createSet(Collection<T> collection) {
        return new ArrayList<>(collection);
    }
}

