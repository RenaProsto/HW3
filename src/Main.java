public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 100;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 10000;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 1000000000;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 1000000000000l;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 15.5f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 50.25d;
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549l;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short i = -159;
        System.out.println(i);
        short f = 27897;
        System.out.println(f);
        byte j = 67;
        System.out.println(j);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short paper = 480;
        int totalStudents = studentsAS + studentsEA + studentsLP;
        System.out.println("На каждого ученика рассчитано " + paper / totalStudents + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte bottleTwoMinutes = 16;
        int bottleOneMinute = bottleTwoMinutes / 2;
        System.out.println("За одну минуту машина произвела " + bottleOneMinute + " штук бутылок");
        int bottleOneHour = bottleOneMinute * 60;
        int bottleTwentyMinutes = bottleOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottleTwentyMinutes + " штук бутылок");
        int bottleOneDay = bottleOneHour * 24;
        System.out.println("За сутки машина произвела " + bottleOneDay + " штук бутылок");
        int bottleThreeDays = bottleOneDay * 3;
        System.out.println("За 3 дня машина произвела " + bottleThreeDays + " штук бутылок");
        int bottleOneMonth = bottleOneDay * 30;
        System.out.println("За месяц машина произвела " + bottleOneMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int paintOneClass = whitePaint + brownPaint;
        int totalClass = totalPaint / paintOneClass;
        int totalWhitePaint = totalClass * whitePaint;
        int totalBrownPaint = totalClass * brownPaint;
        System.out.println("В школе где " + totalClass + " классов, нужно " + totalWhitePaint + " белой краски и " + totalBrownPaint + " коричневой краски.");

    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 80;
        int bananas5 = bananas * 5;
        byte milk = 105;
        int milk200 = milk * 2;
        byte iceСream = 100;
        int iceCream200 = iceСream * 2;
        byte egg = 70;
        int egg4 = egg * 4;
        int cocktailGr = bananas5 + milk200 + iceCream200 + egg4;
        short grPerKg = 1000;
        float coctailKg = cocktailGr / (float) grPerKg;
        System.out.println("Количество " + cocktailGr + " граммов спортивного завтрака");
        System.out.println("Количество спортзавтрака посчитанного в килограммах составило " + coctailKg + "кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte totalLoseWeightKg = 7;
        short loseWeight1Var = 250;
        short loseWeight2Var = 500;
        int totalLoseWeightGr = totalLoseWeightKg * 1000;
        System.out.println("При условии что если спортсмен будет терять вес по 250гр в день, потребуется " + totalLoseWeightGr / loseWeight1Var + " дней");
        System.out.println("При условии что если спортсмен будет терять вес по 500 гр в день, потребуется " + totalLoseWeightGr / loseWeight2Var + " дней");
        int mode1 = totalLoseWeightGr / loseWeight1Var;
        int mode2 = totalLoseWeightGr / loseWeight2Var;
        System.out.println("Что бы добиться результата подребуется в среднем " + (mode1 + mode2) / 2 + " дней");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int moneyMasha = 67_760;
        int moneyDen = 83_690;
        int moneyKris = 76_230;
        int moneyMashaOneYear = moneyMasha * 12;
        int moneyDenOneYear = moneyDen * 12;
        int moneyKrisOneYear = moneyKris * 12;
        int moneyMasha10Pr = moneyMasha * 10 / 100;
        int moneyDen10Pr = moneyDen * 10 / 100;
        int moneyKris10Pr = moneyKris * 10 / 100;
        int moneyMashaBonus = moneyMasha + moneyMasha10Pr ;
        int moneyDenBonus = moneyDen + moneyDen10Pr;
        int moneyKrisBonus = moneyKris + moneyKris10Pr;
        int moneyMahaBonusOneYear = moneyMashaBonus * 12;
        int moneyDenBonusOneYear = moneyDenBonus * 12;
        int moneyKrisBonusOneYear = moneyKrisBonus * 12;
        System.out.println("Маша теперь получает " + moneyMashaBonus + " рублей. Годовой доход вырос с " + moneyMashaOneYear + " до " + moneyMahaBonusOneYear + " на " + moneyMasha10Pr + " рублей."   );
        System.out.println("Денис теперь получает " + moneyDenBonus + " рублей. Годовой доход вырос с " + moneyDenOneYear + " до " + moneyDenBonusOneYear + " на " + moneyDen10Pr + " рублей."   );
        System.out.println("Маша теперь получает " + moneyKrisBonus + " рублей. Годовой доход вырос с " + moneyKrisOneYear + " до " + moneyKrisBonusOneYear + " на " + moneyKris10Pr + " рублей."   );


















    }



}