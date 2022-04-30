package so.dang.cool;

import java.io.Serializable;
import java.util.Objects;

/**
 * A pair of two values, a left and a right.
 *
 * @param <L> The left type
 * @param <R> The right type
 *
 * The identical class (source identical) is vended as two versions:
 * <p>
 * {@link so.dang.cool.Pair} and its {@link #getLeft()} and {@link #getRight()}
 * methods are fine to use forever. (Although, I'd recommend an immutable type
 * instead if you can get/make it, and to give better context than left/right)
 * <p>
 * {@link javafx.util.Pair} and its {@link #getLeft()} and {@link #getRight()}
 * methods are a band-aid for {@code ClassNotFoundException} errors encountered
 * when upgrading to JDK 11 or higher.
 * <p>
 * The {@code ClassNotFoundException} is tricky. {@link javafx.util.Pair} is
 * part of a JavaFX visual effects framework, and that was part of many JDK
 * distributions for a while. The Pair type in particular attracted a bit of
 * usage, but in ways that are unmodeled in package management. (Hey it makes
 * sense, it was just part of the JDK after all.) Now, it's easy enough to
 * upgrade your own code, but if some other dependency was trying to use this
 * tempting little pair class... failure! There's a similar story for library
 * vendors when trying to raise the version required and the effect on your
 * consumers.
 * <p>
 * Unless you're trying to get Unless you intend to do visual effects, bringing
 * in the whole JavaFX project will be too much size/hassle/etc for many cases.
 * Therefore, we can use this tiny little dependency as a shim until unneeded.
 * <p>
 * A no-dependency alternative is the "Entry" type of Map classes. For example
 * {@code java.util.AbstractMap.SimpleEntry<K,V>} or
 * {@code java.util.AbstractMap.SimpleImmutableEntry<K,V>}
 */
public class Pair<L, R> implements Serializable {
    private static final long serialVersionUID = 6035080875813945322L;

    private L left;
    private R right;

    /**
     * Make a Pair of things.
     * @param left The left thing
     * @param right The right thing
     */
    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Make a Pair of things.
     * @param <L> The left type
     * @param <R> The right type
     * @param left The left thing
     * @param right The right thing
     * @return a new Pair
     */
    public static final <L, R> Pair<L, R> of(L left, R right) {
        return new Pair<>(left, right);
    }

    /**
     * Get the left value.
     * @return the left value
     */
    public L getLeft() {
        return left;
    }

    /**
     * Get the left value. An alias for the {@link #getLeft()} method, the
     * "getKey" convention is to support use cases where {@link javafx.util.Pair}
     * was used and may be difficult to untangle.
     * @return the left value
     */
    @Deprecated
    public L getKey() {
        return left;
    }

    /**
     * Get the right value.
     * @return the right value
     */
    public R getRight() {
        return right;
    }

    /**
     * Get the right value. An alias for the {@link #getRight()} method, the
     * "getKey" convention is to support use cases where {@link javafx.util.Pair}
     * was used and may be difficult to untangle.
     * @return the right value
     */

    @Deprecated
    public L getValue() {
        return left;
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

        Pair pair = (Pair) that;

        return Objects.equals(this.left, pair.left) && Objects.equals(this.right, pair.right);
    }
}
