package com.example.news.mapper;

import com.example.news.domain.dto.UserDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    /**
     * 添加
     * @param userDTO
     * @return
     */
    @Insert("insert into users(user_name,user_sex,user_phone,user_mail,user_password,locked) " +
            "values(#{userName},#{userSex},#{userPhone},#{userMail},#{userPassword},#{locked})")
    boolean addUser(UserDTO userDTO);
}
