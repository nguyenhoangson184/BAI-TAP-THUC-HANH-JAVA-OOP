package Baithuchanh;

public class mainBTH {
    public static void main(String[] args) {
        nhAnVienFulltime seP = new nhAnVienFulltime("Nguyen Dinh Dung");
        seP.setloaiChucVu(1);
        nhAnVienFulltime Linh1 = new nhAnVienFulltime("Nguyen Dinh Quan");
        Linh1.setloaiChucVu(2);
        nhAnVienFulltime Linh2 = new nhAnVienFulltime("Nguyen Tien Thinh");
        Linh2.setloaiChucVu(2);

        nhAnVienParttime thOivu= new nhAnVienParttime("Nguyen Van C", 100);
seP.tinhluong();
Linh1.tinhluong();
Linh2.tinhluong();
thOivu.tinhLuong();
seP.XuatThongTin();
Linh1.XuatThongTin();
Linh2.XuatThongTin();
thOivu.XuatThongTin();
    }
    
}
