public class RubleForEvery100 {
    static final long LOW_BOUND_BONUS = 1000;
    //Первый аргумент это сумма перевода
    public static void main(String[] args) {
        if (args.length != 1)
            throw new IllegalArgumentException("Number of arguments not equal 1");
        long balance = 100;
        long money_transfer = Long.parseLong(args[0]);
        long bonus = 0;
        if (money_transfer >= LOW_BOUND_BONUS)
            bonus += money_transfer / 100;

        balance += money_transfer + bonus;

        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Итоговый счёт:  " + balance);
    }
}
