public class Main {
    public static void main(String[] args) {
        int popolnenie;
        popolnenie = 1500;
        int bonus;

        if (popolnenie > 1000) {
            bonus = popolnenie / 100;
        }
                else{
            bonus = 0;
        }
        int schet = popolnenie + bonus;
        System.out.println("Итоговый счет - " + schet);
        System.out.println("Ваш бонусные рубли - " + bonus);
    }
}