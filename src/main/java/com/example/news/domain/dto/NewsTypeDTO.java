package com.example.news.domain.dto;

/**
 * Function:新闻类型dto
 *
 * @author liubing
 * Date: 2018/12/24 下午2:30
 * @since JDK 1.8
 */


public class NewsTypeDTO {
    /**
     * id
     */
    private Integer id;
    /**
     * 类型名字
     */
    private String typeName;
    /**
     * 类型图片
     */
    private String typeJpg;

    public NewsTypeDTO() {
    }

    public NewsTypeDTO(Integer id, String typeName, String typeJpg) {
        this.id = id;
        this.typeName = typeName;
        this.typeJpg = typeJpg;
    }

    @Override
    public String toString() {
        return "NewsTypeVO{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", typeJpg='" + typeJpg + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeJpg() {
        return typeJpg;
    }

    public void setTypeJpg(String typeJpg) {
        this.typeJpg = typeJpg;
    }
}
