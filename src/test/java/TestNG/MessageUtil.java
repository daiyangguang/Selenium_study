package TestNG;
/**
 * 	在控制台打印输出信息
 * @author Administrator
 *
 */
public class MessageUtil {
	
	private String message;
	/**
	 * 需要打印的信息
	 * @param message
	 */
	public MessageUtil(String message) {
		this.message = message;
	}
	//打印信息
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	//给打印信息加个hi
	public String salutationMessage() {
		message = "hi" + message;
		System.out.println(message);
		return message;
	}
	
	
	
	
}
