package com.codegymdanang.casestudy.service.serviceImpl;

import com.codegymdanang.casestudy.entity.FuramaHopDong;
import com.codegymdanang.casestudy.repository.HopDongRepository;
import com.codegymdanang.casestudy.service.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HopDongServiceImpl implements HopDongService {
    @Autowired
    HopDongRepository hopDongRepository;

    @Override
    public Iterable<FuramaHopDong> getAllHopDong() {
        return hopDongRepository.findAll();
    }

    @Override
    public FuramaHopDong getHopDong(Long IdHopDong) {
        return hopDongRepository.findById(IdHopDong).orElse(null);
    }

    @Override
    public void saveHopDong(FuramaHopDong hopDong) {
        hopDongRepository.save(hopDong);
    }

    @Override
    public void deleteHopDong(Long idHopDong) {
        hopDongRepository.deleteById(idHopDong);
    }

    @Override
    public Iterable<FuramaHopDong> findAllByIdKhachHang(Long id) {
        return hopDongRepository.findAllByIdKhachHang(id);
    }

}
