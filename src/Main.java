public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 5;
        double f = 6;
        System.out.println("Значение переменной " + "a " + "с типом byte равно " + a);
        System.out.println("Значение переменной " + "b " + "с типом short равно " + b);
        System.out.println("Значение переменной " + "c " + "с типом int равно " + c);
        System.out.println("Значение переменной " + "d " + "с типом long равно " + d);
        System.out.println("Значение переменной " + "e " + "с типом float равно " + e);
        System.out.println("Значение переменной " + "f " + "с типом double равно " + f);

        // Задача 2
        System.out.println("Задача 2");
        float aA = 27.12f;
        long bB = 987678965549L;
        byte cC = 2;
        short dD = 786;
        short eE = 569;
        short fF = -159;
        short gG = 27897;
        byte mM = 67;
        System.out.println(aA);
        System.out.println(bB);
        System.out.println(cC);
        System.out.println(dD);
        System.out.println(eE);
        System.out.println(fF);
        System.out.println(gG);
        System.out.println(mM);

        // Задача 3
        System.out.println("Задача 3");
        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int allStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int listPaper = 480;
        int listPaperOnePerson = listPaper / allStudents;
        System.out.println("На каждого ученика рассчитано " + listPaperOnePerson + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        float bottles = 16;
        float timeHours = 2;
        float productivity1Hour = bottles / timeHours;
        float productivity1Minute = productivity1Hour / 60;
        float productivity20Minutes = productivity1Minute * 20;
        float productivity1Day = productivity1Hour * 24;
        float productivity3Days = productivity1Day * 3;
        float productivity1Month = productivity1Day * 30;
        System.out.println("За 20 минут машина произвела бутылок " + productivity20Minutes + " штук");
        System.out.println("За сутки машина произвела бутылок " + productivity1Day + " штук");
        System.out.println("За 3 суток машина произвела бутылок " + productivity3Days + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + productivity1Month + " штук");

        // Задача 5
        System.out.println("Задача 5");
        int tins = 120;
        int classroomWhite = 2;
        int classroomBrown = 4;
        int allrooms = tins / (classroomBrown + classroomWhite);
        System.out.println(allrooms);
        int whiteTins = allrooms * classroomWhite;
        int brownTins = allrooms * classroomBrown;
        System.out.println("В школе, где " + allrooms + " классов, нужно " + whiteTins + " банок белой краски и " + brownTins + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int banan1Weight = 80;
        int banan5Weight = banan1Weight * 5;
        int milkWeight100Ml = 105;
        int milkWeight200Ml = milkWeight100Ml * 2;
        int iceCream1Weight = 100;
        int iceCream2weight = iceCream1Weight * 2;
        int egg1 = 70;
        int eggs4 = egg1 * 4;
        int breakfastWeight = banan5Weight + milkWeight200Ml + iceCream2weight + eggs4;
        System.out.println(breakfastWeight);
        float oneKilogrammToGrams = 1000;
        float breakfastWeightKg = breakfastWeight / oneKilogrammToGrams;
        System.out.println(breakfastWeightKg);

        // Задача 7
        System.out.println("Задача 7");
        int lossWeightKg = 7;
        int oneKgToGrams = 1000;
        int lossWeightOneDayMinGrams = 250;
        int lossWeightOneDayMaxGrams = 500;
        int lossWeightDaysMinGrams = (lossWeightKg * oneKgToGrams) / lossWeightOneDayMinGrams;
        int lossWeightDaysMaxGrams = (lossWeightKg * oneKgToGrams) / lossWeightOneDayMaxGrams;
        System.out.println(lossWeightDaysMinGrams + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(lossWeightDaysMaxGrams + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
        int lossWeightDaysMedium = (lossWeightDaysMinGrams + lossWeightDaysMaxGrams) / 2;
        System.out.println("Потребуется " + lossWeightDaysMedium + " дней в среднем, чтобы добиться результата похудения");

        //Задача 8
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float percent = 10;
        float salaryMultiplier = percent / 100;
        float newMashaSalary = mashaSalary + (mashaSalary * salaryMultiplier);
        float newDenisSalary = denisSalary + (denisSalary * salaryMultiplier);
        float newKristinaSalary = kristinaSalary + (kristinaSalary * salaryMultiplier);
        float yearMashaSalary = (newMashaSalary - mashaSalary) * 12;
        float yearDenisSalary = (newDenisSalary - denisSalary) * 12;
        float yearKristinaSalary = (newKristinaSalary - kristinaSalary) * 12;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + yearMashaSalary + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + yearDenisSalary + " рублей");
        System.out.println("Маша теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + yearKristinaSalary + " рублей");







    }
}