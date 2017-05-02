package day12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * 使用DOM生成xml文档
 * @author sss
 *
 */
public class WriteXMLDemo {

	public static void main(String[] args) throws IOException {
		
		/**
		 * 生成xml文档步骤：
		 * 1.创建Document对象，表示xml文档
		 * 2.向Document对象中添加元素
		 * 3.按照预定的格式向根元素中添加子元素最终形成既定格式
		 * 4.创建XmlWriter
		 * 5.通过XMLWriter写出Document
		 */
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1, "张三", 25, "男", 4000));
		empList.add(new Emp(2, "李四", 26, "女", 5000));
		empList.add(new Emp(3, "王五", 27, "男", 6000));
		empList.add(new Emp(4, "赵六", 28, "女", 7000));
		empList.add(new Emp(5, "钱七", 29, "男", 8000));
		
		//第一步
		Document doc = DocumentHelper.createDocument();
		/*
		 * 第二步
		 * Doucument提供了添加根元素的方法：
		 * Element addElement(String name)
		 * 向指定文档中添加指定名字的根元素，并以Element的实例形式将其返回，以便继续向根元素中做其他操作
		 * 需要注意的是，该方法只能调用一次。因为一个xml文档只能有一个根元素
		 */
		Element root = doc.addElement("list");
		//第三步
		for(Emp emp : empList){
			/*
			 * 将每一个emp实例表示的员工信息以一个<emp>标签形式存入xml文档
			 * 
			 * Element提供了方法:
			 * Element addElement(String name)
			 * 向当前标签中添加给定名字的子标签，并以Element实例表示和返回
			 */
			Element empEle = root.addElement("emp");
			//添加name
			Element nameEle = empEle.addElement("name");
			/*
			 * Element提供了方法：
			 * Element addText(String text)
			 * 向当前标签中添加指定的文本信息
			 */
			nameEle.addText(emp.getName());
			//添加age
			Element ageEle = empEle.addElement("age");
			ageEle.addText(emp.getAge()+"");
			//添加gender
			Element genderEle = empEle.addElement("gender");
			genderEle.addText(emp.getGender());
			//添加工资
			Element salaryEle = empEle.addElement("salary");
			salaryEle.addText(emp.getSalary()+"");
			
			/*
			 * Element提供了添加属性的方法：
			 * Element addAttribute(String name, String value)
			 */
			empEle.addAttribute("id", emp.getId()+"");
			
		}
		//第四步
		XMLWriter writer = new XMLWriter(OutputFormat.createPrettyPrint());
		writer.setOutputStream(new FileOutputStream("myemp.xml"));
		//第五步
		writer.write(doc);
		System.out.println("写出完毕！");
		writer.close();
		
		
		
	}//main
	
}













