package com.mazhuang.springbootstudy.xml.parse;


import com.mazhuang.springbootstudy.xml.pojo.Project;
import com.mazhuang.springbootstudy.xml.pojo.ProjectScheme;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class XmlConvert {

    public static String xmlConvert(Object object,String encoding,boolean flag) throws JAXBException {

        StringWriter stringWriter = new StringWriter();
        JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_ENCODING,encoding);
        // 如果为空
        if (!StringUtils.hasText(encoding)){
            marshaller.setProperty(Marshaller.JAXB_ENCODING,"UTF-8");
        }

        if (flag){
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,flag);
        }
        marshaller.marshal(object,stringWriter);

        return stringWriter.toString();
    }

    public static void main(String[] args) throws JAXBException {

        ProjectScheme projectScheme = new ProjectScheme();
        ProjectScheme projectScheme1 = new ProjectScheme();
        Project project = new Project();
        List<ProjectScheme> projectSchemeList = new ArrayList<>();

        projectScheme.setProjectSchemeCode("0001");
        projectScheme.setSchemeStatus(1024);

        projectScheme1.setProjectSchemeCode("0002");
        projectScheme1.setSchemeStatus(1024);

        projectSchemeList.add(projectScheme);
        projectSchemeList.add(projectScheme1);

        project.setProjectCode("01");
        project.setProjectName("项目");
        project.setHandleUser("ma");
        project.setProjectSchemeList(projectSchemeList);

        String resultXml = xmlConvert(project, "", true);

        System.out.println(resultXml);

    }

}
