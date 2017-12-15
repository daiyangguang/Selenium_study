package dada;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFileUtil {
	private Properties prop;
	private String filePath;
	public ReadFileUtil(String filePath) throws IOException {
		this.filePath = filePath;
		this.prop = readProperties();
	}
	//读取本地文件
	private Properties readProperties() throws IOException {
		//创建一个文件输入流
		Properties prop = new Properties();
		try {
			InputStream inputStream = new FileInputStream(filePath);
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
			prop.load(bufferedInputStream);	
		} catch (Exception e) {
			System.out.println(e);
		}		
		return prop;
	}
	
	//从本地文件读取信息
	public String getPro(String key) {
		String result = "";
		if (prop.containsKey(key)) {
			String userName = prop.getProperty(key);
			result = userName;
		}
		else {
			System.out.println("您获取的key不对");
			result = "";
		}
		return result;
	}
}
