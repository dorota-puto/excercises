package puto.airbnb.dto;

import java.math.BigDecimal;

public class AirbnbFlatDto {

    private Integer id;
    private String flatName;
    private Integer hostId;
    private String hostName;
    private String neighbourhoodGroup;
    private String getNeighbourhood;
    private String roomType;
    private BigDecimal price;
    private Integer minimumNights;
    private Integer numberOfReviews;
    private Integer availability;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlatName() {
        return flatName;
    }

    public void setFlatName(String flatName) {
        this.flatName = flatName;
    }

    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getNeighbourhoodGroup() {
        return neighbourhoodGroup;
    }

    public void setNeighbourhoodGroup(String neighbourhoodGroup) {
        this.neighbourhoodGroup = neighbourhoodGroup;
    }

    public String getGetNeighbourhood() {
        return getNeighbourhood;
    }

    public void setGetNeighbourhood(String getNeighbourhood) {
        this.getNeighbourhood = getNeighbourhood;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getMinimumNights() {
        return minimumNights;
    }

    public void setMinimumNights(Integer minimumNights) {
        this.minimumNights = minimumNights;
    }

    public Integer getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(Integer numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }
}
