package com.codegymdanang.casestudy.service.serviceImpl;

import com.codegymdanang.casestudy.entity.FuramaKhachHang;
import com.codegymdanang.casestudy.repository.KhachHangRepository;
import com.codegymdanang.casestudy.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    KhachHangRepository khachHangRepository;

    @Override
    public Iterable<FuramaKhachHang> getAllKhachHang() {
        return khachHangRepository.findAll();
    }

    @Override
    public FuramaKhachHang getKhachHang(Long IdKhachHang) {
        return khachHangRepository.findById(IdKhachHang).orElse(null);
    }

    @Override
    public void saveKhachHang(FuramaKhachHang khachHang) {

        khachHangRepository.save(khachHang);
    }

    @Override
    public void deleteKhachHang(Long idKhachHang) {
        khachHangRepository.deleteById(idKhachHang);
    }
}
