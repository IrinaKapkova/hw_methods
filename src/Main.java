public class Main {
    public static void main(String[] args) {
        checkLeapYear(2022);
        selectPhoneApp(2022, 1);
        numberOfDeliveryDays(95);
    }
    //Високосным является каждый четвертый год, но не является каждый сотый.
    // Также високосным является каждый четырехсотый год.
    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void selectPhoneApp(int clientDeviceYear,  int clientOS) {
        if (clientOS == 0) {
            System.out.println("Установите приложение для iOS");
            if (clientDeviceYear >= 2015) {
                System.out.println("по ссылке");
            } else {
                System.out.println("облегченную версию по ссылке");
            }
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }
    }

    public static void numberOfDeliveryDays(int deliveryDistance) {
        int numberInterval = (deliveryDistance - 20) / 40;   // Количество дополнительных интервалов
        int d = (deliveryDistance - 20) % 40;    // Остаток от деления
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет сутки");
        } else if (d > 0) {
            System.out.println("Доставка займет " + (numberInterval + 2) + " суток");
        } else {
            System.out.println("Доставка займет " + (numberInterval + 1) + " суток");
        }
    }

}