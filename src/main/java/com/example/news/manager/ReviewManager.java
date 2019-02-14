package com.example.news.manager;

import com.example.news.domain.dto.IntIdDTO;
import com.example.news.domain.dto.ReviewDTO;
import com.example.news.mapper.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/25 上午11:28
 * @since JDK 1.8
 */

@Repository
public class ReviewManager {

    @Autowired
    private ReviewMapper reviewMapper;

    /**
     * 添加
     * @param reviewDTO
     * @return
     */
    public boolean addReview(ReviewDTO reviewDTO) {
        return reviewMapper.addReview(reviewDTO);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    public boolean delById(Integer id) {
        return reviewMapper.delById(id);
    }

    /**
     * 更新
     * @param reviewDTO
     * @return
     */
    public boolean updateById(ReviewDTO reviewDTO) {
        return reviewMapper.updateById(reviewDTO);
    }

    /**
     * 查询某个新闻的评论
     * @param id
     * @return
     */
    public List<ReviewDTO> findById(Integer id) {
        return reviewMapper.findById(id);
    }
}
