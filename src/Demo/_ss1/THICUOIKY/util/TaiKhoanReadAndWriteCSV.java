package Demo._ss1.THICUOIKY.util;

import Demo._ss1.THICUOIKY.model.TaiKhoan;
import Demo._ss1.THICUOIKY.model.TaiKhoanThanhToan;
import Demo._ss1.THICUOIKY.model.TaiKhoanTietKiem;
import Demo._ss1.THICUOIKY.service.TaiKhoanService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaiKhoanReadAndWriteCSV {
    final static String Path_file = "/Users/phuducdo/Desktop/phuducdo/CODEGYM/Module_2/src/Demo/_ss1/THICUOIKY/data/bank_account.csv";

    public static List<TaiKhoan> readFileCSV() throws IOException {
        List<TaiKhoan> taiKhoanList = new ArrayList<>();
        FileReader fileReader = new FileReader(Path_file);
        BufferedReader buff = new BufferedReader(fileReader);

        //Doc tu file csv theo cac line co dang String
        String line;
        String[] temp;
        TaiKhoanThanhToan taiKhoanThanhToan;
        TaiKhoanTietKiem taiKhoanTietKiem;

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            int size = temp.length;
            if (size == 8) {
                //Tao doi tuong kieu Tai Khoan Tiet Kiem them vao taiKhoanList
                int id = Integer.parseInt(temp[0]);
                String maTaiKhoan = temp[1];
                String tenChuTaiKhoan = temp[2];
                String ngayTaoTaiKhoan = temp[3];
                double soTienGui = Double.parseDouble(temp[4]);
                String ngayGui = temp[5];
                double laiSuat = Double.parseDouble(temp[6]);
                int kyHan = Integer.parseInt(temp[7]);

                taiKhoanTietKiem = new TaiKhoanTietKiem(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan, soTienGui, ngayGui, laiSuat, kyHan);
                taiKhoanList.add(taiKhoanTietKiem);

            } else if (size == 6) {
                //Tao doi tuong kieu Tai Khoan Thanh Toan them vao taiKhoanList
                int id = Integer.parseInt(temp[0]);
                String maTaiKhoan = temp[1];
                String tenChuTaiKhoan = temp[2];
                String ngayTaoTaiKhoan = temp[3];
                String soThe = temp[4];
                double soTienDaCo = Double.parseDouble(temp[5]);

                taiKhoanThanhToan = new TaiKhoanThanhToan(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan, soThe, soTienDaCo);
                taiKhoanList.add(taiKhoanThanhToan);
            }
        }
        buff.close();
        return taiKhoanList;
    }

    public static void writeFileCSV(List<TaiKhoan> taiKhoanList) throws IOException {
        FileWriter fileWriter = new FileWriter(Path_file);
        BufferedWriter buff = new BufferedWriter(fileWriter);

        for (TaiKhoan taiKhoan : taiKhoanList) {
//            if (taiKhoan instanceof TaiKhoanTietKiem) {
//                buff.write(((TaiKhoanTietKiem) taiKhoan).getInfor());
//            } else if (taiKhoan instanceof TaiKhoanThanhToan) {
//                buff.write(((TaiKhoanThanhToan) taiKhoan).getInfor());
//            }
            buff.write(taiKhoan.getInfor());
        }
        buff.close();
    }
}
