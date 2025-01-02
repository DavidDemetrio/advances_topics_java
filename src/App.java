public class App {
    public static void main(String[] args) throws Exception {
        printNumbers(1, 23, 3);
    }

    // dynamic parameters varargs
    static void printNumbers(int... numbers) { // internally this parameter becomes in array varargs
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    // Always to the end stay the varargs
    static void numbersAndOtherParams(String name, int... numbers) {
        System.out.println("Param string: " + name);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
