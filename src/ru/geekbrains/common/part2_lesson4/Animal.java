package ru.geekbrains.common.part2_lesson4;

public class Animal {
    String name;
    String type;
    private static int count;

    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String name, String type, int maxRunDistance, int maxSwimDistance){
        this.name = name;
        this.type = type;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

    public void run(int dist) {
        if (maxRunDistance == 0) {
            System.out.printf("%s %s не умеет бегать \n", type, name);
            return;
        }

        if (dist < 0) {
            System.out.printf("Для бега в обратном направлении введите положительное чило");
            return;
        }

        if (dist <= maxRunDistance) {
            System.out.printf("%s %s успешно пробежал %d метров \n", type, name, dist);
        } else {
            System.out.printf("%s %s не смог пробежать %d метров \n", type, name, dist);
        }
    }

    public void swim(int dist) {
        if(maxSwimDistance == 0) {
            System.out.printf("%s %s не умеет плавать \n", type, name);
            return;
        }

        if (dist < 0) {
            System.out.printf("Для плавния в обратном направлении введите полож число");
            return;
        }

        if(dist <= maxSwimDistance) {
            System.out.printf("%s %s успешно проплыл %d метров \n", type, name, dist);
        } else {
            System.out.printf("%s %s не смог успешно проплыть %d метров \n", type, name, dist);
        }
    }

    public static int getCount() {
        return count;
    };
}
