package ru.geekbrains.common.part2_lesson4;

public class Dog extends Animal {
    private static int count;

    public Dog (String name, int maxRunDistance, int maxSwimDistance) {
        super(name, "Собака", maxRunDistance, maxSwimDistance);
    }

    public Dog (String name){
        super(name, "Собака", 300, 0);
        count++;
    }

    public static int getCount(){
        return count;
    };
}
