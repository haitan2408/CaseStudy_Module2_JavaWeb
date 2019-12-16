package com.codegymdanang.casestudy.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loaidichvu")
public class FuramaLoaiDichVu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tendichvu")
    private String tenDichVu;

    @OneToMany(targetEntity = FuramaDichVu.class)
    private List<FuramaDichVu> furamaDichVu;

    public FuramaLoaiDichVu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public List<FuramaDichVu> getFuramaDichVus() {
        return furamaDichVu;
    }

    public void setFuramaDichVus(List<FuramaDichVu> furamaDichVus) {
        this.furamaDichVu = furamaDichVus;
    }
}
