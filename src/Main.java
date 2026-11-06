import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in); //Input parameter ucun
        System.out.printf("Gunu daxil edin:");
        var dayOfWeek = sc.nextInt();
        var res = "";

        switch (dayOfWeek) {
            case 1:
                res = "Bazar ertesi";
                break;
            case 2:
                res = "Cersenbe axsami";
                break;
            case 3:
                res = "Cersenbe";
                break;
            case 4:
                res = "Cume axsami";
                break;
            case 5:
                res = "Cume";
                break;
            case 6:
                res = "Senbe";
                break;
            default:
                res = "Bazar";
        }
        res = "Netice: " + res;
        System.out.println(res);
    }
}