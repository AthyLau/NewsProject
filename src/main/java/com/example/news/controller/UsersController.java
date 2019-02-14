package com.example.news.controller;

import com.example.news.commonbox.Result;
import com.example.news.commonbox.ResultGenerator;
import com.example.news.domain.dto.UserDTO;
import com.example.news.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/24 下午4:17
 * @since JDK 1.8
 */

@Validated
@RestController
@RequestMapping("/user")
@Api(description = "用户controller")
public class UsersController {

    @Autowired
    private UserService userService;

    /**
     * 添加
     * @param userDTO
     * @return
     */
    @ApiOperation(value = "添加用户", httpMethod = "POST")
    @PostMapping("/add_user")
    @RequiresAuthentication
    public Result addUser(@RequestBody UserDTO userDTO){
        if(userService.addUser(userDTO)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("添加失败");
    }


}
