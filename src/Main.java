import java.util.Scanner;
class Main{
    public static void main(String[] args){
        System.out.println("Welcome!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name please.");
        String userName = scanner.nextLine();
        System.out.println("Welcome to Vistula " + userName);
    }
}

