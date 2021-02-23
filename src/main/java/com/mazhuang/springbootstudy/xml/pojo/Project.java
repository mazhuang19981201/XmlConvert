package com.mazhuang.springbootstudy.xml.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 项目
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "project")
public class Project {

    @XmlElement(name = "projectCode")
    private String projectCode;

    @XmlElement(name = "projectName")
    private String projectName;

    @XmlElement(name = "handleUser")
    private String handleUser;

    @XmlElement(name = "projectSchemeList")
    private List<ProjectScheme> projectSchemeList;

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getHandleUser() {
        return handleUser;
    }

    public void setHandleUser(String handleUser) {
        this.handleUser = handleUser;
    }

    public List<ProjectScheme> getProjectSchemeList() {
        return projectSchemeList;
    }

    public void setProjectSchemeList(List<ProjectScheme> projectSchemeList) {
        this.projectSchemeList = projectSchemeList;
    }
}
