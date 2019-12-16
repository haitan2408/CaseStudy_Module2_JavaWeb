package com.codegymdanang.casestudy.service;

import com.codegymdanang.casestudy.entity.FuramaDichVu;
import com.codegymdanang.casestudy.entity.FuramaHopDong;

import java.util.List;

public interface HopDongService {
    public  Iterable<FuramaHopDong> getAllHopDong();

    public FuramaHopDong getHopDong(Long IdHopDong);

    public void saveHopDong(FuramaHopDong hopDong);

    public void deleteHopDong(Long idHopDong);

    Iterable<FuramaHopDong> findAllByIdKhachHang(Long id);
}
