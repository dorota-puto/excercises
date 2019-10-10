package puto.airbnb.model;

public enum Column {
    ID(0),
    FLAT_NAME(1),
    HOST_ID(2),
    HOST_NAME(3),
    NEIGHBOURHOOD_GROUP(4),
    GET_NEIGHBOURHOOD(5),
    ROOM_TYPE(8),
    PRICE(9),
    MINIMUM_NIGHTS(10),
    NUMBER_OF_REVIEWS(11),
    AVAILABILITY(15);

    private int id;

    Column(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
