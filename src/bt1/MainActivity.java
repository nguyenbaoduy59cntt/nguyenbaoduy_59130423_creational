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
public class MainActivity {
    public static void main(String[] args) {
        HoaDonHeader hd = new HoaDonHeader.Builder().setMaHD("123").setNgayBan("17/05/2020").setTenKH("Nguyen Bao Duy").Build();
        CTHD cthd = new CTHD.Builder().setSanPham("iPhone15 Pro Max").setSoLuong(2).setDonGia(5000).setChietKhau("5%").Build();
        HoaDon hdmain = new HoaDon.Builder().setHoadonHeader(hd).setListHD(cthd).Build();
        System.out.println(hdmain);
    }
}
