public class Homework {
    public static void main(String[] args) {
        // task 1
        int n = 234;
        int weeks = n / 7;
        int months = n / 30;
        System.out.println(weeks);
        System.out.println(months);

        //task 2
        int num = 57;
        int a = num % 10; // единицы
        int b = num / 10; // десятки
        int sum = a + b; // сумма цифр
        int prod = a * b; // произведение цифр
        System.out.printf("a = , %d; b = %d; sum = %d; prod = %d\n", a, b,sum, prod);

        //task 3
        int birth_year = 1991;
        int year = 2023;
        int age = year - birth_year;
        System.out.println(age);

    }
}
