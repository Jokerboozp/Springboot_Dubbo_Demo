package com.sc.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class StudyFile implements Serializable {

    //文件ID
    private Integer studyfileId;
    //文件名称
    private String studyfileName;
    //上传人ID
    private Integer userId;
    //创建时间
    private Date createTime;
    //文件简介
    private String studyfileInfo;
    //文件审核状态
    private Integer studyfileStatus;
    //文件喜欢数
    private Integer studyfileFav;
    //文件评论数
    private Integer studyfileReview;
    //上传文件路径
    private String studyfilePath;
    private User user;
}
