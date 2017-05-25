package com.asozero.service;


import com.asozero.model.Admin;

public interface AdminService {

    Admin findByUsername(String username);
}
