package src;

import java.util.Scanner;

public class Login {
    private String ID = "admin123";

    public boolean doLogin() {
        String idInput = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Silahkan Masukan ID Anda");
        System.out.println("=========================");
        System.out.print("ID : ");
        idInput = sc.nextLine();
        if (!idInput.equalsIgnoreCase(ID)) {
            System.out.println("ID Anda Salah -> " + idInput);
            return false;
        }
        else {
        return false;
        }
    }
}
