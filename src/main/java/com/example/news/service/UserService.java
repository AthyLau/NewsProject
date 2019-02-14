package com.example.news.service;

import com.example.news.domain.dto.UserDTO;
import com.example.news.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/25 下午2:48
 * @since JDK 1.8
 */

@Service
public class UserService {

    @Autowired
    private UserManager userManager;

    /**
     * 添加
     * @param userDTO
     * @return
     */
    public boolean addUser(UserDTO userDTO) {

        return userManager.addUser(userDTO);

    }
}
