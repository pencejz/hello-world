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
 * ʹ��DOM����xml�ĵ�
 * @author sss
 *
 */
public class WriteXMLDemo {

	public static void main(String[] args) throws IOException {
		
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
		
		
		
	}//main
	
}













