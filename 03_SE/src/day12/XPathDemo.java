package day12;

import java.io.FileInputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * ʹ��xpath����xml����
 * ��ϣ����doc������ʹ��xpath����Ҫ����һ��jar����jaxen
 * @author sss
 *
 */
public class XPathDemo {

	public static void main(String[] args) {
	
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
		
		
	}//main
		
}














