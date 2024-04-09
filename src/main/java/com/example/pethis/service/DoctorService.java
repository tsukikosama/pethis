package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pethis.entity.Doctor;
import com.example.pethis.entity.User;

import java.util.List;

public interface DoctorService extends IService<Doctor> {
    Page<Doctor> listByPage(Integer curr);

    List<Doctor> getHot();

    Doctor login(Doctor doctor);
}
