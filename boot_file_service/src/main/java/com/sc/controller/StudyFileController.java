package com.sc.controller;

import com.sc.entity.StudyFile;
import com.sc.service.StudyFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudyFileController {

    @Autowired
    private StudyFileService studyFileService;

    @RequestMapping("/studyfile/{studyfileId}")
    @ResponseBody
    public StudyFile getFileById(@PathVariable("studyfileId")Integer studyfileId){
        StudyFile studyFileById = studyFileService.getStudyFileById(studyfileId);
        return studyFileById;
    }
}
