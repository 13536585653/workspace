import java.util.Scanner;

public class wz2 {
	public static void main(String[] asd){
		wz2 t=new wz2();
		t.C();
		
	}

public void C(){
	try{
	final String cmd="wmic /namespace:\\\\root\\WMT path MSAcpi_ThermalZoneTemperature get CurrentTemperature";
	Process p= Runtime.getRuntime().exec(cmd); p.getOutputStream().close();
	//��䲻д�Ͳ�ִ��
	Scanner sc=new Scanner(p.getInputStream());
	sc.next();
	float t=(sc.nextInt()-2732f)/10f;
	sc.close();
	System.out.println("��ǰCPU�¶ȣ�"+t);
	p.waitFor();
	} catch (Exception e)
	{
		e.printStackTrace();
		}
}
}

