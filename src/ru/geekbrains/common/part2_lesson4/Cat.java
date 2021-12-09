package ru.geekbrains.common.part2_lesson4;

public class Cat extends Animal{
    private static int count;

    public Cat (String name, int maxRunDistance, int maxSwimDistance) {
        super(name, "Кот", maxRunDistance, maxSwimDistance);
    }

    public Cat (String name){
        super(name, "Кот", 50, 10);
        count++;
    }

    public static int getCount(){
        return count;
    };
}
