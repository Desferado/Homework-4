import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
        }
            public static void task1(){
                System.out.println("Задание №1");
                System.out.println("Введите возраст человека:");
                Scanner inputAge = new Scanner(System.in);
                int age = inputAge.nextInt();
                if (age >= 18) {
                    System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
                } else {
                    System.out.println("Если возраст человека равен " + age +
                            ", то он не достиг совершеннолетия, нужно немного подождать!");
                }
                System.out.println();
            }
            public static void task2() {
                System.out.println("Задание №2");
                System.out.println("Введите текущую температуру на улице:");
                Scanner inputTemperature = new Scanner(System.in);
                int temperature = inputTemperature.nextInt();
                if (temperature >= 5) {
                    System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
                } else {
                    System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
                }

                System.out.println();
            }
            public static void task3() {
                System.out.println("Задание №3");
                System.out.println("Введите текущую скорость автомобиля:");
                Scanner inputSpeed = new Scanner(System.in);
                int speed = inputSpeed.nextInt();
                if (speed >= 60) {
                    System.out.println("Если скорость " + speed + ", то придется заплатить штраф!");
                } else {
                    System.out.println("Если скорость " + speed + ", то можно ездить спокойно!");
                }

                System.out.println();
            }
        public static void task4() {
            System.out.println("Задание №4");
            System.out.println("Введите возраст человека:");
            Scanner inputAge = new Scanner(System.in);
            int age = inputAge.nextInt();
            boolean needToGoKindergarten = age > 2 && age <= 6;
            boolean neeedToGoSchool = age >= 7 && age < 18;
            boolean needToGoUniversity = age > 18 && age < 24;
            if (needToGoKindergarten) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
            } else if (neeedToGoSchool) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else if (needToGoUniversity) {
                System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
            }

            System.out.println();
        }
        public static void task5() {
            System.out.println("Задание №5");
            System.out.println("Введите возраст ребенка:");
            Scanner inputAge = new Scanner(System.in);
            int age = inputAge.nextInt();
            boolean prohibited = age < 5;
            boolean neeedAdult = age >= 5 && age < 14;
            if (prohibited) {
                System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе.");
            } else if (neeedAdult) {
                System.out.println("Если возраст ребенка равен " + age +
                        ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя!");
            } else {
                System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого.");
            }
            System.out.println();
        }
        public static void task6() {
            System.out.println("Задание №6");
            int totalPlace = 102;
            int totalPlaceSit = 60;
            int totalPlaceStay = totalPlace - totalPlaceSit;
            System.out.println("Сколько сидячих мест продано?");
            Scanner quantityNumberSit = new Scanner(System.in);
            int numberSit = quantityNumberSit.nextInt();
            System.out.println("Сколько стоячих мест продано?");
            Scanner quantityNumberStay = new Scanner(System.in);
            int numberStay = quantityNumberStay.nextInt();
            int soldPlace = numberSit + numberStay;
            if (totalPlace != soldPlace && numberSit <= totalPlaceSit && numberStay <= totalPlaceStay) {
                int totalFreePlaceSit = totalPlaceSit - numberSit;
                int totalFreePlaceStay = totalPlaceStay - numberStay;
                int totalFreePlace = totalFreePlaceSit + totalFreePlaceStay;
                System.out.println("В вагоне осталось " + totalFreePlace + " свободных мест. Из них " +
                        totalFreePlaceSit + " сидячих мест и " + totalFreePlaceStay + " стоячих мест.");
            }
            System.out.println();
        }
        public static void task7() {
            System.out.println("Задание №7");
            System.out.println("Введите первое число:");
            Scanner firstNumber = new Scanner(System.in);
            int one = firstNumber.nextInt();
            System.out.println("Введите второе число:");
            Scanner secondNumber = new Scanner(System.in);
            int two = secondNumber.nextInt();
            System.out.println("Введите третье число:");
            Scanner therdNumber = new Scanner(System.in);
            int three = therdNumber.nextInt();
            if (one >= two && one >= three) {
                System.out.println(one + " максимальное число");
            } else  if (three >= one && three >= two) {
                System.out.println(three + " максимальное число");
            } else {
                System.out.println(two + " максимальное число");
            }
            System.out.println();
        }


}