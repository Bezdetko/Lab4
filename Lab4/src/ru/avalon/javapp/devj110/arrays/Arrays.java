
package ru.avalon.javapp.devj110.arrays;

public interface Arrays {
    int SIZE = 1024;
    boolean check(int index);
    void set(int index);
    void set(int index, boolean value);
    void reset(int index);
    void invert(int index);
    int count();
    String toString();
    
}
