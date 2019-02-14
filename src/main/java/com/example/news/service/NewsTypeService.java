package com.example.news.service;

import com.example.news.domain.dto.IntIdDTO;
import com.example.news.domain.dto.NewsTypeDTO;
import com.example.news.manager.NewsTypeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/24 下午7:35
 * @since JDK 1.8
 */

@Service
public class NewsTypeService {

    @Autowired
    private NewsTypeManager newsTypeManager;
    /**
     * 添加
     * @param newsTypeDTO
     * @return
     */
    public boolean addNewsType(NewsTypeDTO newsTypeDTO) {
        return newsTypeManager.addNewsType(newsTypeDTO);
    }

    /**
     * 删除
     * @param intIdDTO
     * @return
     */
    public boolean delById(IntIdDTO intIdDTO) {
        return newsTypeManager.delById(intIdDTO.getId());
    }

    /**
     * 更新
     * @param newsTypeDTO
     * @return
     */
    public boolean updateById(NewsTypeDTO newsTypeDTO) {
        return newsTypeManager.updateById(newsTypeDTO);
    }

    /**
     * 查询所以
     * @return
     */
    public List<NewsTypeDTO> findAll() {
        return newsTypeManager.findAll();
    }

    /**
     * 查询单个
     * @param intIdDTO
     * @return
     */
    public NewsTypeDTO findById(IntIdDTO intIdDTO) {
        return newsTypeManager.findById(intIdDTO.getId());
    }
}
