/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author Admin
 */
public class HoaDonHeader 
{
    String maHD;
    String ngayBan;
    String tenKH;

    public HoaDonHeader(Builder builder) 
    {
        this.maHD = builder.maHD;
        this.ngayBan = builder.ngayBan;
        this.tenKH = builder.tenKH;
        
        
    }

    @Override
    public String toString() {
        return "Hoa Don Header" + "\n     maHD=" + maHD + "\n     ngayBan=" + ngayBan + "\n     tenKH=" + tenKH + "\n";
    }
    
    public static class Builder
    {
        String maHD;
        String ngayBan;
        String tenKH;

        public Builder() {
        }

        public Builder setMaHD(String maHD) {
            this.maHD = maHD;
            return this;
        }

        public Builder setNgayBan(String ngayBan) {
            this.ngayBan = ngayBan;
            return this;
        }

        public Builder setTenKH(String tenKH) {
            this.tenKH = tenKH;
            return this;
        }
        
        public HoaDonHeader Build()
        {
            return new HoaDonHeader(this);
        }
    }
}


