import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        printIsLeap(2021);
        printInstallationMessage(1, 2020);
        printCalculateDeliveryDays(120);



    }
    private static void printIsLeap (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println(" високосный год");
    } else {
        System.out.println(" не високосный год");
        }
    }


    private static void printInstallationMessage(int os, int productionYear){
        if (!(os == 0 || os == 1)) {
            throw new RuntimeException("устройство поддерживаемо устройство");
        }
        var currentYear = LocalDate.now().getYear();


        String versionMessage = productionYear < currentYear ? "облегченную" : "";
        String osMessage = os  == 0 ? "ios" : "android";

        System.out.printf("Установите %s версию приложения для %s по ссылке", versionMessage, osMessage);

    }
    private static void printCalculateDeliveryDays(int distance){
        int start = 20;
        int step = 40;
        int result; //кол во дней
        if (distance < start) {result = 1;
        } else {
         result = (Math.abs((distance - start) / step) + 2);
        }System.out.println("Потребуется для доставки дней: " + result);

    }
}
