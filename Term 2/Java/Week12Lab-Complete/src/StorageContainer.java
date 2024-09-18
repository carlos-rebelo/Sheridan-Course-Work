public class StorageContainer <T>{
    private T payload;
    private int weight;

    public StorageContainer(T payload, int weight) {
        this.payload = payload;
        this.weight = weight;
    }

    public T getPayload()
    {
        return payload;
    }

    public void setPayload(T payload)
    {
        this.payload = payload;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "StorageContainer [payload=" + payload + ", weight=" + weight + "]";
    }

}
