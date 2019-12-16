package com.codegymdanang.casestudy.service;

import com.codegymdanang.casestudy.entity.FuramaDichVu;

import java.util.Optional;

public interface DichVuService {

    public  Iterable<FuramaDichVu> getAllDichVu();

    public FuramaDichVu getDichVu(Long idDichVu);

    public void saveDichVu(FuramaDichVu dichVu);

    public void deleteDichVu(Long idDichVu);

    public Iterable<FuramaDichVu> findAllByChiPhiThueBetween(Integer fromPrice, Integer toPrice);
}
