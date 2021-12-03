package ru.avalon.javapp.devj110.arrays;

import java.util.Arrays;

public class BooleanArray implements UserArrays{
    private final boolean[] values = new boolean[SIZE];
    
    private void checkIndex(int index) {
        if(index < 0 || index >= SIZE)
            throw new IndexOutOfBoundsException("Выход за предел массива.");
    }
           
            
    @Override
    public boolean check(int index) {
        checkIndex(index);
        return values[index];  
    }    
    
    @Override
    public void set(int index) {
        checkIndex(index);
        values[index] = true;
    }
    
    @Override
    public void set(int index, boolean value) {
        checkIndex(index);
        values[index] = value;
    }

    @Override
    public void reset(int index) {
        checkIndex(index);
        values[index] = false;
    }    
    
    @Override
    public void invert(int index) {
        checkIndex(index);
        values[index] = !values[index];
    }

    @Override
    public int count() {
        int number = 0;
        for (int i=1; i<SIZE; i++) {
            boolean value = values[i];
            if (value)
                number++;            
        }
        return number;
    }
    
    @Override
    public String toString() {
    byte[] arrayByte = new byte[SIZE];
    for (int i = 0; i < SIZE; i++){
       arrayByte[i] = values[i] ? (byte)1 : (byte)0; 
    }
    return Arrays.toString(arrayByte);
    }

    
}
