package com.example.news.service;

import com.example.news.domain.dto.IntIdDTO;
import com.example.news.domain.dto.ReviewDTO;
import com.example.news.manager.ReviewManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/25 上午11:24
 * @since JDK 1.8
 */

@Service
public class ReviewService {
    @Autowired
    private ReviewManager reviewManager;
    /**
     * 添加
     * @param reviewDTO
     * @return
     */
    public boolean addReview(ReviewDTO reviewDTO) {
        return reviewManager.addReview(reviewDTO);
    }

    /**
     * 删除
     * @param intIdDTO
     * @return
     */
    public boolean delById(IntIdDTO intIdDTO) {
        return reviewManager.delById(intIdDTO.getId());
    }

    /**
     * 更新
     * @param reviewDTO
     * @return
     */
    public boolean updateById(ReviewDTO reviewDTO) {
        return reviewManager.updateById(reviewDTO);
    }

    /**
     * 查询某个新闻的评论
     * @param intIdDTO
     * @return
     */
    public List<ReviewDTO> findById(IntIdDTO intIdDTO) {
        return reviewManager.findById(intIdDTO.getId());
    }
}
