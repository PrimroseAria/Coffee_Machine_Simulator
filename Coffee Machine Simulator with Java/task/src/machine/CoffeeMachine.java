package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static int storedMlWater;
    public static int storedMlMilk;
    public static int storedCoffeeBeans;
    public static int storedCoffeeCups;
    public static int storedMoney;

    public static void machine(int storedWater, int storedMilk, int storedBeans, int storedCups, int storedMoney) {

        System.out.println("\nThe coffee machine has:");
        System.out.printf("%d ml of water\n", storedWater);
        System.out.printf("%d ml of milk\n", storedMilk);
        System.out.printf("%d g of coffee beans\n", storedBeans);
        System.out.printf("%d disposable cups\n", storedCups);
        System.out.printf("$%d of money\n", storedMoney);
    }

    public static void buy() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                //espresso
                if (storedMlWater >= 250) {
                    if (storedCoffeeBeans >= 16) {
                        if (storedCoffeeCups >= 1) {

                            System.out.println("I have enough resources, making you a coffee!");
                            storedMlWater -= 250;
                            storedCoffeeBeans -= 16;
                            storedCoffeeCups--;
                            storedMoney += 4;

                        } else {
                            System.out.println("Sorry, not enough cups!");
                        }
                    } else {
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                } else {
                        System.out.println("Sorry, not enough water!");
                }

                break;

            case "2":
                //latte

                if (storedMlWater >= 350) {
                    if (storedMlMilk >= 75) {
                        if (storedCoffeeBeans >= 20) {
                            if (storedCoffeeCups >= 1) {

                                System.out.println("I have enough resources, making you a coffee!");
                                storedMlWater -= 350;
                                storedMlMilk -= 75;
                                storedCoffeeBeans -= 20;
                                storedCoffeeCups--;
                                storedMoney += 7;

                            } else {
                                System.out.println("Sorry, not enough cups!");
                            }
                        } else {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    } else {
                        System.out.println("Sorry, not enough milk!");
                    }
                } else {
                    System.out.println("Sorry, not enough water!");
                }

                break;

            case "3":
                //cappuccino

                if (storedMlWater >= 200) {
                    if (storedMlMilk >= 100) {
                        if (storedCoffeeBeans >= 12) {
                            if (storedCoffeeCups >= 1) {

                                System.out.println("I have enough resources, making you a coffee!");
                                storedMlWater -= 200;
                                storedMlMilk -= 100;
                                storedCoffeeBeans -= 12;
                                storedCoffeeCups--;
                                storedMoney += 6;

                            } else {
                                System.out.println("Sorry, not enough cups!");
                            }
                        } else {
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    } else {
                        System.out.println("Sorry, not enough milk!");
                    }
                } else {
                    System.out.println("Sorry, not enough water!");
                }


                break;
            case "back":
                //back
                break;
        }
    }

    public static void fill() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add:");
        storedMlWater += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        storedMlMilk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        storedCoffeeBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        storedCoffeeCups += scanner.nextInt();


    }

    public static void take() {
        System.out.printf("\nI gave you $%d\n", storedMoney);
        storedMoney = 0;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        storedMlWater = 400;
        storedMlMilk = 540;
        storedCoffeeBeans = 120;
        storedCoffeeCups = 9;
        storedMoney = 550;

        int num = 9;
        while (num != 0) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit)");
            String choice = scanner.nextLine();

            switch (choice) {
                case "buy" -> buy();

                case "fill" -> fill();

                case "take" -> take();

                case "remaining" -> machine(storedMlWater, storedMlMilk, storedCoffeeBeans, storedCoffeeCups, storedMoney);

                case "exit" -> num = 0;
            }
        }


        /*machine(storedMlWater, storedMlMilk, storedCoffeeBeans, storedCoffeeCups, storedMoney);
        fill();
        machine(storedMlWater, storedMlMilk, storedCoffeeBeans, storedCoffeeCups, storedMoney);
        take();
        machine(storedMlWater, storedMlMilk, storedCoffeeBeans, storedCoffeeCups, storedMoney);*/
    }
}
