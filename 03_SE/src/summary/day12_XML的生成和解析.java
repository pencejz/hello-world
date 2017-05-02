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
 * �������dom4j	֧��xml�����ɺͽ���
 * 		  jaxen ֧����Document������ʹ��xpath
 */
public class day12_XML�����ɺͽ��� {

	public static void main(String[] args) throws IOException, DocumentException {
		
		//ʹ��DOM����xml�ĵ�
//		writeXML();
		
		//ʹ��dom����xml�ĵ�
//		parseXML();
		
		//ʹ��xpath����xml����
		useXpath();
		
	}
	
	//ʹ��DOM����xml�ĵ�
	public static void writeXML() throws IOException{
		/**
		 * ����xml�ĵ����裺
		 * 1.����Document���󣬱�ʾxml�ĵ�
		 * 2.��Document���������Ԫ��
		 * 3.����Ԥ���ĸ�ʽ���Ԫ���������Ԫ�������γɼȶ���ʽ
		 * 4.����XmlWriter
		 * 5.ͨ��XMLWriterд��Document
		 */
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1, "����", 25, "��", 4000));
		empList.add(new Emp(2, "����", 26, "Ů", 5000));
		empList.add(new Emp(3, "����", 27, "��", 6000));
		empList.add(new Emp(4, "����", 28, "Ů", 7000));
		empList.add(new Emp(5, "Ǯ��", 29, "��", 8000));
		
		//��һ��
		Document doc = DocumentHelper.createDocument();
		/*
		 * �ڶ���
		 * Doucument�ṩ����Ӹ�Ԫ�صķ�����
		 * Element addElement(String name)
		 * ��ָ���ĵ������ָ�����ֵĸ�Ԫ�أ�����Element��ʵ����ʽ���䷵�أ��Ա�������Ԫ��������������
		 * ��Ҫע����ǣ��÷���ֻ�ܵ���һ�Ρ���Ϊһ��xml�ĵ�ֻ����һ����Ԫ��
		 */
		Element root = doc.addElement("list");
		//������
		for(Emp emp : empList){
			/*
			 * ��ÿһ��empʵ����ʾ��Ա����Ϣ��һ��<emp>��ǩ��ʽ����xml�ĵ�
			 * 
			 * Element�ṩ�˷���:
			 * Element addElement(String name)
			 * ��ǰ��ǩ����Ӹ������ֵ��ӱ�ǩ������Elementʵ����ʾ�ͷ���
			 */
			Element empEle = root.addElement("emp");
			//���name
			Element nameEle = empEle.addElement("name");
			/*
			 * Element�ṩ�˷�����
			 * Element addText(String text)
			 * ��ǰ��ǩ�����ָ�����ı���Ϣ
			 */
			nameEle.addText(emp.getName());
			//���age
			Element ageEle = empEle.addElement("age");
			ageEle.addText(emp.getAge()+"");
			//���gender
			Element genderEle = empEle.addElement("gender");
			genderEle.addText(emp.getGender());
			//��ӹ���
			Element salaryEle = empEle.addElement("salary");
			salaryEle.addText(emp.getSalary()+"");
			
			/*
			 * Element�ṩ��������Եķ�����
			 * Element addAttribute(String name, String value)
			 */
			empEle.addAttribute("id", emp.getId()+"");
			
		}
		//���Ĳ�
		XMLWriter writer = new XMLWriter(OutputFormat.createPrettyPrint());
		writer.setOutputStream(new FileOutputStream("myemp.xml"));
		//���岽
		writer.write(doc);
		System.out.println("д����ϣ�");
		writer.close();
		
	}
	
	//ʹ��dom����xml�ĵ�
	public static void parseXML() throws FileNotFoundException, DocumentException{
		/**
		 * ʹ��dom����xml�ĵ��Ĳ��裺
		 * 1.����SAXReader
		 * 2.ʹ��SAXReader��ȡ������xml�ĵ�������᷵��һ��Document�Ķ��󣬸ö��󼴱�ʾ������xml�ĵ�����
		 *   ��һ������dom��ʱ���ʵĵط��ˣ���Ϊ�Ὣxml�ĵ�ȫ����ȡ�겢�����ڴ�
		 * 3.ͨ��Document��ȡ��Ԫ��
		 * 4.�����ĵ��ṹ�Ӹ�Ԫ�ؿ�ʼ�𼶻�ȡ��Ԫ�أ��Ѵﵽ����xml�ĵ����ݵ�Ŀ��
		 */
		//��һ��
		SAXReader reader = new SAXReader();
		//�ڶ���
		Document doc = reader.read(new FileInputStream("myemp.xml"));
		
		/**
		 * ������ ��ȡ��Ԫ��
		 * Document�ṩ�˻�ȡ��Ԫ�صķ�����
		 * Element getRootElement()
		 * 
		 * Element
		 * ÿһ��Elementʵ������ʾxml�ĵ��е�һ��Ԫ�أ�����
		 * һ�Ա�ǩͨ��Elementʵ�������Ի�ȡ��ʵ����ʾ�ı�ǩ�е������Ϣ
		 * ����ñ�ǩ�����ֱ�ǩ�����ԣ��Լ��ñ�ǩ�����������ӱ�ǩ
		 */
		Element root = doc.getRootElement();
		/*
		 * String getName() ��ñ�ǩ��
		 */
		System.out.println("����ǩ��Ϊ��"+root.getName());
		
		/*
		 * ���Ĳ�
		 * ����xml�ĵ����ݣ���ȡ���б��������Ա����Ϣ
		 * ÿ��Ա�����������ʹ��Emp��һ��ʵ������
		 */
		//�ü������������������������Ա����Ϣ
		List<Emp> empList = new ArrayList<Emp>();
		
		/**
		 * Element�ṩ�˻�ȡ�ӱ�ǩ����ط��������õ��У�
		 * 
		 * Element element(String name)	��ȡ��ǰ��ǩ��ָ�����ֵ��ӱ�ǩ�����ӱ�ǩ����û���ظ���ʱ���ã�
		 * 
		 * List elements()	��ȡ��ǰ���ǩ�������ӱ�ǩ�����صļ����������ɵ�Elementʵ����ÿһ��ʵ����ʾ����һ���ӱ�ǩ
		 * 
		 * List elements(String name)	��ȡ��ǰ��ǩ��ָ�����ֵ������ӱ�ǩ�����ӱ�ǩ�������ظ���ʱ��ʹ�ã�
		 * 
		 * String getText()	��ȡ��ǰ��ǩ�е��ı�
		 * 
		 * String getTextTrim()	�ڻ�ȡ�˱�ǩ�е��ı�֮�󣬻���ȥ�����ַ������˵Ŀհ�
		 */
		//��ȡ����ǩ�е������ӱ�ǩ
		List<Element> list = root.elements();
		//���������ӱ�ǩ��ÿһ������һ��emp��ǩ
		for(Element each : list){
			//��ȡname��ֵ
			Element nameEle = each.element("name"); //��ȡ<name>��ǩ
			String name = nameEle.getText(); //��ȡ��ǩ�е��ı�
			//��ȡageֵ
			int age = Integer.parseInt(each.elementText("age"));
			//��ȡgender
			String gender = each.elementText("gender");
			//��ȡsalary
			int salary = Integer.parseInt(each.elementText("salary"));
			
			/**
			 * Attribute attribute(int index)
			 * Attribute attribute(String name)
			 * ��ȡ��ǰ��ǩ�е�����
			 * 
			 * Attribute��ÿһ��ʵ�����ڱ�ʾ��ǩ��һ������
			 */
			Attribute attr = each.attribute("id");
			int id = Integer.parseInt(attr.getValue());
			System.out.print(id+"\t"+name+"\t"+gender+"\t"+age+"\t"+salary);
			System.out.println();
			
			Emp emp = new Emp(id, name, age, gender, salary);
			empList.add(emp);
		}
		
		System.out.println("������ϣ�");
		System.out.println("�õ���"+empList.size()+"��Ա����Ϣ");
		for(Emp emp1 : empList){
			System.out.println(emp1);
		}
		
		
	}
	
	//ʹ��xpath����xml����
	public static void useXpath(){
		
		try {
			
			SAXReader reader = new SAXReader();
			Document doc = reader.read(new FileInputStream("myemp.xml"));
			String xpath = "/list/emp[name ='����']/gender";
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