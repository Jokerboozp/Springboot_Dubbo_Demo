package com.sc.serviceimpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sc.entity.StudyFile;
import com.sc.entity.User;
import com.sc.mapper.StudyFileMapper;
import com.sc.service.StudyFileService;
import com.sc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyFileServiceImpl implements StudyFileService {

    @Autowired
    private StudyFileMapper studyFileMapper;
    @Reference //注解 注册中心引用服务
    private UserService userService;

    @Override
    public void addStudyFile(StudyFile studyFile) {
        studyFileMapper.addStudyFile(studyFile);
    }

    @Override
    public void deleteStudyFile(Integer studyfileId) {
        studyFileMapper.deleteStudyFile(studyfileId);
    }

    @Override
    public void updateStudyFile(StudyFile studyFile) {
        studyFileMapper.updateStudyFile(studyFile);
    }

    @Override
    public List<StudyFile> getAllStudyFile() {
        return studyFileMapper.getAllStudyFile();
    }

    @Override
    public List<StudyFile> getStudyFileByUser(Integer userId) {
        return studyFileMapper.getStudyFileByUser(userId);
    }

    @Override
    public StudyFile getStudyFileById(Integer studyfileId) {
        StudyFile studyFileById = studyFileMapper.getStudyFileById(studyfileId);
        User userById = userService.getUserById(studyFileById.getUserId());
        studyFileById.setUser(userById);
        return studyFileById;
    }

    @Override
    public List<StudyFile> getFileByType(Integer childtypeId) {
        return studyFileMapper.getFileByType(childtypeId);
    }

    @Override
    public List<StudyFile> getFileByStatus(Integer studyfileStatus) {
        return studyFileMapper.getFileByStatus(studyfileStatus);
    }

    @Override
    public List<StudyFile> getFileByMainType(Integer maintypeId) {
        return studyFileMapper.getFileByMainType(maintypeId);
    }

    @Override
    public List<StudyFile> getTodayFile(Integer studyfileStatus) {
        return studyFileMapper.getTodayFile(studyfileStatus);
    }

    @Override
    public List<StudyFile> searchPassFile(String studyfileName) {
        if (studyfileName!=null && !studyfileName.equals(" "))
            studyfileName="%"+studyfileName+"%";
        else
            studyfileName=null;
        return studyFileMapper.searchPassFile(studyfileName);
    }

    @Override
    public List<StudyFile> searchFile(String studyfileName) {
        if (studyfileName!=null && !studyfileName.equals(" "))
            studyfileName="%"+studyfileName+"%";
        else
            studyfileName=null;
        return studyFileMapper.searchFile(studyfileName);
    }

    @Override
    public List<Integer> getYearPerMonthFile() {
        return studyFileMapper.getYearPerMonthFile();
    }

}
