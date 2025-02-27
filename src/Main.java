public class Main {
    public static void main(String[] args) {
        int balance = 100; // сумма средств на счету
        int paySum = 1110; // сумма пополнения
        int bonus;         // величина бонуса
        if (paySum > 1000) {
            bonus = paySum / 100;
        } else {
            bonus = 0;
        }
        balance = balance + paySum + bonus;
        System.out.println("Вам начислен бонус в сумме " + bonus + " руб.");
        System.out.println("Баланс Вашего лицевого счета " + balance + " руб.");
    }
}