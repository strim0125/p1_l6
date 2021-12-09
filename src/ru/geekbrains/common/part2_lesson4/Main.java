package ru.geekbrains.common.part2_lesson4;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Киска"),
                new Dog("Гавчик"),
                new Cat("Пупс", 300, 50),
                new Dog("Гав", 1000, 500),
                new Dog("Гавчикorc", 2000, 700)
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(70);
            animals[i].swim(7);
        }

        System.out.println(Animal.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());
    }
}
