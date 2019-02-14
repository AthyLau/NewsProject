package com.example.news.domain.dto;

/**
 * Function:   封装Integer类型的id
 *
 * @author liubing
 * Date: 2018/12/24 下午4:33
 * @since JDK 1.8
 */


public class IntIdDTO {
    private Integer id;

    public IntIdDTO() {
    }

    public IntIdDTO(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "IntIdDTO{" +
                "id=" + id +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
