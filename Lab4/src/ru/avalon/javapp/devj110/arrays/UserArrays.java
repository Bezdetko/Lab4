
package ru.avalon.javapp.devj110.arrays;

public interface UserArrays {
    int SIZE = 1024; // размер массива
    boolean check(int index); // проверка элемента с заданным индексом
    void set(int index); // установка (в true) элемента с заданным индексом
    void set(int index, boolean value); // установка элемента с заданным индексом заданным логическим значением
    void reset(int index); // сброс (в false) элемента с заданным индексом
    void invert(int index); // инвертирование элемента с заданным индексом
    int count(); //количество элементов, установленных в true
    @Override
    String toString(); // метод toString(), возвращающий 
    //последовательность нулей и единиц, где каждый символ представляет значение соответствующего элемента массива.
    
}
