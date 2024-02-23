public class Main {
    public static void main(String[] args) {
        int balance = 100; // баланс
        int replenishment = 1001; // сумма пополнения
        int minimumBonus = 100; // сумма за которую начисляется бонус
        int minimum = 1000; // минимальная самма для начисления бонуса
        int firstBalanse;
        if (replenishment >= minimum) {
            firstBalanse = replenishment / minimumBonus +balance +replenishment;
        } else {
            firstBalanse = balance + replenishment;
        }
        System.out.println(firstBalanse);
    }
}
