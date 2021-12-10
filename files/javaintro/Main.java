public class Main {
    public static void main(String[] args) {

        int income = 70000;   // доход
        int spending = 100000; // расход
        int tax = (income - spending) * 15 / 100; // налог 15% на разницу доходов и расходов

        System.out.println("Ваш налог: " + tax + " рублей");

    }
}
