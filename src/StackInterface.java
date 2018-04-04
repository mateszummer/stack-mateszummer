public interface StackInterface <T> {

    void push(T object);
    T remove();
    Integer indexOf(T object);
    T peek();
    Integer getSize();
    Integer freeSpaceLeft();
}
