package Baithuchanh;

public class nhAnVien {
    protected String ten ;
    protected long luong;
    public nhAnVien(){

    }
    public nhAnVien(String ten){
        this.ten = ten;
    }
    protected String loaiNhanVien(){
        return "" ;
    }
    public void XuatThongTin(){
        System.out.println("=== Nhan vien :"+ ten +"===");
        System.out.println("_ Loai Nhan vien:"+loaiNhanVien());
        System.out.println("_ Luong :"+luong+ "VND");
    }
    
}
