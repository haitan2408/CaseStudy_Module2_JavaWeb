package com.codegymdanang.casestudy.service;

import com.codegymdanang.casestudy.entity.FuramaKhachHang;

public interface KhachHangService {
        public  Iterable<FuramaKhachHang> getAllKhachHang();

        public FuramaKhachHang getKhachHang(Long IdKhachHang);

        public void saveKhachHang(FuramaKhachHang khachHang);

        public void deleteKhachHang(Long idKhachHang);


}
