package com.codegymdanang.casestudy.service.serviceImpl;

import com.codegymdanang.casestudy.entity.FuramaDichVu;
import com.codegymdanang.casestudy.repository.DichVuRepository;
import com.codegymdanang.casestudy.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DichVuServiceImpl implements DichVuService {

    @Autowired
    DichVuRepository dichVuRepository;

    @Override
    public Iterable<FuramaDichVu> getAllDichVu() {
        return dichVuRepository.findAll();
    }

    @Override
    public FuramaDichVu getDichVu(Long idDichVu) {
        return dichVuRepository.findById(idDichVu).orElse(null);
    }

    @Override
    public void saveDichVu(FuramaDichVu dichVu) {
        dichVuRepository.save(dichVu);
    }

    @Override
    public void deleteDichVu(Long idDichVu) {
        dichVuRepository.deleteById(idDichVu);
    }

    @Override
    public Iterable<FuramaDichVu> findAllByChiPhiThueBetween(Integer fromPrice, Integer toPrice) {
        return dichVuRepository.findAllByChiPhiThueBetween(fromPrice,toPrice);
    }

}
