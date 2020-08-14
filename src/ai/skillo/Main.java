package ai.skillo;

import java.util.Arrays;

///HOMEWORK 3. LOOPS AND ARRAYS
public class Main {
    public static void main(String[] args) {
     ///TASK 1
       Car myCar = new Car();
        int speed = myCar.getSpeed();
        int dist = myCar.getDist();

        while (speed < 60) {
            System.out.println("Do not switch the transmission, speed: " + speed + " km/h");
            speed++;
        }
        while (dist < 150) {
            System.out.println("Do not stop, distance: " + dist + " km");
            dist++;
        }

        //TASK 2.

        do {
            System.out.println("Do not switch transmission, speed: " + speed);
            speed++;
        } while (speed < 60);

        do {
            System.out.println("Do not stop, distance: " + dist);
            dist++;
        } while (dist < 150);

        //TASK 3 array

        int[]intSchoolGroup = {5, 3, 4, 4, 3, 5, 2, 3, 5, 5};
        for (int i = 0; i < intSchoolGroup.length; i++) {
            System.out.println(intSchoolGroup[i]);
        }
        //TASK 4. Sort with loop FOR

        int b;
        for (int i = 0; i < intSchoolGroup.length; i++) {
            for (int j = i + 1; j < intSchoolGroup.length; j++) {
                if (intSchoolGroup[i] > intSchoolGroup[j]) {
                    b = intSchoolGroup[i];
                    intSchoolGroup[i] = intSchoolGroup[j];
                    intSchoolGroup[j] = b;
                }
            }
        }
        System.out.println(Arrays.toString(intSchoolGroup));

        ///TASK 5 - Arrays.sort more quickly
        Arrays.sort(intSchoolGroup);
        System.out.println(Arrays.toString(intSchoolGroup));

        //TASK 6. FOR EACH
        for (int c: intSchoolGroup) {
            System.out.println(c);
        }

        //Additional. Static
        System.out.println(Car.a);
        System.out.println(Car.text);
        System.out.println(myCar.b);
        //Final
        System.out.println(myCar.CONSTANT); //can't change
        System.out.println(myCar.CONSTANT + 11);

    }
}
