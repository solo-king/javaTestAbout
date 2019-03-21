import java.util.concurrent.atomic.AtomicInteger;

public class TestMain{

	
	public static void main(String[] args){
		
		String cmd = "interface";
		StringBuilder cmd1 = new StringBuilder("interface");
		AtomicInteger number = new AtomicInteger(0);
		StringBuilder rawBuilder = new StringBuilder();
		System.out.println(cmd.indexOf('\0')+"");
		System.out.println(cmd.indexOf(' ')+"");
		System.out.println(number.incrementAndGet());
		System.out.println(rawBuilder.append(number).append(' ').append(cmd));
		appendEscaped( cmd1, cmd1);
		System.out.println(cmd1);
		
	}
	
	public static void appendEscaped(StringBuilder cmd, StringBuilder append){
		cmd.append(append);
	}

}
