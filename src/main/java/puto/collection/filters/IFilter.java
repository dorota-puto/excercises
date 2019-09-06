package puto.collection.filters;

public interface IFilter<T> {
    boolean isIncluded(T value);
}
