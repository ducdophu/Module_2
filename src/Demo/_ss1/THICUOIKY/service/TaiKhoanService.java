package Demo._ss1.THICUOIKY.service;

import Demo._ss1.THICUOIKY.exception.NotFoundBankAccountExeption;
import Demo._ss1.THICUOIKY.model.TaiKhoan;
import Demo._ss1.THICUOIKY.model.TaiKhoanThanhToan;
import Demo._ss1.THICUOIKY.model.TaiKhoanTietKiem;
import Demo._ss1.THICUOIKY.util.TaiKhoanReadAndWriteCSV;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanService {
    static Scanner scanner = new Scanner(System.in);
    static List<TaiKhoan> taiKhoanList = new ArrayList<>();

    public static void addNew(int i) throws IOException {
        // Doc tu file csv them vao taiKhoanList
        taiKhoanList = TaiKhoanReadAndWriteCSV.readFileCSV();

        // Them moi Tai Khoan Tiet Kiem hoac Tai Khoan Thanh Toan
        int size = taiKhoanList.size();
        int lastId = taiKhoanList.get(size - 1).getId();
        System.out.println("Id: ");
        int id = lastId + 1;
        System.out.println(id);
        //
        System.out.println("Moi nhap ma tai khoan:");
        String maTaiKhoan = scanner.nextLine();
        //
        System.out.println("Moi nhap ten chu tai khoan:");
        String tenChuTaiKhoan = scanner.nextLine();
        //
        System.out.println("Moi nhap ngay tao tai khoan:");
        String ngayTaoTaiKhoan = scanner.nextLine();

        if (i == 1) {
            //Them moi Tai Khoan Tiet Kiem
            System.out.println("Moi nhap so tien gui:");
            double soTienGui = Double.parseDouble(scanner.nextLine());
            //
            System.out.println("Moi nhap ngay gui:");
            String ngayGui = scanner.nextLine();
            //
            System.out.println("Moi nhap lai suat:");
            double laiSuat = Double.parseDouble(scanner.nextLine());
            //
            System.out.println("Moi nhap ky han:");
            int kyHan = Integer.parseInt(scanner.nextLine());

            // Tao doi tuong them vao taikhoanList
            TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan, soTienGui, ngayGui, laiSuat, kyHan);
            taiKhoanList.add(taiKhoanTietKiem);

        } else if (i == 2) {
            //Them moi Tai Khoan Thanh Toan
            System.out.println("Moi nhap so the:");
            String soThe = scanner.nextLine();
            //
            System.out.println("Moi nhap so tien da co:");
            double soTienDaCo = Double.parseDouble(scanner.nextLine());

            // Tao doi tuong them vao taikhoanList
            TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan, soThe, soTienDaCo);
            taiKhoanList.add(taiKhoanThanhToan);

        }

        //Ghi taiKhoanList vao file csv
        TaiKhoanReadAndWriteCSV.writeFileCSV(taiKhoanList);
        System.out.println("Them moi thanh cong!");
    }

    public static void delete() throws IOException, NotFoundBankAccountExeption {
        // Doc tu file csv them vao taiKhoanList
        taiKhoanList = TaiKhoanReadAndWriteCSV.readFileCSV();

        //Xoa theo Ma Tai Khoan
        System.out.println("Ban muon xoa theo Ma Tai Khoan? Hay nhap vao Ma TK muon xoa: ");
        String input = scanner.nextLine();
        int size = taiKhoanList.size();
        boolean check = false;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (taiKhoanList.get(i).getMaTaiKhoan().equals(input)) {
                check = true;
                index = i;
                System.out.println("Ban muon xoa Tai Khoan nay?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int choice = -1;
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        taiKhoanList.remove(index);
                        System.out.println("Xoa TK thanh cong!");
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Khong hop le! Vui long chon 1 hoac 2 ");
                }
            }
            break;
//            if (i == (taiKhoanList.size() - 1)) {
//                throw new NotFoundBankAccountExeption("TK khong ton tai! Vui long thu lai!");
//            }
        }
        if (!check) {
            throw new NotFoundBankAccountExeption("TK khong ton tai! Vui long thu lai!");
        }

        //Ghi taiKhoanList vao file csv
        TaiKhoanReadAndWriteCSV.writeFileCSV(taiKhoanList);
    }

    public static void display() throws IOException {
        // Doc tu file csv them vao taiKhoanList
        taiKhoanList = TaiKhoanReadAndWriteCSV.readFileCSV();
        for (TaiKhoan taiKhoan : taiKhoanList) {
            System.out.println(taiKhoan);
        }
    }

    public static void search() throws IOException, NotFoundBankAccountExeption {
        // Doc tu file csv them vao taiKhoanList
        taiKhoanList = TaiKhoanReadAndWriteCSV.readFileCSV();

        //Tim theo ma TK hoac theo ten chu TK
        System.out.println("Nhap ma TK hoac ten chu TK muon tim kiem: ");
        String input = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < taiKhoanList.size(); i++) {
            if (taiKhoanList.get(i).getMaTaiKhoan().contains(input) || taiKhoanList.get(i).getTenChuTaiKhoan().contains(input)) {
                check = true;
                System.out.println(taiKhoanList.get(i));
            }
        }
        if (!check) {
            throw new NotFoundBankAccountExeption("TK khong ton tai! Vui long thu lai!");
        }
    }
}
