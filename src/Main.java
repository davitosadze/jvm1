import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("გამარჯობა, ჩაწერეთ თქვენი სახელი: ");
        String name = sc.nextLine();

        System.out.print("ჩაწერეთ გვარი: ");
        String lastname = sc.nextLine();

        System.out.print("ჩაწერეთ დაბადების წელი: ");
        int year = sc.nextInt();

        System.out.print("ჩაწერეთ სქესი აიდით ( 1 - კაცი | 2 - ქალი ): ");
        int sex = sc.nextInt();

        String sexString = "დაუდგენელი სქესის";
        if(sex == 1) {
            sexString = "კაცი";
        } else if(sex == 2) {
            sexString = "ქალი";
        }

        System.out.print(name + " " + lastname + " თქვენ ხართ " + sexString + " " + year + " წელს დაბადებული");
        // Davit Osadze
    }
}
