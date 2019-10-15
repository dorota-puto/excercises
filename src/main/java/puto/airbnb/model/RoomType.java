package puto.airbnb.model;

public enum RoomType {
    PRIVATE_ROOM("Private name"),
    SHARED_ROOM("Shared room"),
    ENTIRE_HOME("Entire home/apt");

    private String name;

    RoomType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static RoomType createFromName(String name) {

        for (RoomType roomType : RoomType.values()) {
            if (roomType.name.equals(name)) {
                return roomType;
            }
        }
        throw new IllegalArgumentException();
    }
}
