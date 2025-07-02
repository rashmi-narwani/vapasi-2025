package src;

public class Ram {
    int size;
    String generation;

    public void setSize(int size) {
        this.size = size;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String toString() {
        return "{Size=" + this.size + ", Generation=" + this.generation + "}";
    }
}
