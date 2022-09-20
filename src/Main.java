public class Main {
    public static void main(String[] args) {
        // ДЗ-10 1.7. Строки
        // Задание 1
        String firstName = " Ivan";
        String middleName = " Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО сотрудника — " + fullName + ".");
        System.out.println("ФИО сотрудника — " + lastName + firstName + middleName + ".");

        // Задание 2
        fullName = fullName.replace("Ivanov Ivan Ivanovich","IVANOV IVAN IVANOVICH");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName + "!");

        // Задание 3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName + "!");
    }
}
