package com.sc.service;

import com.sc.entity.StudyFile;

import java.util.List;

public interface StudyFileService {

    //上传文件
    void addStudyFile(StudyFile studyFile);

    //删除文件
    void deleteStudyFile(Integer studyfileId);

    //更新文件信息
    void updateStudyFile(StudyFile studyFile);

    //查看所有文件
    List<StudyFile> getAllStudyFile();

    //根据用户ID查看文件
    List<StudyFile> getStudyFileByUser(Integer userId);

    //根据文件ID查看信息
    StudyFile getStudyFileById(Integer studyfileId);

    //根据大类查看文件列表
    List<StudyFile> getFileByType(Integer childtypeId);

    //根据大类查看文件列表
    List<StudyFile> getFileByMainType(Integer maintypeId);

    //根据文件状态查看文件列表
    List<StudyFile> getFileByStatus(Integer studyfileStatus);

    //查看今日文件
    List<StudyFile> getTodayFile(Integer stufyfileStatus);

    //模糊查询文件
    List<StudyFile> searchFile(String studyfileName);

    //模糊查询以审核通过的文件
    List<StudyFile> searchPassFile(String studyfileName);

    //查询一年内每个月上传的文件数
    List<Integer> getYearPerMonthFile();
}
