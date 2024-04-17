package Baithuchanh;

public class nhAnVienFulltime extends nhAnVien{
    private int ngaylAmthem;
    private int loaichucVu;
    public nhAnVienFulltime(String ten){
        this.ten = ten;
    }
    public nhAnVienFulltime(String ten , int ngaylAmthem){
        this.ten = ten;
        this.ngaylAmthem = ngaylAmthem;
    }
    public int getloAiChucVu(){
        return loaichucVu;
    }
    public void setloaiChucVu(int loaichucVu){
        this.loaichucVu = loaichucVu;
}
@Override
public String loaiNhanVien(){
    return "Nhan vien fullTime";
}
public void tinhluong(){
    if(loaichucVu ==1){
        luong = configs.luongFulltime_Sep + configs.luongLamthemMoiNgay * ngaylAmthem;
    } else if(loaichucVu == 2){
        luong = configs.luongFulltime_Linh + configs.luongLamthemMoiNgay *ngaylAmthem;
    }
}
    
}
