package ua.lviv.lgs;


import java.util.Scanner;

public enum Months {
    JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), MARCH(Seasons.SPRING, 31),
    APRIL(Seasons.SPRING, 30), MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30),
    JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31), SEPTEMBER(Seasons.AUTUMN, 30),
    OCTOBER(Seasons.AUTUMN, 31), NOVEMBER(Seasons.AUTUMN, 30), DECEMBER(Seasons.WINTER, 31);


    private Seasons season;
    private int day;

    Months(Seasons season, int day) {
        this.season = season;
        this.day = day;
    }

    public Seasons getSeason() {
        return season;
    }

    public void setSeason(Seasons season) {
        this.season = season;
    }

    public int getDays() {
        return day;
    }

    public void setDays(int day) {
        this.day = day;
    }

    static void menu(){
        System.out.println("Enter 1, Перевірити чи є такий місяць");
        System.out.println("Enter 2, Вивести всі місяці з такою ж порою року");
        System.out.println("Enter 3, Вивести всі місяці які мають таку саму кількість днів");
        System.out.println("Enter 4, Вивести на екран всі місяці які мають меншу кількість днів");
        System.out.println("Enter 5, Вивести на екран всі місяці які мають більшу кількість днів");
        System.out.println("Enter 6, Вивести на екран наступну пору року");
        System.out.println("Enter 7, Вивести на екран попередню пору року");
        System.out.println("Enter 8, Вивести на екран всі місяці які мають парну кількість днів");
        System.out.println("Enter 9, Вивести на екран всі місяці які мають непарну кількість днів");
        System.out.println("Enter 10, Вивести на екран чи введений з консолі місяць має парну кількість днів");

    }

    static boolean isMonth(String str){
        boolean isMonth = false;
        for (Months month : Months.values()) {
            if (str.equalsIgnoreCase(month.name())) {
                isMonth = true;
                break;
            }
        }
        return isMonth;

    }

    static boolean isSeason(String str){
        boolean isSeason = false;
        for (Seasons seasons : Seasons.values()) {
            if (str.equalsIgnoreCase(seasons.name())) {
                isSeason = true;
                break;
            }
        }
        return isSeason;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        Months [] months = Months.values();

        while (true) {
            menu();
            str = scanner.nextLine();
            switch (str) {
                case "1":{
                    System.out.println("Ведіть місяць: ");
                    str = scanner.nextLine();

                    if (isMonth(str))
                        System.out.println("Є такий місяць");
                    else
                        System.out.println("Місяця не існує");

                    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                    break;
                }
                case "2" : {
                    System.out.println("Ввeдіть сезон: ");
                    str = scanner.nextLine();

                    if (isSeason(str)) {
                        for (Months month : Months.values()) {
                            if (month.getSeason().name().equalsIgnoreCase(str))
                                System.out.println(month);
                        }
                    } else
                        System.out.println("There isn't such season");
                    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                    break;
                }
                case "3" : {
                    System.out.println("Ведіть місяць: ");
                    str = scanner.nextLine();

                    if (isMonth(str)){
                        System.out.println("Month with equals days: ");
                        Months month = Months.valueOf(str.toUpperCase());
                                for(Months m : Months.values()){
                                    if(m.getDays() == month.getDays())
                                        System.out.println(m);
                                }
                    }else
                        System.out.println("Місяця не існує");
                    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                    break;
                }
                case "4" : {
                    System.out.println("Ведіть місяць: ");
                    str = scanner.nextLine();

                    if (isMonth(str)){
                        System.out.println("Month that had less days: ");
                        Months month = Months.valueOf(str.toUpperCase());
                        for(Months m : Months.values()){
                            if(m.getDays() < month.getDays())
                                System.out.println(m);
                        }
                    }else
                        System.out.println("Місяця не існує");
                    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                    break;
                }
                case "5" : {
                    System.out.println("Ведіть місяць: ");
                    str = scanner.nextLine();

                    if (isMonth(str)){
                        System.out.println("Month that had more days: ");
                        Months month = Months.valueOf(str.toUpperCase());
                        for(Months m : Months.values()){
                            if(m.getDays() > month.getDays())
                                System.out.println(m);
                        }
                    }else
                        System.out.println("Місяця не існує");
                    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                    break;
                }
                case "6" : {
                    System.out.println("Ведіть місяць: ");
                    str = scanner.nextLine();

                    if (isSeason(str)) {
                        System.out.println(Seasons.values()[(Seasons.valueOf(str.toUpperCase()).ordinal()+1)%4]);
                    } else
                        System.out.println("There isn't such season");
                    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                    break;
                }
                case "7" : {
                    System.out.println("Ввeдіть сезон: ");
                    str = scanner.nextLine();

                    if (isSeason(str)) {
                        int ord = Seasons.valueOf(str.toUpperCase()).ordinal() - 1;
                        System.out.println(Seasons.values()[ord < 0 ? 3 : ord]);
                    } else
                        System.out.println("There isn't such season");
                    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                    break;
                }
                case "8" : {
                    for(Months month : months){
                        if(month.getDays() % 2 == 0)
                            System.out.println(month);

                    }
                    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                    break;
                }
                case "9" : {
                    for(Months month : months){
                        if(month.getDays() % 2 != 0)
                            System.out.println(month);

                    }
                    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                    break;
                }
                case "10" :{
                    System.out.println("Ведіть місяць: ");
                    str = scanner.nextLine();

                    if (isMonth(str)){
                        Months month = Months.valueOf(str.toUpperCase());
                        if(month.getDays() % 2 == 0)
                            System.out.println("Your month had even number of days");
                        else
                            System.out.println("Your month had odd number of days");

                    }else
                        System.out.println("Місяця не існує");
                    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                    break;
                }
                }

            }
        }
    }




