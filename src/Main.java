public class Main {
    public static void main(String[] args) {
task1();
task2();
task3();
task4(10);
task5();
    }
    public static void  task1 () {
        System.out.println( "Задача 1");
        int clientOS = 1;
        if (clientOS == 1) {System.out.println( "Установите версию приложения для Android по ссылке");}
        else if (clientOS ==0) {
            System.out.println( "Установите версию приложения для IOS по ссылке" );}
    }

    public static void task2 () {
        System.out.println( "Задача 2");
        int clientDeviceYear = 2020;
       int clientOS = 0 ;
        if (clientOS == 1 && clientDeviceYear >=2015) {System.out.println( "Установите версию приложения для Android по ссылке");}
        else if (clientOS ==1 && clientDeviceYear < 2015) {
            System.out.println( "Установите облегченную версию приложения для Android по ссылке" );}
        if (clientOS == 0 && clientDeviceYear >=2015) {
            System.out.println( "Установите версию приложения для IOS по ссылке");}
        else if (clientOS == 0 && clientDeviceYear <2015) {
            System.out.println( "Установите облегченную версию приложения для IOS по ссылке");}
    }


    public static void task3() {
    System.out.println( "Задача 3");
        int year = 2021;
        if (year%4==0 && year%100>0){
            System.out.println( year + " год является високосным ");}
            else if (year%400==0) {
            System.out.println( year + " год является високосным ");
        }

        else {System.out.println( year + " год не является високосным ");}
}

public static void task4( Integer distance ){
    System.out.println( "Задача 4");
if (distance<=20) {
    System.out.println( "Для доставки потребуются 1 день " );}
if (distance>20 && distance <=60) {
    System.out.println( " Для доставки потребуется 2 дня ");}
if (distance >60 && distance<=100) {
    System.out.println( "Для доставки потребуется 3 дня ");}

}

public static void task5 () {
    System.out.println( "Задача 5");

        int monthNumber = 9;
        switch (monthNumber) {
            case 1:
                monthNumber = 1;
            case 2:
                monthNumber = 2;
            System.out.println( " зима ");
            break;
            case 3:
                monthNumber = 3;
            case 4:
                monthNumber = 4;
            case 5:
                monthNumber = 5;
                System.out.println( "Весна");
                break;
            case 6:
                monthNumber = 6;
            case 7:
                monthNumber = 7;
            case 8:
                monthNumber = 8;
                System.out.println( "Лето");
                break;
            case 9:
                monthNumber = 9;
            case 10:
                monthNumber = 10;
            case 11:
                monthNumber = 11;
                System.out.println( "Осень");
                break;
            case 12:
                monthNumber = 12;
                System.out.println( "Зима" );
                break;
            default:
                System.out.println( "В году 12 месяцев");


            }

        }
}



