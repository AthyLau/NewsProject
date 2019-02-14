package com.example.news.manager;

import com.example.news.domain.dto.IntIdDTO;
import com.example.news.domain.dto.NewsDTO;
import com.example.news.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/24 下午7:42
 * @since JDK 1.8
 */
@Repository
public class NewsManager {
    @Autowired
    private NewsMapper newsMapper;
    /**
     * 添加
     * @param newsDTO
     * @return
     */
    public boolean addNews(NewsDTO newsDTO) {
        return newsMapper.addNews(newsDTO);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    public boolean delById(Integer id) {
        return newsMapper.delById(id);
    }

    /**
     * 更新
     * @param newsDTO
     * @return
     */
    public boolean updateById(NewsDTO newsDTO) {
        return newsMapper.updateById(newsDTO);
    }

    /**
     * 查询所有的
     * @return
     */
    public List<NewsDTO> findAll() {
        return newsMapper.findAll();
    }

    /**
     * 查询某条
     * @return
     */
    public NewsDTO findById(Integer id) {
        return newsMapper.findById(id);
    }
    /**
     * 查询某类新闻
     * @param id
     * @return
     */
    public List<NewsDTO> findByTypeId(Integer id) {
        return newsMapper.findByTypeId(id);
    }
}
