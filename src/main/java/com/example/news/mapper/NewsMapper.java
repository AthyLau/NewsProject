package com.example.news.mapper;

import com.example.news.domain.dto.NewsDTO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface NewsMapper {

    /**
     * 添加
     * @param newsDTO
     * @return
     */
    @Insert("INSERT INTO news( news_title, news_content, news_jpg ,news_type_id) " +
            "VALUES (#{newsTitle},#{newsContent},#{newsJpg},#{newsTypeId});")
    boolean addNews(NewsDTO newsDTO);

    /**
     * 删除
     * @param id
     * @return
     */
    @Delete("DELETE FROM news where id = #{id}")
    boolean delById(Integer id);

    /**
     * 更新
     * @param newsDTO
     * @return
     */
    @Update("update news set news_title = #{newsTitle}, news_content=#{newsContent}, news_jpg=#{newsJpg} ,news_type_id=#{newsTypeId} ")
    boolean updateById(NewsDTO newsDTO);

    /**
     * 查询所有的
     * @return
     */
    @Select("Select id,news_title, news_content, news_jpg, create_time, news_type_id, update_time from news")
    List<NewsDTO> findAll();

    /**
     * 查询某条
     * @return
     */
    @Select("Select id,news_title, news_content, news_jpg, create_time, news_type_id, update_time from news where id = #{id}")
    NewsDTO findById(Integer id);
    /**
     * 查询某类新闻
     * @param id
     * @return
     */
    @Select("Select id,news_title, news_content, news_jpg, create_time, news_type_id, update_time from news where news_type_id = #{id}")
    List<NewsDTO> findByTypeId(Integer id);
}
