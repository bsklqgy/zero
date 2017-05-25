package com.asozero.controller.admin;


import com.asozero.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller("adminAdminController")
@RequestMapping("/admin/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    /**
     * 检查用户名是否存在
     */
    @RequestMapping(value = "/check_username", method = RequestMethod.GET)
    @ResponseBody
    public boolean checkUsername(String username) {
        if (StringUtils.isEmpty(username)) {
            return false;
        }
        if (adminService.findByUsername(username)!=null) {
            return false;
        } else {
            return true;
        }
    }

}
