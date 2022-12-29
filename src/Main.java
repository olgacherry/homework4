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
        public static void task1() {

        int age = 14;
        if(age >=18){
       System.out.println("Если возраст человека равен "+age+",то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ",то он не достиг совершеннолетия, нужно немного подождать");
        }
        }
         public static void task2() {

         int temperature = 8;
         if(temperature<5){
         System.out.println("На улице " + temperature + " градусов,можно идти без шапки");
         }else{
             System.out.println("На улице " + temperature + " градусов,можно идти без шапки");
         }
            }
          public static void task3() {
        int speed = 120;
        if(speed>60){
            System.out.println("Если скорость "+speed+" то придется заплатить штраф");
        }
        if(speed<60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        }
    public static void task4() {
        int age =17;
        if(age>2&&age<6){
        System.out.println("Если возраст человека равен "+age+" то ему нужно ходить в детский сад");
        }
        if(age>7&&age<18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }
        if(age>18&&age<24){
        System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в  университет");
        }
        if(age>24){
        System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }
    }
    public static void task5() {
        int age = 7;
        if(age<5) {
            System.out.println("Если возраст ребенка равен " + age + " то он не может кататься на аттракционе");
        }
        if(age>5&&age<=14){
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if(age>14){
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься без сопровождения взрослого");
        }
        }
    public static void task6() {
        int people = 78;
        if(people<60){
         System.out.println("Если в вагоне "+people+" человек, то в вагоне есть сидячие места");
        }
        else if(people>60&&people<102){
            System.out.println("Если в вагоне "+people+" человек, то в вагоне остались только стоячие места");
        }
        else{
            System.out.println("Вагон полностью забит");
        }
    }
    public static void task7() {
        int one = 1;
        int two = 12;
        int three = 20;
        if(one>two&&one>three) {
            System.out.println("число " + one + " большее из трех чисел");
        }
         else if(two>one&&two>three){
                System.out.println("число "+two+" большее из трех чисел");
            }
         else{
            System.out.println("число "+three+" большее из трех чисел");
        }
        }


          }




