package summary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * 导入包：dom4j	支持xml的生成和解析
 * 		  jaxen 支持在Document解析中使用xpath
 */
public class day12_XML的生成和解析 {

	public static void main(String[] args) throws IOException, DocumentException {
		
		//使用DOM生成xml文档
//		writeXML();
		
		//使用dom解析xml文档
//		parseXML();
		
		//使用xpath检索xml数据
		useXpath();
		
	}
	
	//使用DOM生成xml文档
	public static void writeXML() throws IOException{
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
		
	}
	
	//使用dom解析xml文档
	public static void parseXML() throws FileNotFoundException, DocumentException{
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
		Document doc = reader.read(new FileInputStream("myemp.xml"));
		
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
		
		/*
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
		
		
	}
	
	//使用xpath检索xml数据
	public static void useXpath(){
		
		try {
			
			SAXReader reader = new SAXReader();
			Document doc = reader.read(new FileInputStream("myemp.xml"));
			String xpath = "/list/emp[name ='王五']/gender";
			List<Element> list = doc.selectNodes(xpath);
			for(Element e : list){
				System.out.println(e.getText());
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}
	

}



class Emp {

	private int id;
	private String name;
	private int age;
	private String gender;
	private int salary;
	
	public Emp(){	}
	public Emp(int id, String name, int age, String gender, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return id+", "+name+", "+age+", "+gender+", "+salary;
	}
}