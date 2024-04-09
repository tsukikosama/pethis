package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pethis.entity.Doctor;
import com.example.pethis.entity.User;
import com.example.pethis.mapper.DoctorMapper;
import com.example.pethis.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.pethis.utils.Common.MAX_SIZE;

@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor>
        implements DoctorService {
    @Override
    public Page<Doctor> listByPage(Integer curr) {
        Page<Doctor> page = new Page<>(curr,MAX_SIZE);

        List<Doctor> list = this.baseMapper.listByPage(curr);

        page.setRecords(list);
        page.setTotal(this.count());
        return page;
    }

    @Override
    public List<Doctor> getHot() {

        return this.baseMapper.getHot();
    }

    @Override
    public Doctor login(Doctor doctor) {
        System.out.println(doctor);
        //用户不存在直接返回空
        if (doctor == null){
            return null;
        }
        //通过数据库查看是否存在改账号
        Doctor d = this.baseMapper.getDoctor(doctor.getUsername());
        //通过获取的用户判断密码和输入的密码是否x系统
        if(!d.getPassword().equals(doctor.getPassword())){
            //不相同返回空
            return null;
        }
        //系统返回用户
        return d;
    }
}
