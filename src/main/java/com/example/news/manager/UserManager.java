package com.example.news.manager;

import com.example.news.domain.dto.UserDTO;
import com.example.news.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/25 下午2:49
 * @since JDK 1.8
 */

@Repository
public class UserManager {
    @Autowired
    private UserMapper userMapper;

    /**
     * 添加
     * @param userDTO
     * @return
     */
    public boolean addUser(UserDTO userDTO) {
        return userMapper.addUser(userDTO);
    }
}
