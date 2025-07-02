package src;

public class Harddrive {
    int size;
    String type;

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "{Size=" + this.size + ", Type=" + this.type + "}";
    }
}
