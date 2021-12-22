package ru.mirea.task28;

public class M {
    double val = 0.011771;
    public void whatWeDo(float a){
        val = val*a;
        System.out.println("Перевод " + a + " рублей в евро: " + val);
    }

    public static void main(String[] args) {
        M m1 = new M();
        M m2 = new M().new USD();
        m1.whatWeDo(20);
        m2.whatWeDo(20);
    }

    private class USD extends M {
        @Override
        public void whatWeDo(float a) {
            double val = 0.014562;
            val = val*a;
            System.out.println("Перевод " + a + " рублей в доллары: " + val);
        }
    }
}
