package operations;

import operations.interfaces.SetFactory;

import java.util.Arrays;
import java.util.Collection;

public record IdempotentUnion<T>(SetFactory<T> setFactory) {

    /**
     * Performs idempotent union on a collection of elements.
     *
     * @param collection the collection of elements
     * @return the union of elements as a new collection
     * @throws IllegalArgumentException if the collection is empty
     */
    public Collection<T> performUnion(Collection<T> collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Collection is empty");
        }
        return setFactory.createSet(collection);
    }

    /**
     * Performs idempotent union on a matrix of elements.
     *
     * @param matrix the matrix of elements
     * @return the union of elements as a new collection
     * @throws IllegalArgumentException if the matrix is empty or contains empty rows
     */
    public Collection<T> performUnion(T[][] matrix) {
        if (matrix.length == 0) {
            throw new IllegalArgumentException("Matrix is empty");
        }

        Collection<T> resultSet = setFactory.createSet();
        for (T[] row : matrix) {
            if (row.length == 0) {
                throw new IllegalArgumentException("Matrix contains empty row");
            }
            resultSet.addAll(Arrays.asList(row));
        }
        return resultSet;
    }
}
