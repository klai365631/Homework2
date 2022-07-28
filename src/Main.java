import java.io.PrintStream;

public class Main {
    public static void main (String[] args) {

        //задание 1
        int dog=1;
        byte appl=3;
        short cat=4;
        long snake=3l;
        float bus=3.5f;
        double suggart=3.7;
        boolean dogIsAdult=dog>10;
        char bar=35;
        System.out.println(dogIsAdult);

        //Задание 2
        double boxer1=78.2;
        double boxer2=82.7;
        double boxing=boxer1+boxer2;
        double boxingraznica=boxer2-boxer1;
        System.out.println("вес двух бойцов "+ boxing+ " кг");
        System.out.println("разница веса " + boxingraznica+ " кг");

        //Задание 3
        int banana=5;
        int oneBanana=80;
        int allBananes=banana*oneBanana;
        System.out.println("вес бананов "+allBananes+ " грамм");

        int milk=200;
        double oneMilk=1.05;
        double allMilk=milk*oneMilk;
        System.out.println("молоко 200 млл "+allMilk+ " грамм");

        int iceCream= 2;
        int oneIceCream=100;
        int allIceCream=iceCream*oneIceCream;
        System.out.println("вес мороженного "+allIceCream+ " грамм");

        int egg=4;
        int oneEgg=70;
        int allEgg=egg*oneEgg;
        System.out.println("вес яиц "+allEgg+ " грамм");

        double breakfast=allBananes+allMilk+allIceCream+allEgg;
        System.out.println(breakfast);

        int oneKg=1000;
        double breakfastone=1090.0;
        double breakfastKg=breakfastone/oneKg;
        System.out.println("вес завтрака "+breakfastKg+" кг");

        //Задача 4
        int weight=7;
        double onecCase=0.25;
        double twoCase=0.5;
        double oneCaseDays=weight/onecCase;
        double twoCaseDays=weight/twoCase;
        System.out.println("первый варинат " +oneCaseDays+ " дней");
        System.out.println("второй варинат "+twoCaseDays+ " дней");

        double averageValue=(oneCaseDays+twoCaseDays)/2;
        System.out.println("в среднем понадобится "+averageValue+ " день");

        //Задача 5
        int masha=67760;
        int denis=83690;
        int cristina=76230;
        int percentageOfSalaryAllowance=10;
        int increaseSalaryMasha=masha/100*percentageOfSalaryAllowance;
        int increaseSalaryDenis=denis/100*percentageOfSalaryAllowance;
        int increaseSalaryCristina=cristina/100*percentageOfSalaryAllowance;
        System.out.println("надбавка в 10 процентов у Маши "+increaseSalaryMasha+" рублей за один месяц");
        System.out.println("надбавка в 10 процентов у Дениса "+increaseSalaryDenis+" рублей за один месяц");
        System.out.println("надбавка в 10 процентов у Кристины "+increaseSalaryCristina+" рублей за один месяц");
        int oneYear=12;
        int oneYearincreaseMasha=oneYear*increaseSalaryMasha;
        int oneYearincreaseDenis=oneYear*increaseSalaryDenis;
        int oneYearincreaseCristina=oneYear*increaseSalaryCristina;

        System.out.println("надбавка в 10 процентов у Маши "+oneYearincreaseMasha+" рублей за один год");
        System.out.println("надбавка в 10 процентов у Дениса "+oneYearincreaseDenis+" рублей за один год");
        System.out.println("надбавка в 10 процентов у Кристины "+oneYearincreaseCristina+" рублей за один год");

        int mashaSalaryPerYearWithoutAllowances=masha*oneYear;
        int DenisSalaryPerYearWithoutAllowances=denis*oneYear;
        int CristinaSalaryPerYearWithoutAllowances=cristina*oneYear;
        System.out.println("зарплата без надбавки  у Маши "+mashaSalaryPerYearWithoutAllowances+" рублей в год");
        System.out.println("зарплата без надбавки  у Дениса "+DenisSalaryPerYearWithoutAllowances+" рублей в год");
        System.out.println("зарплата без надбавки  у Кристины "+CristinaSalaryPerYearWithoutAllowances+" рублей в год");

        int oneYeaIncreaseMasha=mashaSalaryPerYearWithoutAllowances+oneYearincreaseMasha;
        int oneYeaIncreaseDenis=DenisSalaryPerYearWithoutAllowances+oneYearincreaseDenis;
        int oneYeaIncreaseCristina=CristinaSalaryPerYearWithoutAllowances+oneYearincreaseCristina;
        System.out.println("зарплата с надбавкой в 10 процентов у Маши " +oneYeaIncreaseMasha +" рублей в год");
        System.out.println("зарплата с надбавкой в 10 процентов у Дениса " +oneYeaIncreaseDenis +" рублей в год");
        System.out.println("зарплата с надбавкой в 10 процентов у Кристины " +oneYeaIncreaseCristina +" рублей в год");

        int annualSalaryDifferenceMasha=oneYeaIncreaseMasha-mashaSalaryPerYearWithoutAllowances;
        int annualSalaryDifferenceDenis=oneYeaIncreaseDenis-DenisSalaryPerYearWithoutAllowances;
        int annualSalaryDifferenceCristina=oneYeaIncreaseCristina-CristinaSalaryPerYearWithoutAllowances;
        System.out.println("разница в готовой зарплате у Маши с надбавкой и без "+annualSalaryDifferenceMasha +" рублей");
        System.out.println("разница в готовой зарплате у Дениса с надбавкой и без "+annualSalaryDifferenceDenis +" рублей");
        System.out.println("разница в готовой зарплате у Кристины с надбавкой и без "+annualSalaryDifferenceCristina+" рублей");













    }}
