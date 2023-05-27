package JavaBasics;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

public class Property  {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
FileInputStream fis=new  FileInputStream("D:\\acceleration\\workspace\\Practice_Interview\\propoerty file\\abc.properties");
	
	Properties prop =new Properties();
	prop.load(fis);
	prop.setProperty("455", "ksjjhahdhsaa788");
	System.out.println(prop.getProperty("455"));
	System.out.println(prop.getProperty("hsjahsj", " jjjjjj"));
	System.out.println(prop.keySet());
	prop.forEach((k,v) -> System.out.println("key:"+k+",value:"+v)); 
	}}
