public class GenericMultipleType<K, V> {
    private K roll;
    private V name;

    public GenericMultipleType(K roll, V name) {
        this.roll = roll;
        this.name = name;
    }

    public K getRoll() {
        return roll;
    }

    public void setRoll(K roll) {
        this.roll = roll;
    }

    public V getName() {
        return name;
    }

    public void setName(V name) {
        this.name = name;
    }
}
