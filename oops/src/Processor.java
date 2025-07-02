package src;

public class Processor {
    String generation;
    int capacity;

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String toString() {
        return "{Generation=" + this.generation + ", Capacity=" + this.capacity + "}";
    }
}
