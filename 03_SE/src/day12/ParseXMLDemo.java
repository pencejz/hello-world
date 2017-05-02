package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 使用dom解析xml文档
 * @author sss
 *
 */
public class ParseXMLDemo {

	public static void main(String[] args) 
			throws FileNotFoundException, DocumentException {
		/**
		 * 使用dom解析xml文档的步骤：
		 * 1.创建SAXReader
		 * 2.使用SAXReader读取并解析xml文档解析后会返回一个Document的对象，该对象即表示解析的xml文档内容
		 *   这一步就是dom耗时耗资的地方了，因为会将xml文档全部读取完并载入内存
		 * 3.通过Document获取根元素
		 * 4.根据文档结构从根元素开始逐级获取子元素，已达到遍历xml文档内容的目的
		 */
		//第一步
		SAXReader reader = new SAXReader();
		//第二步
		Document doc = reader.read(new FileInputStream("emplist.xml"));
		
		/**
		 * 第三步 获取根元素
		 * Document提供了获取根元素的方法：
		 * Element getRootElement()
		 * 
		 * Element
		 * 每一个Element实例都表示xml文档中的一个元素，即：
		 * 一对标签通过Element实例，可以获取该实例表示的标签中的相关信息
		 * 例如该标签的名字标签的属性，以及该标签包含的所有子标签
		 */
		Element root = doc.getRootElement();
		/*
		 * String getName() 获得标签名
		 */
		System.out.println("根标签名为："+root.getName());
		
		/**
		 * 第四步
		 * 解析xml文档内容，获取其中保存的所有员工信息
		 * 每个员工解析后可以使用Emp的一个实例保存
		 */
		//该集合用来保存解析出来的所有员工信息
		List<Emp> empList = new ArrayList<Emp>();
		
		/**
		 * Element提供了获取子标签的相关方法。常用的有：
		 * 
		 * Element element(String name)	获取当前标签下指定名字的子标签（在子标签名字没有重复的时候常用）
		 * 
		 * List elements()	获取当前表标签下所有子标签，返回的集合中是若干的Element实例，每一个实例表示其中一个子标签
		 * 
		 * List elements(String name)	获取当前标签下指定名字的所有子标签（在子标签名字有重复的时候使用）
		 * 
		 * String getText()	获取当前标签中的文本
		 * 
		 * String getTextTrim()	在获取了标签中的文本之后，还会去除该字符串两端的空白
		 */
		//获取跟标签中的所有子标签
		List<Element> list = root.elements();
		//遍历所有子标签，每一个就是一个emp标签
		for(Element each : list){
			//获取name的值
			Element nameEle = each.element("name"); //获取<name>标签
			String name = nameEle.getText(); //获取标签中的文本
			//获取age值
			int age = Integer.parseInt(each.elementText("age"));
			//获取gender
			String gender = each.elementText("gender");
			//获取salary
			int salary = Integer.parseInt(each.elementText("salary"));
			
			/**
			 * Attribute attribute(int index)
			 * Attribute attribute(String name)
			 * 获取当前标签中的属性
			 * 
			 * Attribute的每一个实例用于表示标签的一个属性
			 */
			Attribute attr = each.attribute("id");
			int id = Integer.parseInt(attr.getValue());
			System.out.print(id+"\t"+name+"\t"+gender+"\t"+age+"\t"+salary);
			System.out.println();
			
			Emp emp = new Emp(id, name, age, gender, salary);
			empList.add(emp);
		}
		
		System.out.println("解析完毕！");
		System.out.println("得到了"+empList.size()+"个员工信息");
		for(Emp emp1 : empList){
			System.out.println(emp1);
		}
	
			
		
		
		
		
		
		
	}//main
	
}






