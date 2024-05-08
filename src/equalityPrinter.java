public class equalityPrinter {
    public static void main(String[] args) {

    }

    public static void printEqual (int x, int y, int z){
        if(x < 0 || y < 0 || z < 0){
            System.out.printf("Invalid Value");
        }
        else if(x == y && x == z && y == z){
            System.out.printf("All numbers are equal");
        }
        else if(x != y && x != z && y != z){
            System.out.printf("All numbers are different");
        }
        else {
            System.out.printf("Neither all are equal or different");
        }
    }
}
