package ru.avalon.javapp.devj110.arrays;

import java.util.Arrays;

public class IntArray implements UserArrays{

     private final int[] intValues = new int[SIZE/32];
     
    private void checkIndex(int index) {
        if(index < 0 || index >= SIZE)
            throw new IndexOutOfBoundsException("Выход за предел массива.");
    }     
        
    @Override
    public boolean check(int index) {
        checkIndex(index);
        int intIndex = index / 32;
        int bitIndex = index % 32;
        return ((intValues[intIndex] >> (bitIndex)) & 1) == 1; 
    }

    @Override
    public void set(int index) {
        set(index, true);   
    }

    @Override
    public void set(int index, boolean value) {
        checkIndex(index);
        int intIndex = index / 32;
        int bitIndex = index % 32;
        if (value)
            intValues[intIndex] = intValues[intIndex] | ( 1 << bitIndex );
        else
            intValues[intIndex] = intValues[intIndex] & ~( 1 << bitIndex );
    }

    @Override
    public void reset(int index) {
        set(index, false);        
    }

    @Override
    public void invert(int index) {
        if (check(index))
            set(index, false);
        else set(index, true);
    }

    @Override
    public int count() {
        int number = 0;
        for (int i=1; i<SIZE; i++) {
            boolean value = check(i);
            if (value)
                number++;            
        }
        return number;
    }

    @Override
    public String toString() {
        String s = new String();
        for (int index: intValues){
           String sElemnt = String.format("%32s", Integer.toBinaryString(index)).replace(' ', '0');
           sElemnt = new StringBuffer(sElemnt).reverse().toString();
           s = s + sElemnt;
        }  
    return s;
}
    
    //вывод целочисленнго массива, в битах которого хратятся значения
    public String intArrayToString() { 
    return Arrays.toString(intValues);    
    }

}   
