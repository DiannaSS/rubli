public class Main {
    public static void main(String[] args) {
        int refill;
        refill = 1500;
        int bonus;

        if (refill > 1000) {
            bonus = refill / 100;
        }
                else{
            bonus = 0;
        }
        int check = refill + bonus;
        System.out.println("Итоговый счет - " + check);
        System.out.println("Ваш бонусные рубли - " + bonus);
    }
} 
