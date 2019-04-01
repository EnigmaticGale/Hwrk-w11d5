public enum PlaneType {
    BOEING_737(300),
    BOEING_787(800),
    BOEING_757(500),
    AIRBUS_320(1000),
    BIPLANE(2);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity () {
        return this.capacity;
    }
}


