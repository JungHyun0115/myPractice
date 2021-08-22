package polymorphism;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��..");
	}

	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ó��...");
	}

	public SamsungTV() {
		System.out.println("===> SamsungTV(1) ��ü ����");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) ��ü ����");
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
