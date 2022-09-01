public class Main {
    public static void main(String[] args) {
task1();
task2();
task3();
task4(10);
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
        int clientDeviceYear = 2014;
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
if (distance<=20) {
    System.out.println( "Для доставки потребуются 1 день " );}
if (distance>20 && distance <=60) {
    System.out.println( " Для доставки потребуется 2 дня ");}
if (distance >60 && distance<=100) {
    System.out.println( "Для доставки потребуется 3 дня ");}

}

public static void task5 ()



}