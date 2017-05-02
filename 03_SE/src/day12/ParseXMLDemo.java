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
 * ʹ��dom����xml�ĵ�
 * @author sss
 *
 */
public class ParseXMLDemo {

	public static void main(String[] args) 
			throws FileNotFoundException, DocumentException {
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
		Document doc = reader.read(new FileInputStream("emplist.xml"));
		
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
		
		/**
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
	
			
		
		
		
		
		
		
	}//main
	
}






