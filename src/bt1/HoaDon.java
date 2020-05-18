/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDon {
    HoaDonHeader hoadonHeader;
    ArrayList<CTHD> listHD;

    public HoaDon(Builder builder) {
        this.hoadonHeader = builder.hoadonHeader;
        this.listHD = builder.listHD;
    }

    @Override
    public String toString() {
        return "HOA DON" + "\n" + hoadonHeader  + listHD;
    }
    
    public static class Builder
    {
        HoaDonHeader hoadonHeader;
        ArrayList<CTHD> listHD;

        public Builder() 
        {
            listHD = new ArrayList<>();
        }

        public Builder setHoadonHeader(HoaDonHeader hoadonHeader) {
            this.hoadonHeader = hoadonHeader;
            return this;
        }

        public Builder setListHD(CTHD cthd) {
            this.listHD.add(cthd);
            return this;
        }
        
        public HoaDon Build()
        {
            return new HoaDon(this);
        }
    }
}
