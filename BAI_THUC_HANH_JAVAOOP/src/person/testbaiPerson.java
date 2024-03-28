package person;
import person.employeefulltime;
import person.employeept;
import person.employee;

public class testbaiPerson {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.xuatten("Employee");
        e1.NhapthongtinNV();
        e1.indiachi();


        employeept e2 = new employeept();
        e2.xuatten("Nhan vien pt");
        e2.nhapThongTin();
        e2.indiachi();
        e2.NhapGiolam();
        e2.TinhluongPT();
        e2.TongLuong();

        employeefulltime e3 = new employeefulltime();
        e3.xuatten("Nhan vien full time");
        e3.nhapThongTin();
        e3.indiachi();
        e3.Nhapsongaylam();
        e3.TinhLuongFT();
        e3.TongLuong();
    }
    


}
