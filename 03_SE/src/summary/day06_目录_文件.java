package summary;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;

public class day06_Ŀ¼_�ļ� {

	public static void main(String[] args) throws IOException {
		
		/**
		 * java.io.File Ŀ¼���ļ���
		 * 1.�����ÿһ��ʵ�����ڱ�ʾ��ǰ����ϵͳ���ļ�ϵͳ���һ���ļ������ļ�Ŀ¼������Ӳ���ϵ�һ���ļ�����Ŀ¼
		 * 2.ʹ��File���ԣ������ļ���Ŀ¼��������Ϣ�����ļ����֡��ļ���С��
		 * 				�����ļ�����Ŀ¼���紴���ļ���ɾ���ļ���
		 * 				����Ŀ¼������Ŀ��Ŀ¼���ļ��������ǲ����Է����ļ�����
		 * 3.ʹ��·��ʱ�����ʹ�����·�������������·��������ϵͳ���죬�����Ͳ����ڿ�ƽ̨
		 * 4.Ŀ¼�ָ��(\-windows,/-linux)Ӧ��ʹ��File��ĳ���separator��
		 *   File���еĳ���separator��ʾ�ָ������Windows�б�ʾΪ\��ͬʱҲ֧��/����linux�б�ʾΪ/
		 * 
		 * void createNewFile() �����ļ�
		 * void mkdir() ��������Ŀ¼
		 * void mkdirs() �����༶Ŀ¼
		 * String getName() ��ȡ�ļ���
		 * long length() ��ȡ�ļ���С
		 * long lastModified() ��ȡ����޸�ʱ�䣨����ֵ��
		 * void delete() ɾ��Ŀ¼/�ļ�
		 * void deleteOnExit() �˳���ɾ��
		 * File[] listFiles() ��ȡ��ǰĿ¼������Ŀ¼���ļ���������ɵ�����
		 * 
		 * boolean exists()	�ж��Ƿ��Ѿ�����
		 * boolean isFile() �ж��Ƿ����ļ�
		 * boolean idDirectory() �ж��Ƿ���Ŀ¼
		 * boolean canRead() �ж��Ƿ�ɶ�
		 * boolean canWrite() �ж��Ƿ��д
		 * boolean isHidden() �ж��Ƿ��������ļ�
		 */
		
		//�ļ�����
		File file = new File("."+File.separator+"demo.txt");	//����Ŀ¼���ļ�����
		if(!file.exists()){						//�ж��ļ��Ƿ����
			try {
				file.createNewFile();			//�����ļ�
			} catch (IOException e) {
				System.out.println("�ļ�����ʧ��");
				e.printStackTrace();
			}
			System.out.println("�ļ�������ϣ�");
		}else{
			System.out.println("�ļ��Ѿ����ڣ�");
		}
		String name = file.getName();			//��ȡ�ļ���
		System.out.println("�ļ�����"+name);
		long length = file.length();			//��ȡ�ļ���С
		System.out.println("�ļ���С��"+length);
		boolean isFile = file.isFile();			//�жϵ�ǰFile�����ʾ���Ƿ����ļ�
		System.out.println("���ļ��� "+isFile);
		boolean isDir = file.isDirectory();		//�Ƿ�ΪĿ¼
		System.out.println("��Ŀ¼��"+isDir);
		boolean canRead = file.canRead();		//�Ƿ�ɶ�
		System.out.println("�ɶ���"+canRead);
		boolean canWrite = file.canWrite();		//�Ƿ��д
		System.out.println("��д��"+canWrite);
		boolean isHidden = file.isHidden();		//�Ƿ��������ļ�
		System.out.println("�����ļ���"+isHidden);
		long time = file.lastModified();		//����޸�ʱ��(������)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		String str = sdf.format(time);
		System.out.println(str);
		file.delete();
		System.out.println("�ļ��Ѿ�ɾ��");
		
		//Ŀ¼����
		File dir = new File("demo");
		if(!dir.exists()){
			dir.mkdir();						//��������Ŀ¼
			System.out.println("Ŀ¼������ϣ�");
		}else{
			System.out.println("��Ŀ¼�Ѵ��ڣ�");
		}
		File dir1 = new File("a/b/c/d/e/f");
		if(!dir1.exists()){
			dir1.mkdirs();						//�����༶Ŀ¼
			System.out.println("Ŀ¼������ϣ�");
		}else{
			System.out.println("��Ŀ¼�Ѿ����ڣ�");
		}
		//�ݹ�ɾ���༶Ŀ¼��ͨ��dir1�����༶Ŀ¼֮�󣬵�ǰĿ¼����Ϊf���ʴ˴�ɾ��Ŀ¼aʱ����Ҫ����ѡ��a��
		File dir2 = new File("a");
		delete(dir2);
		//�ļ���������ʹ��
		fileFilter();
		
		
		/**
		 * java.io.RandomAccessFile		ר��������д�ļ�����(�����ָ����ļ����ݽ��ж�д����)
		 * 
		 * "raf.dat"---��һ������Ϊ�ļ��������û�У���ᴴ�����ļ�
		 * RandomAccessFile����������ģʽ��
		 * r:ֻ��
		 * rw���ɶ���д
		 * 
		 * void write(int d)			дһ���ֽڣ�д�����ָ����intֵ����Ӧ�ĵ�2���ƵĵͰ�λ
		 * void writeInt(int d)	 		һ����д��һ��intֵ��������д��4���ֽڣ�����������intֵ��Ӧ��2����д�뵽�ļ���
		 * void writeLongt(long d)		һ����д��һ��longֵ
		 * void writeDouble(double d)	һ����д��һ��doubleֵ
		 * int read()					��ȡһ���ֽڣ�����int��ʽ����(������ֵΪ-1��˵���Զ����ļ�ĩβ)
		 * int read(byte[] d)			 ���Զ�ȡ�������ֽ����ܳ��ȵ��ֽ����������뵽�������У�����ֵΪʵ�ʶ�ȡ�����ֽ���
		 * 								������ֵΪ-1���ͱ�ʾ��ȡ�����ļ�ĩβ(��һ��û�ж�ȡ���ļ�)
		 * void write(byte[] d)			���������ֽ����������е��ֽ���һ����д�뵽�ļ���
		 * void write(byte[] d,int start,int len)	���������ֽ������д��±�Ϊstart����ʼ������len���ֽ�д��
		 * 
		 * long getFilePointer()		��õ�ǰRAFָ���λ��
		 * void seek(long pos)			����ָ��λ��
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		raf.write(255);
		System.out.println("д����ϣ�");
		
		int a = raf.read();
		System.out.println(a);
		a = raf.read();
		System.out.println(a);
		
		//�����ֽڶ�д
		oneBite();
		
		//������д
		batchBites();
		
		/*
		 * RandomAccessFile�ṩ�˷����д�����������͵ķ���
		 * �Լ�ָ��Ĳ�����ͨ���ò������Է���Ķ�д�ļ�������λ��
		 */
		randomAccessFileDemo();
		
		raf.close();
		
	}
	
	//��������File��ʾ���ļ���Ŀ¼ɾ���ķ���
	public static void delete(File dir){
		
		if(dir.isDirectory()){				//�ж�dir�Ƿ�ΪĿ¼,�����ļ���ֱ��ɾ��
			
			File[] subs = dir.listFiles();	//��ȡdirĿ¼������Ŀ¼���ļ������ֵ�����
			for(File sub : subs){			//����dirĿ¼������ȡdirĿ¼���������ݵ�����
				delete(sub);				//�ݹ����(��Ŀ¼Ϊ��ʱ����Ϊ����)
			}
			
			dir.delete();					//ɾ��Ŀ¼
			System.out.println("ɾ��Ŀ¼��"+dir);
			
		}else{
			dir.delete();					//ɾ���ļ�
			System.out.println("ɾ���ļ���"+dir);
		}
		
	}
	
	//ʹ���ļ�����������ȡһ��Ŀ¼�����������Ĳ�������
	public static void fileFilter(){
		File dir = new File(".");
		//ʹ��һ�Σ��Ͳ��������ڲ���
		FileFilter filter = new FileFilter(){
			//��ӹ��������ķ���
			@Override
			public boolean accept(File file) {
				//����---���ļ�����
//				return file.isFile(); 
				//��.��ͷ������
				return file.getName().startsWith(".");
			}
		};
		//������������---��ȡ����������������
		File[] subs = dir.listFiles(filter);
		for(File sub : subs){
			System.out.println(sub.getName());
		}
	}
	
	//�����ֽڶ�дʵ���ļ����ƣ��ȶ�ȡ��д�룩
	public static void oneBite() throws IOException{
		//Ŀ���ļ�
		RandomAccessFile raf = new RandomAccessFile("��������.gif", "r");
		//Դ�ļ�
		RandomAccessFile raf1 = new RandomAccessFile("�������˸��ư�.gif", "rw");
		
		int d = -1;
		long starts = System.currentTimeMillis();
		while((d=raf.read()) != -1){
			raf1.write(d);
			System.out.print(d);
		}
		long ends = System.currentTimeMillis();
		System.out.println("������ϣ���ʱ��"+(ends-starts)+"����");
		raf.close();
		raf1.close();
	}
	
	//�����ֽڶ�дʵ���ļ����ƣ�����Ҫ��дЧ�ʣ���Ҫ���ÿ�ζ�д�����������Ӷ����ٶ�д�������ﵽ��
	public static void batchBites() throws IOException{
		//Ŀ���ļ�
		RandomAccessFile raf = new RandomAccessFile("��������.gif", "r");
		//Դ�ļ�
		RandomAccessFile raf1 = new RandomAccessFile("�������˸��ư�.gif", "rw");
		
		byte[] buf = new byte[1024*10]; //10k
		int len = -1;
		long start = System.currentTimeMillis();
		while((len=raf.read(buf))!=-1){
			raf1.write(buf,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("������ϣ���ʱ��"+(end-start)+"ms");
		raf.close();
		raf1.close();
	}
	
	//RandomAccessFile�ṩ�˷����д�����������͵ķ����Լ�ָ��Ĳ�����ͨ���ò������Է���Ķ�д�ļ�������λ��
	public static void randomAccessFileDemo() throws IOException{
		
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		
		long pos = raf.getFilePointer();
		System.out.println("pos = "+pos);
		
		//��һ��int���ֵд���ļ�
//		int max = Integer.MAX_VALUE;
		/*
		 *                              vvvvvvvv
		 * 01111111 111111111 111111111 11111111
		 * 
		 * raf.write(max>>>24);
		 * raf.write(max>>>16);
		 * raf.write(max>>>8);
		 * raf.write(max);
		 */
		/**
		 * void write(int d)
		 * һ��д��һ���ֽڣ���������intֵ��Ӧ��2����д�뵽�ļ��У�����Ϊ�ַ���2����
		 * ��raf.write(97);---���ֵΪ��a
		 * 
		 * void writeInt(int d)
		 * һ����д���ĸ��ֽڣ���������intֵ��Ӧ��2����д�뵽�ļ���
		 * ��raf.writeInt(97);---���ֵΪ��97
		 */
		raf.writeInt(Integer.MAX_VALUE);
		System.out.println("pos = "+raf.getFilePointer());
		//д��һ��longֵ
		raf.writeLong(1234L);
		System.out.println("pos = "+raf.getFilePointer());
		//д��һ��doubleֵ
		raf.writeDouble(123.123);
		System.out.println("pos = "+raf.getFilePointer());
		/**
		 * void seek(long pos)
		 * ��ָ���ƶ����ļ���ʼ��
		 */
		//��ָ���Ƶ��ļ���ʼ��
		raf.seek(0);
		/**
		 * ��ȡintֵ
		 * ����4���ֽڣ�����Ӧ��intֵ����
		 */
		int i = raf.readInt();
		System.out.println("max = "+i);
		
		long l = raf.readLong();
		System.out.println("l = "+l);
		
		double d = raf.readDouble();
		System.out.println("d = "+d);
		/*
		 * 2147483647 123L     123.123
		 * [int]      [long]   [double]
		 * 0123       45678901 23456789 �ֽ���
		 */
		raf.seek(4);
		long l1 = raf.readLong();
		System.out.println("l1 = "+l1);
		
		System.out.println("д����ϣ�");
		raf.close();
	}
}







