package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (first > second && first > third) {
            System.out.println(first);
        } else if (second > first && second > third) {
            System.out.println(second);
        }
        else
            System.out.println(third);
        }

    public static void main(String[] Args){
        MaxNumberPrinter printer = new MaxNumberPrinter();
        printer.printGreatest(6, 9 , 11);

    }
}














//package school.mjc.stage0.conditions.task4;
//
//public class MaxNumberPrinter {
//    public void printGreatest(int first, int second, int third) {
//        int max = (first > second && first > third) ? first : ((second > first && second > third) ? second : third);
//        System.out.println(max);
//    }
//
//    public static void main(String[] Args){
//        MaxNumberPrinter printer = new MaxNumberPrinter();
//        printer.printGreatest(6, 2 , 3);
//
//    }
//}




//Implement the program that will consume 3 numbers from method arguments and it will print the print greatest out of three.
//In case if there are more than 1 biggest -> print any of them.(Libraries are forbidden)