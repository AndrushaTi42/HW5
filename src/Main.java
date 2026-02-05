//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Задание №1");

    int clientOS = 0;
    if (clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else {
        System.out.println("Установите версию приложения для Android по ссылке");
    }
    System.out.println("Задание №2");
    int clientDeviceYear = 2014;
    if (clientOS == 0 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (clientOS == 0 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (clientOS == 1 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    } else if (clientOS == 1 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }

    System.out.println("Задание №3");

    int year = 2020;
    if (year % 400 == 0 && year > 1584) {
        System.out.println(year + " год является високосным");
    } else if (year % 100 == 0) {
        System.out.println(year + " год не является високосным");
    } else if (year % 4 == 0 && year > 1584) {
        System.out.println(year + " год является високосным");
    } else
        System.out.println(year + " год не является високосным");


    System.out.println("Задание №4");

    int deliveryDistance = 95;
    int deliveryTime = 0;
    if (deliveryDistance > 100) {
        System.out.println("Доставки нет.");
        return;
    }
    if (deliveryDistance >= 60) {
        deliveryTime += 3;
        System.out.println("Доставка займет " + deliveryTime + " суток.");
    } else if (deliveryDistance > 20) {
        deliveryTime += 2;
        System.out.println("Доставка займет " + deliveryTime + " суток.");
    } else if (deliveryDistance <= 20) {
        deliveryTime += 1;
        System.out.println("Доставка займет " + deliveryTime + " сутки");
    }

    System.out.println("Задание №5");

    int monthNumber = 12;
    switch (monthNumber) {
        case 12:
        case 1:
        case 2:
            System.out.println("Сейчас зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Сейчас весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Сейчас лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Сейчас осень");
            break;
        default:
            System.out.println("Такого месяца не существует");
    }


}
