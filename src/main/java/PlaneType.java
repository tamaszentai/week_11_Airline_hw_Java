public enum PlaneType {

    BOEING747(172000,550),
    BOEING777(134800, 440),
    AIRBUS320(110000,320),
    AIRBUS380(140000,380),
    AIRBUSSML(1000, 2 );

    private final int totalWeight;
    private final int capacity;

    PlaneType(int totalWeight, int capacity) {
        this.totalWeight = totalWeight;
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getTotalWeight(){
        return totalWeight;
    }
}
