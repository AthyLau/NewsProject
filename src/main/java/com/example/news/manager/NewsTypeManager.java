package com.example.news.manager;

import com.example.news.domain.dto.IntIdDTO;
import com.example.news.domain.dto.NewsTypeDTO;
import com.example.news.mapper.NewsTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/25 上午10:26
 * @since JDK 1.8
 */

@Repository
public class NewsTypeManager {
    @Autowired
    private NewsTypeMapper newsTypeMapper;
    /**
     * 添加
     * @param newsTypeDTO
     * @return
     */
    public boolean addNewsType(NewsTypeDTO newsTypeDTO) {
        return newsTypeMapper.addNewsType(newsTypeDTO);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    public boolean delById(Integer id) {
        return newsTypeMapper.delById(id);
    }

    /**
     * 更新
     * @param newsTypeDTO
     * @return
     */
    public boolean updateById(NewsTypeDTO newsTypeDTO) {
        return newsTypeMapper.updateById(newsTypeDTO);
    }

    /**
     * 查询所以
     * @return
     */
    public List<NewsTypeDTO> findAll() {
        return newsTypeMapper.findAll();
    }

    /**
     * 查询单个
     * @param id
     * @return
     */
    public NewsTypeDTO findById(Integer id) {
        return newsTypeMapper.findById(id);
    }
}
