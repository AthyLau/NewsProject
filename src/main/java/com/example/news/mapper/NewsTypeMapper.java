package com.example.news.mapper;

import com.example.news.domain.dto.NewsTypeDTO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface NewsTypeMapper {

    /**
     * 添加
     * @param newsTypeDTO
     * @return
     */
    @Insert("INSERT INTO news_type(type_name,type_jpg) VALUES (#{TypeName},#{typeJpg})")
    boolean addNewsType(NewsTypeDTO newsTypeDTO);

    /**
     * 删除
     * @param id
     * @return
     */
    @Delete("DELETE from news_type where id = #{id}")
    boolean delById(Integer id);

    /**
     * 更新
     * @param newsTypeDTO
     * @return
     */
    @Update("Update news_type set type_name = #{typeName},type_jpg = #{typeJpg} where id = #{id}")
    boolean updateById(NewsTypeDTO newsTypeDTO);

    /**
     * 查询所以
     * @return
     */
    @Select("Select id,type_name,type_jpg from news_type")
    List<NewsTypeDTO> findAll();

    /**
     * 查询单个
     * @param id
     * @return
     */
    @Select("Select id,type_name,type_jpg from news_type where id = #{id}")
    NewsTypeDTO findById(Integer id);
}
