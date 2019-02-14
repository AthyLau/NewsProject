package com.example.news.service;

import com.example.news.domain.dto.IntIdDTO;
import com.example.news.domain.dto.NewsDTO;
import com.example.news.manager.NewsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/24 下午4:31
 * @since JDK 1.8
 */

@Service
public class NewsService {
    @Autowired
    private NewsManager newsManager;
    /**
     * 添加
     * @param newsDTO
     * @return
     */
    public boolean addNews(NewsDTO newsDTO) {
        return newsManager.addNews(newsDTO);
    }

    /**
     * 删除
     * @param intIdDTO
     * @return
     */
    public boolean delById(IntIdDTO intIdDTO) {
        return newsManager.delById(intIdDTO.getId());
    }

    /**
     * 更新
     * @param newsDTO
     * @return
     */
    public boolean updateById(NewsDTO newsDTO) {
        return newsManager.updateById(newsDTO);
    }

    /**
     * 查询所有的
     * @return
     */
    public List<NewsDTO> findAll() {
        return newsManager.findAll();
    }

    /**
     * 查询某条
     * @return
     */
    public NewsDTO findById(IntIdDTO intIdDTO) {
        return newsManager.findById(intIdDTO.getId());
    }

    /**
     * 查询某类新闻
     * @param intIdDTO
     * @return
     */
    public List<NewsDTO> findByTypeId(IntIdDTO intIdDTO) {
        return newsManager.findByTypeId(intIdDTO.getId());
    }
}
