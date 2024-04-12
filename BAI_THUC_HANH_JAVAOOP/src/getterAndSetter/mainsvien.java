package getterAndSetter;

public class mainsvien {
    public static void main(String[] args) {
        sinhVien sv= new sinhVien();
        sinhVien sv1= new sinhVien();
        sv.setTen("");
        sv.setTuoi(23);
        sv1.setTen("Hson");
        sv1.setTuoi(17);
        System.out.println("Sinh vien thu nhat co ten "+sv.getTen()+"'tuoi"+sv.getTuoi());
    System.out.println("Sinh vien thu 2 co ten :"+sv1.getTen()+" va tuoi:"+sv1.getTuoi()); 
 }   
    }
