public class ParameterizedGenericType<T extends GenericType,V extends String>  {
    private T genericType;
    private V name;

    public ParameterizedGenericType(T genericType, V name) {
        this.genericType = genericType;
        this.name = name;
    }

    public T getAccNo() {
        return genericType;
    }
    public void setName(V name){
        this.name = name;
    }
    public V getName() {
        return name;
    }
}
