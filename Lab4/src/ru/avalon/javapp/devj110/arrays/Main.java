package ru.avalon.javapp.devj110.arrays;

public class Main {

    public static void main(String[] args) {
Arrays array = new BooleanArray();
array.set(3);
array.set(4);
array.set(5, true);
array.reset(4);
array.invert(7);
System.out.println("Количество элементов, установленных в true: " + array.count());
System.out.println("Проверка элемента с заданным индексом: " + array.check(3));
System.out.println(array.toString());
        
        
    }
    
}
