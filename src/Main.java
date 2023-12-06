public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        byte turtle = 78;
        short horse = 3487;
        int mouse = -7865498;
        long cat = 23487643;
        float marmot = 234.4f;
        double dog = 1.26;
        System.out.println("Значение переменной turtle с типом byte равно "+turtle);
        System.out.println("Значение переменной horse с типом short равно "+horse);
        System.out.println("Значение переменной mouse с типом int равно "+mouse);
        System.out.println("Значение переменной cat с типом long равно "+cat);
        System.out.println("Значение переменной marmot с типом float равно "+marmot);
        System.out.println("Значение переменной dog с типом  double равно "+dog);

        System.out.println("Задача 2");
        byte a = 67;
        short b = 569;
        short c = -159;
        int d = 27897;
        long e = 987678965549L;
        float f = 2.786f;
        double g = 27.12;

        System.out.println("Задача 3");
        byte studentsOfLyudmilaPavlovna = 23;
        byte studentsOfAnnaSergeevna = 27;
        byte studentsOfEkaterinaAndreevna = 30;
        short paper = 480;
        int totalNumberOfStudents = studentsOfLyudmilaPavlovna + studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna;
        int amountOfPaperPerPupil = paper / totalNumberOfStudents;
        System.out.println("На каждого ученика рассчитано "+amountOfPaperPerPupil +" листов бумаги.");

        System.out.println("Задача 4");
        byte machinePerformanceIn2Minutes = 16;
        int machinePerformanceIn20Minutes = machinePerformanceIn2Minutes * 10;
        System.out.println("За 20 минут машина произвела "+machinePerformanceIn20Minutes +" штук бутылок.»");
        int machineOutputPer1Hour = machinePerformanceIn20Minutes * 3;
        int machineThroughputIn1Day = machineOutputPer1Hour * 24;
        System.out.println("За 1 день машина произвела "+machineThroughputIn1Day +" штук бутылок.»");
        int machinePerformanceIn3Days = machineThroughputIn1Day * 3;
        System.out.println("За 3 дня машина произвела "+machinePerformanceIn3Days +" штук бутылок.»");
        int machineProductivityFor1Month = machineThroughputIn1Day * 31;
        System.out.println("За 1 месяц машина произвела "+machineProductivityFor1Month +" штук бутылок.»");

        System.out.println("Задача 5");
        byte totalPaint = 120;
        byte whitePaintFor1Room = 2;
        byte brownPaintFor1Room = 4;
        int numberOfRooms = totalPaint / (whitePaintFor1Room + brownPaintFor1Room);
        int amountOfWhitePaint = numberOfRooms * whitePaintFor1Room;
        int amountOfBrownPaint = numberOfRooms * brownPaintFor1Room;
        System.out.println("В школе, где "+numberOfRooms +" классов, нужно "+amountOfWhitePaint +" банок белой краски и "+amountOfBrownPaint +" банок коричневой краски.");

        System.out.println("Задача 6");
        byte bananas = 5;
        int bananaWeight = bananas * 80;
        short milk = 200;
        int milkWeight = (milk / 100) * 105;
        byte iceCream = 2;
        int iceCreamWeight = iceCream * 100;
        short egg = 4;
        int eggWeight = egg * 70;
        int totalWeightInGrams = bananaWeight + milkWeight + iceCreamWeight + eggWeight;
        System.out.println("Общий вес продуктов равен "+totalWeightInGrams +" грамм.");
        float totalWeightInKilograms = totalWeightInGrams / 1000f;
        System.out.println("Общий вес продуктов равен "+totalWeightInKilograms +" килограмм.");

        System.out.println("Задача 7");
        short slowWeightLossPerDay = 250;
        short rapidWeightLossPerDay = 500;
        byte overweight = 7;
        int overweightInGrams = overweight * 1000;
        int slowWeightLossDays = (overweightInGrams / slowWeightLossPerDay);
        System.out.println("За "+slowWeightLossDays +" дней можно похудеть на "+overweight +" кг, при условии снижения веса на "+slowWeightLossPerDay +" грамм в день.");
        int fastWeightLossDays = (overweightInGrams / rapidWeightLossPerDay);
        System.out.println("За "+fastWeightLossDays +" дней можно похудеть на "+overweight +" кг, при условии снижения веса на "+rapidWeightLossPerDay +" грамм в день.");
        int averageNumberOfDays = (slowWeightLossDays + fastWeightLossDays) / 2;
        System.out.println("В среднем понадобится "+averageNumberOfDays +" день на похудение.");

        System.out.println("Задача 8");
        int mashaCurrentSalary = 67760;
        float mashaPayRaise = mashaCurrentSalary * 1.1f;
        float mashaSalaryIncreaseAmount = mashaPayRaise - mashaCurrentSalary;
        float mashaAnnualIncomeDifferential = mashaSalaryIncreaseAmount * 12;
        System.out.println("Маша теперь получает "+mashaPayRaise +" рублей в месяц. Годовой доход вырос на "+mashaAnnualIncomeDifferential +" рублей.");

        int denisCurrentSalary = 83690;
        float denisPayRaise = denisCurrentSalary * 1.1f;
        float denisSalaryIncreaseAmount = denisPayRaise - denisCurrentSalary;
        float denisAnnualIncomeDifferential = denisSalaryIncreaseAmount * 12;
        System.out.println("Денис теперь получает "+denisPayRaise +" рублей в месяц. Годовой доход вырос на "+denisAnnualIncomeDifferential +" рублей.");

        int cristinaCurrentSalary = 76230;
        float cristinaPayRaise = cristinaCurrentSalary * 1.1f;
        float cristinaSalaryIncreaseAmount = cristinaPayRaise - cristinaCurrentSalary;
        float cristinaAnnualIncomeDifferential = cristinaSalaryIncreaseAmount * 12;
        System.out.println("Кристина теперь получает "+cristinaPayRaise +" рублей в месяц. Годовой доход вырос на "+cristinaAnnualIncomeDifferential +" рублей.");

    }
}