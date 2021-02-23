package com.mazhuang.springbootstudy.xml.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 项目方案
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "projectSchemeList")
public class ProjectScheme {

    @XmlElement(name = "projectSchemeCode")
    private String projectSchemeCode;

    @XmlElement(name = "schemeStatus")
    private Integer schemeStatus;

    public String getProjectSchemeCode() {
        return projectSchemeCode;
    }

    public void setProjectSchemeCode(String projectSchemeCode) {
        this.projectSchemeCode = projectSchemeCode;
    }

    public Integer getSchemeStatus() {
        return schemeStatus;
    }

    public void setSchemeStatus(Integer schemeStatus) {
        this.schemeStatus = schemeStatus;
    }
}
