/**
 * 
 */
package com.testany.testall.designpattern.creatingpattern.factorymethodpattern;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 读取配置信息
 * 
 * @author qiuquanying
 *
 */
public class ReadXML1 {
	private static final String CLASS_NAME = ReadXML1.class.getPackageName();
	private static final String PATH_NAME = ReadXML1.class.getResource("").getPath() + "/config1.xml";

	// 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getObject() {
		try {
			// 创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File(PATH_NAME));
			// 获取包含类名的文本节点
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String cName = CLASS_NAME + "." + classNode.getNodeValue();
			// System.out.println("新类名："+cName);
			// 通过类名生成实例对象并将其返回
			Class<?> c = Class.forName(cName);
			Object obj = c.getDeclaredConstructor().newInstance();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
