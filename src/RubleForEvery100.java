public class RubleForEvery100 {
    static final long LOW_BOUND_BONUS = 1000;
    //Первый аргумент это сумма перевода
    public static void main(String[] args) {
        if (args.length != 1)
            throw new IllegalArgumentException("Number of arguments not equal 1");
        long balance = 100;
        long moneyTransfer = Long.parseLong(args[0]);
        long bonus = 0;
        if (moneyTransfer >= LOW_BOUND_BONUS)
            bonus += moneyTransfer / 100;

        balance += moneyTransfer + bonus;

        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Итоговый счёт:  " + balance);
    }
}
