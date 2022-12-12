package Demo._ss1.THICUOIKY.controller;

import Demo._ss1.THICUOIKY.exception.NotFoundBankAccountExeption;
import Demo._ss1.THICUOIKY.service.TaiKhoanService;
import Demo._ss1.THICUOIKY.view.DislayMenu;

import java.io.IOException;
import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            DislayMenu.displayMenu();
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        DislayMenu.displaySubMenu();
                        int oneChoice = Integer.parseInt(scanner.nextLine());
                        switch (oneChoice) {
                            case 1:
                                TaiKhoanService.addNew(1);
                                break;
                            case 2:
                                TaiKhoanService.addNew(2);
                                break;
                            default:
                                System.err.println("Khong hop le! Vui long nhap chon 1 hoac 2!");
                        }
                        break;
                    case 2:
                        try {
                            TaiKhoanService.delete();
                        } catch (NotFoundBankAccountExeption exception) {
                            System.out.println(exception.getMessage());
                        }
                        break;
                    case 3:
                        TaiKhoanService.display();
                        break;
                    case 4:
                        try {
                            TaiKhoanService.search();
                        } catch (NotFoundBankAccountExeption ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    case 5:
                        break;
                    default:
                        System.err.println("Khong hop le! Vui long nhap chon tu 1-53 ");
                }
            } catch (NumberFormatException | IOException e) {
                System.err.println("Loi dinh dang! Vui long nhap lai.");
            }
        } while (choice != 5);
    }

}
