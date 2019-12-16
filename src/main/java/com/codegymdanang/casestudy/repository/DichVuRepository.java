package com.codegymdanang.casestudy.repository;

import com.codegymdanang.casestudy.entity.FuramaDichVu;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DichVuRepository extends PagingAndSortingRepository<FuramaDichVu,Long> {

    Iterable<FuramaDichVu> findAllByChiPhiThueBetween(Integer fromPrice, Integer toPrice);
}
