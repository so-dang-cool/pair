package so.dang.cool;

import java.io.Serializable;
import java.util.Objects;

/**
 * A pair of two values.
 */
public class Pair<L, R> implements Serializable {
    private static final long serialVersionUID = 6035080875813945322L;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public static final <L, R> Pair<L, R> of(L left, R right) {
        return new Pair<>(left, right);
    }

    private L left;

    private R right;

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("[")
            .append(left)
            .append(", ")
            .append(right)
            .append("]")
            .toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (that == null || !(that instanceof Pair)) { return false; }

        Pair thatPair = (Pair) that;

        return Objects.equals(this.left, thatPair.left) && Objects.equals(this.right, thatPair.right);
    }
}
