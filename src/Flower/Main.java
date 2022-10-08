package Flower;

public class Main {


    public static void main(String[] args) {
        Flower[] flowers = new Flower[10];

        Flower rose = new Flower ("Роза обыкновенная",null,"Голландия",35.59,0);
        Flower chrysanthemum = new Flower ("Хризантема",null, "Голландия",15,5);
        Flower piyon = new Flower ("Пион",null, "Англия",69.9,1);
        Flower gypsophila = new Flower ("Гипсофила",null, "Турция",19.5,10);
        flowers [0] = rose;
        flowers [1] = chrysanthemum;
        calculate (flowers);

    }
        public static void calculate (Flower[] flowers) {
            int lifeSpan = Integer.MAX_VALUE;
            double sum = 0;
            String text = "В букете есть: \n ";
            for (int i = 0; flowers.length > i; i++) {
                if (flowers[i] != null) {
                    text += " " + flowers[i].getName () + " из " + flowers[i].getCountry () + "\n";
                    if (flowers[i].getLifeSpan () < lifeSpan) {
                        lifeSpan = flowers[i].getLifeSpan ();
                    }
                    sum += flowers[i].getCost ();
                }
            }
            sum = sum * 1.10;
            text += "\n";
            text += "Сумма букета = " + String.format ("%.2f", sum);
            text += "\n ";
            text += "Срок годности = " + lifeSpan;
            System.out.println (text);
        }





}
