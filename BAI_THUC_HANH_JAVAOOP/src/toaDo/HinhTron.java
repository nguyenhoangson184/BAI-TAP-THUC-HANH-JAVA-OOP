package toaDo;

public class HinhTron {
    private final float PI = 3.14f;
    private float bankinh;
    public float getbankinh(){
        return bankinh;

    }
    public void setBanKinh(float bankinh){
        this.bankinh=bankinh;
    }
    public float TinhChuvi(){
        return 2 *PI*bankinh;
    }
    public float tinhDientich(){
        return PI *bankinh*bankinh;
    }
    
}
