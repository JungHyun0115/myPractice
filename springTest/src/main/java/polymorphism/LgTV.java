package polymorphism;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component("tv")
public class LgTV implements TV{
	
	@Resource(name="apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV ��ü ������");
	}
	public void powerOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("LgTV---���� ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
