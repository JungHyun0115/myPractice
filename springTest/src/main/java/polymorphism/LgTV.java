package polymorphism;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component("tv")
public class LgTV implements TV{
	
	@Resource(name="apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV °´Ã¼ »ý¼ºµÊ");
	}
	public void powerOn() {
		System.out.println("LgTV---Àü¿ø ÄÒ´Ù.");
	}
	public void powerOff() {
		System.out.println("LgTV---Àü¿ø ²ö´Ù.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
