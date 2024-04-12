package getterAndSetter;

public class mainhTron {
    public static void main(String[] args) {
        HinhTron ht1 = new HinhTron();
        ht1.setBanKinh(10);
        float chuVi= ht1.TinhChuvi();
        float dienTich= ht1.tinhDientich();
        System.out.println("Chu vi hinh tron ="+chuVi + "Dien tich hinh tron = "+dienTich);
    }
    
}
