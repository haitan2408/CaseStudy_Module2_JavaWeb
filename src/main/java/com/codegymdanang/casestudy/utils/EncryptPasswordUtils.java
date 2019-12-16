package com.codegymdanang.casestudy.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptPasswordUtils {

    public static String EncryptPasswordUtils(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

    public static void main(String[] args) {
        System.out.println("pass 123456 ma hoa thanh: " + EncryptPasswordUtils("123"));
    }

}
