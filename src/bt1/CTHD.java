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
public class CTHD {
    String sanPham;
    int soLuong;
    double donGia;
    String chietKhau;

    private CTHD(Builder builder) 
    {
        this.sanPham = builder.sanPham;
        this.soLuong = builder.soLuong;
        this.donGia = builder.donGia;
        this.chietKhau = builder.chietKhau;
    }

    @Override
    public String toString() {
        return "\n     Chi Tiet Hoa Don" + "\n        sanPham=" + sanPham + "\n        soLuong=" + soLuong + "\n        donGia=" + donGia + "\n        chietKhau=" + chietKhau  + "\n";
    }
    
    public static class Builder
    {
        String sanPham;
        int soLuong;
        double donGia;
        String chietKhau;

        public Builder() {
        }

        public Builder setSanPham(String sanPham) {
            this.sanPham = sanPham;
            return this;
        }

        public Builder setSoLuong(int soLuong) {
            this.soLuong = soLuong;
            return this;
        }

        public Builder setDonGia(double donGia) {
            this.donGia = donGia;
            return this;
        }

        public Builder setChietKhau(String chietKhau) {
            this.chietKhau = chietKhau;
            return this;
        }
        
        public CTHD Build()
        {
            return new CTHD(this);
        }
    }
}
