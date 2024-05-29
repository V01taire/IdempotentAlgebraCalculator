package operations.interfaces;

import java.util.Collection;

public interface SetFactory<T> {
    Collection<T> createSet();
    Collection<T> createSet(Collection<T> collection);
}

