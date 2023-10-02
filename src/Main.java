public class Main {
    public static void main(String[] args) {
        byte a = 67;
        short b = -159;
        int s = 569;
        long t = 987678965549L;
        float e = 2.786f;
        double z = 27.12;
        short f = 27897;


        byte klass1 = 23;
        byte klass2 = 27;
        byte klass3 = 30;
        short paper = 480;
        int overKlass = klass1 + klass2 + klass3;
        int expensed = paper / overKlass;
        System.out.println("На каждого ученика рассчитанно" + expensed + "листов бумаги");

        byte speedMash = 16;
        byte time1 = 20;
        short time2 = 1440;
        short time3 = 4320;
        int time4 = 43200;
        int speedMin = speedMash / 2;
        int fin1 = time1 * speedMin;
        System.out.println("За" + time1 + "машина произвела" + fin1 + "штук бутылок");
        int fin2 = time2 * speedMin;
        System.out.println("За" + time2 + "машина произвела" + fin2 + "штук бутылок");
        int fin3 = time3 * speedMin;
        System.out.println("За" + time3 + "машина произвела" + fin3 + "штук бутылок");
        int fin4 = time4 * speedMin;
        System.out.println("За" + time4 + "машина произвела" + fin4 + "штук бутылок");


        byte owerColors = 120;
        byte whate = 2;
        byte brown = 4;
        int colorClass = whate + brown;
        int owerClasss = owerColors / colorClass;
        int owerWhate = colorClass * whate;
        int owerBrown = colorClass * brown;
        System.out.println("В школе, где" + colorClass + "классов,нужно" + owerWhate + "банок белой краски и" + owerBrown + "банок коричневой краски");


        byte banana = 5;
        short milk = 200;
        short iseCream = 2;
        short aggs = 4;
        int bananaGrams = banana * 80;
        short milkGrams = 105 * 2;
        int iseCreamGrams = iseCream * 100;
        int aggsGrams = aggs * 70;
        int owerGrams = bananaGrams + iseCreamGrams +  aggsGrams + milkGrams;
        System.out.println(owerGrams);
        float owerKill = owerGrams / 1000f;
        System.out.println(owerKill);


        byte purpose = 7;
        short purA = 250;
        short purB = 500;
        int purposeGrams = purpose * 1000;
        int purposeA = purposeGrams / purA;
        System.out.println(purposeA);
        int purposeB = purposeGrams / purB;
        System.out.println(purposeB);
        int owerDay = purposeA + purposeB;
        int onAverageDay = owerDay / 2;
        System.out.println(onAverageDay);


        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaYear = masha * 12;
        int denisYear = denis * 12;
        int kristinaYear = kristina * 12;
        int mashaPlus = masha + 6776;
        int denisPlus = denis + 8369;
        int kristinaPlus = kristina + 7623;
        int mashaFin = mashaPlus * 12 - mashaYear;
        int denisFin = denisPlus * 12 - denisYear;
        int kristinaFin = kristinaPlus * 12 - kristinaYear;
        System.out.println("Маша теперь получает" + mashaPlus + "рублей.Годовой доход вырос на" + mashaFin + "рублей");
        System.out.println("Денис теперь получает" + denisPlus + "рублей.Годовой доход вырос на" + denisFin + "рублей");
        System.out.println("Кристина теперь получает" + kristinaPlus + "рублей.Годовой доход вырос на" + kristinaFin + "рублей");
    }
}

