package com.codegymdanang.casestudy.repository;

import com.codegymdanang.casestudy.entity.FuramaKhachHang;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends CrudRepository<FuramaKhachHang, Long> {
}
