import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;

public class Stack<T> implements StackInterface<T> {

    private int maxSize;
    private T[] array;
    private T top;

    public Stack(Class<T> type,int maxSize) {
        this.maxSize = maxSize;
        this.array = (T[]) Array.newInstance(type, maxSize);
    }

    @Override
    public void push(T object) {
        int placeToInsert = indexOf(top) == -1 ? 0 : indexOf(top) +1;
        array[placeToInsert] = object;
        top = object;
    }

    @Override
    public T remove() {
        T result = array[indexOf(top)];
        array[indexOf(top)] = null;
        return result;
    }

    @Override
    public Integer indexOf(T object) {
        for (int i = 0; i <maxSize; i++) {
            if (array[i] == null) {
                return -1;
            } else if (array[i] == object) {
                return i;
            }
        }
        return null;
    }

    @Override
    public T peek() {
        return array[indexOf(top)];
    }

    @Override
    public Integer getSize() {
        return maxSize;
    }

    @Override
    public Integer freeSpaceLeft() {
        return maxSize - indexOf(top)-1;
    }
}
