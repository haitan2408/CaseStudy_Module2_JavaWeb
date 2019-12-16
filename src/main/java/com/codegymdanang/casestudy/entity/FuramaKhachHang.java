package com.codegymdanang.casestudy.entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.sql.Date;


@Entity
@Table(name = "khachhang")
public class FuramaKhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idkhachhang")
    private Long id;

    @Column(name = "idloaikhach")
    private Long idLoaiKhach;

    @NotEmpty(message = "Họ tên không được để trống")
    @Column(name = "hoten")
    private String hoTen;

    @Column(name = "ngaysinh")
    private Date ngaySinh;

    @NotEmpty(message = "CMND không được để trống")
    @Column(name = "socmtnd")
    private String CMND;

    @NotEmpty(message = "SDT không được để trống")
    @Column(name = "sdt")
    private String sdt;

    @NotEmpty(message = "Email không được để trống")
    @Pattern(regexp = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", message = "Email chưa đúng định dạng")
    @Column(name = "email")
    private String email;

    @NotEmpty(message = "Địa chỉ không được để trống")
    @Column(name = "diachi")
    private String diaChi;

    public FuramaKhachHang() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdLoaiKhach() {
        return idLoaiKhach;
    }

    public void setIdLoaiKhach(Long idLoaiKhach) {
        this.idLoaiKhach = idLoaiKhach;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
