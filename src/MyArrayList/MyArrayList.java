package MyArrayList;


import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable{

    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int size = 0;

    public void add(T item) {
        if (this.size == array.length - 1)
            resize(array.length * 2);
        array[this.size++] = item;
    }

    public T get(int index) {
        return (T)array[index];
    }

    public void remove(int index) {
        for (int i = index; i < this.size; i++)
            this.array[i] = this.array[i + 1];
        this.array[this.size] = 0;
        this.size--;
        if (this.array.length > INIT_SIZE && this.size < this.array.length / CUT_RATE)
            resize(this.array.length / 2);
    }


    public int size() {
        return this.size;
    }


    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(this.array, 0, newArray, 0, this.size);
        this.array = newArray;
    }

    @Override
    public String toString() {
        for (Object a : this.array) {
            if (a != null)
                System.out.println(a);
        }
        System.out.println();
        return null;
    }

//    @Override
//    public boolean hasNext() {
//        return currentIndex < size && array[currentIndex] != null;
//    }
//
//    @Override
//    public T next() {
//        return (T)array[currentIndex++];
//    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size && array[currentIndex] != null;
            }

            @Override
            public T next() {
                return (T)array[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}
