package com.springfive.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

/**
 * 使用dom4j 解释XML配置文件
 * 只是获取配置文件中bean中的class的值
 *
 * 之后还得利用反射来把对象实例化出来
 *  这样就是IOC容器的实现原理
 */
public class DomFourJ {

    public String  GetUserClass() throws DocumentException {
        File file=new File(this.getClass().getResource("/beans/")+"beansconfig.xml");
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read(file);
        Element rootElement = read.getRootElement();
        Element bean = rootElement.element("bean");
        String personInfo = bean.attributeValue("class");
        return personInfo;
    }

}
