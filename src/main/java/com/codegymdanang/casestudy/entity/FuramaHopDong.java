package com.codegymdanang.casestudy.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "hopdong")
public class FuramaHopDong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhopdong")
    private Long id;

    @Column(name = "idnhanvien")
    private Long IdNhanVien;

    @Column(name = "idkhachhang")
    private Long idKhachHang;

    @Column(name = "ngaylamhopdong")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date ngayLamHopDong;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "ngayketthuc")
    private Date ngayKetThuc;

    @Column(name = "tiendatcoc")
    private double tienDatCoc;

    @Column(name = "tongtien")
    private double tongTien;

    @Column(name = "iddichvu")
    private Long IdDichVu;

    public FuramaHopDong() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdNhanVien() {
        return IdNhanVien;
    }

    public void setIdNhanVien(Long idNhanVien) {
        IdNhanVien = idNhanVien;
    }

    public Long getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Long idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public Date getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(Date ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public double getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(double tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public Long getIdDichVu() {
        return IdDichVu;
    }

    public void setIdDichVu(Long idDichVu) {
        IdDichVu = idDichVu;
    }
}
