public class Main {
    public static void main(String[] args) {
        BonusService bonusService = new BonusService();

        long amount1 = 1000;
        boolean registered1 = true;

        long amount2 = 1_000_000;
        boolean registered2 = true;

        long bonus1 = bonusService.calculate(amount1, registered1);
        System.out.println("Bonus for registered user (under limit): " + bonus1);

        long bonus2 = bonusService.calculate(amount2, registered2);
        System.out.println("Bonus for registered user (over limit): " + bonus2);
    }
}
