/*
E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
 */

public class GenericType<T> {
    private T roll;

    public GenericType(T roll) {
        this.roll = roll;
    }

    public T getRoll() {
        return roll;
    }

    public void setRoll(T roll) {
        this.roll = roll;
    }
}
