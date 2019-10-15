package puto.airbnb.model;

import java.util.Objects;

public class Neighbourhood {
    private final String neighbourhoodGroup;
    private final String getNeighbourhood;


    public Neighbourhood (String neighbourhoodGroup, String getNeighbourhood){
        this.neighbourhoodGroup=neighbourhoodGroup;
        this.getNeighbourhood=getNeighbourhood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neighbourhood that = (Neighbourhood) o;
        return getNeighbourhoodGroup().equals(that.getNeighbourhoodGroup()) &&
                getGetNeighbourhood().equals(that.getGetNeighbourhood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNeighbourhoodGroup(), getGetNeighbourhood());
    }

    public String getNeighbourhoodGroup() {
        return neighbourhoodGroup;
    }
    public String getGetNeighbourhood() {
        return getNeighbourhood;
    }

}
