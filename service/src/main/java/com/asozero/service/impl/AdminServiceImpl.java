package com.asozero.service.impl;

import com.asozero.dao.AdminMapper;
import com.asozero.model.Admin;
import com.asozero.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Transactional(readOnly = true)
    public Admin findByUsername(String username) {
        return adminMapper.selectByUsername(username);
    }
}
