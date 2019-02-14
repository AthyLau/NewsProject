package com.example.news.domain.dto;

import java.util.Date;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/25 上午11:15
 * @since JDK 1.8
 */


public class ReviewDTO {
    /**
     * id
     */
    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 评论内容
     */
    private String reviewInfo;
    /**
     * 评论获赞数量
     */
    private Integer reviewTags;
    /**
     * 新闻id
     */
    private Integer newsId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    public ReviewDTO() {
    }

    public ReviewDTO(Integer id, Integer userId, String reviewInfo, Integer reviewTags, Integer newsId, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.reviewInfo = reviewInfo;
        this.reviewTags = reviewTags;
        this.newsId = newsId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ReviewDTO{" +
                "id=" + id +
                ", userId=" + userId +
                ", reviewInfo='" + reviewInfo + '\'' +
                ", reviewTags=" + reviewTags +
                ", newsId=" + newsId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReviewInfo() {
        return reviewInfo;
    }

    public void setReviewInfo(String reviewInfo) {
        this.reviewInfo = reviewInfo;
    }

    public Integer getReviewTags() {
        return reviewTags;
    }

    public void setReviewTags(Integer reviewTags) {
        this.reviewTags = reviewTags;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
