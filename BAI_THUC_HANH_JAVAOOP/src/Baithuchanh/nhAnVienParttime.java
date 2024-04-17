package Baithuchanh;

public class nhAnVienParttime extends nhAnVien{
    private int gioLamViec;
    public nhAnVienParttime(String ten , int gioLamViec){
        this.ten = ten ;
        this.gioLamViec= gioLamViec;
    }
    @Override
    public String loaiNhanVien(){
        return "Nhan vien THoi vu";
    }
    public void tinhLuong(){
        luong = configs.luongNhanVienlamthemMoiGio*gioLamViec;
        
    }
}
