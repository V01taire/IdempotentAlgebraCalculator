package operations;

import java.util.Collection;

public class IdempotentMultiplication {

    /**
     * Performs idempotent multiplication (sum) on a collection of numbers.
     *
     * @param collection the collection of numbers
     * @return the sum of all numbers in the collection
     * @throws IllegalArgumentException if the collection is empty
     */
    public double performMultiplication(Collection<? extends Number> collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Collection is empty");
        }

        double result = 0;
        for (Number number : collection) {
            result += number.doubleValue();
        }
        return result;
    }

    /**
     * Performs idempotent multiplication (sum) on a matrix of numbers.
     *
     * @param matrix the matrix of numbers
     * @return the sum of all numbers in the matrix
     * @throws IllegalArgumentException if the matrix is empty or contains empty rows
     */
    public double performMultiplication(Number[][] matrix) {
        if (matrix.length == 0) {
            throw new IllegalArgumentException("Matrix is empty");
        }

        double result = 0;
        for (Number[] row : matrix) {
            if (row.length == 0) {
                throw new IllegalArgumentException("Matrix contains empty row");
            }
            for (Number number : row) {
                result += number.doubleValue();
            }
        }
        return result;
    }
}
