import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            System.out.println("Wybierz menu");
            Menu[] menus = Menu.values();
            for (Menu menu:menus) {
                System.out.println(menu + "(" + menu.name + ")");
            }
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            try{
                Menu choiceMenu = Menu.valueOf(choice);
                System.out.println("Wybrane menu to " + choice + " numer dla tej opcji to " + choiceMenu.chooseNumber);
                flag = false;
            }
            catch (IllegalArgumentException ex){
                System.out.println("Niepoprawna wartość, spróbuj jeszcze raz");
            }
        }
    }
}
