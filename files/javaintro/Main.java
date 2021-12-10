public class Main {
    public static void main(String[] args) {

        int income = 70000;   // доход
        int outcome = 100000; // расход
        int tax = (income - outcome) * 15 / 100; // налог 15% на разницу доходов и расходов

        System.out.println("Ваш налог: " + tax + " рублей");

    }
}
