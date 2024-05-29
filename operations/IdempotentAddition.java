package operations;

import operations.interfaces.SetFactory;

import java.util.Collection;

public class IdempotentAddition<T extends Comparable<T>> {

    private final SetFactory<T> setFactory;

    public IdempotentAddition(SetFactory<T> setFactory) {
        this.setFactory = setFactory;
    }

    /**
     * Performs idempotent addition on a collection of elements.
     *
     * @param collection the collection of elements
     * @return the maximum element in the collection
     * @throws IllegalArgumentException if the collection is empty
     */
    public T performAddition(Collection<T> collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Collection is empty");
        }

        T result = null;
        for (T element : collection) {
            if (result == null || element.compareTo(result) > 0) {
                result = element;
            }
        }
        return result;
    }

    /**
     * Performs idempotent addition on a matrix of elements.
     *
     * @param matrix the matrix of elements
     * @return the maximum element in the matrix
     * @throws IllegalArgumentException if the matrix is empty or contains empty rows
     */
    public T performAddition(T[][] matrix) {
        if (matrix.length == 0) {
            throw new IllegalArgumentException("Matrix is empty");
        }

        T result = null;
        for (T[] row : matrix) {
            if (row.length == 0) {
                throw new IllegalArgumentException("Matrix contains empty row");
            }
            for (T element : row) {
                if (result == null || element.compareTo(result) > 0) {
                    result = element;
                }
            }
        }
        return result;
    }

    public SetFactory<T> getSetFactory() {
        return setFactory;
    }
}
