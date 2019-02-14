package com.example.news.domain.dto;

import java.util.Date;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/24 下午4:20
 * @since JDK 1.8
 */


public class NewsDTO {
    /**
     * id
     */
    private Integer id;
    /**
     * 新闻标题
     */
    private String newsTitle;
    /**
     * 新闻内容
     */
    private String newsContent;
    /**
     * 新闻jpg
     */
    private String newsJpg;
    /**
     * 新闻类型id
     */
    private Integer newsTypeId;

    public NewsDTO() {
    }

    public NewsDTO(Integer id, String newsTitle, String newsContent, String newsJpg, Integer newsTypeId) {
        this.id = id;
        this.newsTitle = newsTitle;
        this.newsContent = newsContent;
        this.newsJpg = newsJpg;
        this.newsTypeId = newsTypeId;
    }

    @Override
    public String toString() {
        return "NewsDTO{" +
                "id=" + id +
                ", newsTitle='" + newsTitle + '\'' +
                ", newsContent='" + newsContent + '\'' +
                ", newsJpg='" + newsJpg + '\'' +
                ", newsTypeId='" + newsTypeId + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsJpg() {
        return newsJpg;
    }

    public void setNewsJpg(String newsJpg) {
        this.newsJpg = newsJpg;
    }

    public Integer getNewsTypeId() {
        return newsTypeId;
    }

    public void setNewsTypeId(Integer newsTypeId) {
        this.newsTypeId = newsTypeId;
    }
}
