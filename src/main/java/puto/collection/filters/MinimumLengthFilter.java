package puto.collection.filters;

public class MinimumLengthFilter implements IFilter {

    private int minimumLength;

    public MinimumLengthFilter(int minimumLength) {
        this.minimumLength = minimumLength;
    }

    @Override
    public boolean isIncluded(String value) {
        return value.length() >= minimumLength;
    }
}
