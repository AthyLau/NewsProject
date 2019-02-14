package com.example.news.mapper;

import com.example.news.domain.dto.ReviewDTO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.*;
@Mapper
@Repository
public interface ReviewMapper {

    /**
     * 添加
     * @param reviewDTO
     * @return
     */
    @Insert("INSERT INTO reviews(user_id,review_info,review_tags,news_id) values(#{userId},#{reviewInfo},#{reviewTags},#{newsId})")
    boolean addReview(ReviewDTO reviewDTO);

    /**
     * 删除
     * @param id
     * @return
     */
    @Delete("delete from reviews where id = #{id}")
    boolean delById(Integer id);

    /**
     * 更新
     * @param reviewDTO
     * @return
     */
    @Update("UPDATE reviews set user_id = #{userId},review_info=#{reviewInfo},review_tags=#{reviewTags},news_id=#{newsId} " +
            "where id = #{id} ")
    boolean updateById(ReviewDTO reviewDTO);

    /**
     * 查询某个新闻的评论
     * @param id
     * @return
     */
    @Select("SELECT id,user_id,review_info,review_tags,news_id where news_id = #{id}")
    List<ReviewDTO> findById(Integer id);
}
