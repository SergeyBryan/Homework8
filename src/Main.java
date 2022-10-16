public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        System.out.println("Task 1.1");
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        System.out.println("Task 1.2");
        double[] second = {1.57, 7.654, 9.986};
        System.out.println("Task 1.3");
        byte[] third = new byte[9];
        third[0] = 125;
        third[1] = 50;
        third[2] = 62;
        third[3] = 63;
        third[4] = 75;
        third[5] = 40;
        third[6] = 25;
        third[7] = 15;
        third[8] = 5;
        //Задание 2
        System.out.println("Задание 2");
        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i]);
            if (i != first.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i]);
            if (i != first.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < third.length; i++) {
            System.out.print(third[i]);
            if (i != third.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        System.out.println("Task 3.1");
        for (int i = first.length-1; i >= 0; i--) {
            System.out.print(first[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Task 3.2");
        for (int i = second.length-1; i >= 0; i--) {
            System.out.print(second[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Task 3.3");
        for (int i = third.length-1; i >= 0; i--) {
            System.out.print(third[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задание 4
        System.out.println("Задание 4");
        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2!=0) {
                first[i] += 1;
            }
            System.out.print(first[i]);
            if (i != 2) {
                System.out.print(", ");
            }
        }
        }
    }