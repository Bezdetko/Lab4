package ru.avalon.javapp.devj110.arrays;

public class Main {

    public static void main(String[] args) {

//Булевый массив
System.out.println("БУЛЕВЫЙ МАССИВ");
UserArrays array = new BooleanArray();
array.set(3); 
array.set(4);
array.set(5, true);
array.reset(4);
array.invert(7);
System.out.println("Количество элементов, установленных в true: " + array.count());
System.out.println("Проверка элемента с заданным индексом: " + array.check(3));
System.out.println(array.toString());
System.out.println();
System.out.println();
System.out.println();

//Целочисленный массив
System.out.println("ЦЕЛОЧИСЛЕННЫЙ МАССИВ");
IntArray intArray = new IntArray();
intArray.set(33);           //1
intArray.set(3);            //2
intArray.set(4);            //3
intArray.reset(4);          //2
intArray.set(32);           //3
intArray.set(313);          //4
intArray.set(323);          //5
intArray.set(545);          //6
intArray.set(234, true);    //7
intArray.set(236, true);    //8
intArray.set(236, false);   //7
intArray.set(836, true);    //8
intArray.invert(123);       //9
System.out.println("Количество элементов, установленных в true: " + intArray.count());
System.out.println("Проверка элемента с заданным индексом: " + intArray.check(33));
System.out.println("Проверка элемента с заданным индексом: " + intArray.check(4));
System.out.println("Проверка элемента с заданным индексом: " + intArray.check(836));
System.out.println("Проверка элемента с заданным индексом: " + intArray.check(123));
System.out.println(intArray.toString());
System.out.println("Целочисленный массив, в битах которого храятся значения: " + intArray.intArrayToString());

    }
    
}
