public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task 1");
        int[] array = {60_000, 80_000, 100_000, 200_000, 250_000};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        //Task2
        System.out.println("Task 2");
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей." + "Максимальная сумма трат за неделю составила " + max + " рублей");

        //Task3
        System.out.println("Task 3");
        int [] arrayNew = {45_600, 57_450, 75_000, 128_000, 200_000};//создали новый массив исходя из условий задачи
        int sumNew = 0;
        for (int i = 0; i < arrayNew.length; i++) {
            sumNew += arrayNew[i]; //Снова находим сумму
        }
        System.out.println("Сумма трат за месяц составила " + sumNew + " рублей"); //на всякий выводим ее в консоль

        double average = (double) sumNew / arrayNew.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Task4
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {

            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
}