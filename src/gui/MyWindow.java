/*
java SE���� GUI�� AWT/Swing ���� ����
��� GUI ���α׷��ֿ��� �ݵ�� �⺻������ �����ؾ��ϴ� ��ü�� �ٷ� �������̴�!!
*/
package gui;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.TextArea;
import java.awt.CheckboxGroup;
import java.awt.Toolkit;
import java.awt.Image;
public class MyWindow{

	public static void main(String[] args){
		/*sun ���� �����ϴ� Ŭ���� ������ ��ġ��?
			�ڹټ�ġ ��ο� rt.jar
		*/
		Frame frame; //���� ����, �ν��Ͻ� ������ ������ ����

		//�߻�Ŭ������ �������̽��� �ƴ϶��, �����Ҷ� new �� �� �ִ�.
		frame = new Frame(); //������ ������!!
		frame.setSize(300,400);
		//������� ����Ʈ���°� �ʺ��̱���!!
		//������ ���θ� �����ϴ� �޼��带 ȣ���ؾ���!!
		frame.setVisible(true);

	

		//��չ�ư�� ������ ������??
		//html ����ó��, ���۳�Ʈ ��Ҹ� �����쿡 �����Ҷ��� ��ġ�� �����ؾ��ϰ�,
		//�ڹپ����� �� ��ġ�� �������� Ŭ������ ������
		//�츮�� ��ư�� ���� ��ġ�� �ƹ��͵� �������� �ʾұ� ������
		//����Ʈ ��ġ�����ڰ� ����Ǿ� ��չ�ư�� ������!!
		//���� ��ġ������ �� FlowLayout �̶�� ��ü�� �̿��غ���
		//��ġ �ȵ���̵��� LinearLayout�� ����� ����!!
		//������Ʈ���� �������� ũ�⿡ ���� �Ϸķ� ���Ľ�Ŵ!!
		FlowLayout flowLayout = new FlowLayout();

		//frame �̶�� �����쿡 ������ ���̾ƿ��� ����
		frame.setLayout(flowLayout); //frame�� �÷ο� ��ġ����

		for(int i=1; i<=5; i++){
			//html�� �����ϴ� ��ư, �ؽ�Ʈ�ڽ�,üũ�ڽ�,�����ڽ�, select, textarea ���
			//���� ���� ������Ʈ�� ����!!
			Button bt = new Button("��ư"+i);
			//DOM�� �����ϰ� ������ ��ư�� �����̳ʿ� �����ؾ� ��!!
			//���� �����쿡 ��ư�� ��������!!
			frame.add(bt);
		}

		//�ؽ�Ʈ�ڽ�!! TextField
		int n=7;
		TextField t1 = new TextField(n); //n�� ũ���� �ڽ� ����
		//n�� �����ǹ�?? �׾�� �ʺ� �������� ���̴�!! html�� <input type = "test" size = 7>������
		frame.add(t1);

		//checkbox 3�� ������ ó��!!
		//����, ��ȭ, ���ǰ���

		Checkbox ch1 = new Checkbox("����",false);
		Checkbox ch2 = new Checkbox("��ȭ",true);
		Checkbox ch3 = new Checkbox("���ǰ���",false);

		frame.add(ch1);
		frame.add(ch2);
		frame.add(ch3);

		//html������ select �� �ڹٿ��� choice ������Ʈ�� ��!!
		Choice ch = new Choice();
		ch.add("���"); //option �ױ׿� ���
		ch.add("����");
		ch.add("�ٳ���");
		ch.add("������");
		//�����쿡 ����!!
		frame.add(ch);

		//��Ƽ���� �ؽ�Ʈ �ʵ��� TextArea
		TextArea area =  new TextArea(5, 40);
		frame.add(area);
		
		
		//html���� radio�� �迭�� ����Ͱ� �����ϰ�, �ڹٿ�����
		//üũ�ڽ��� �׷����� ������Ѵ�!!
		CheckboxGroup group = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("��",group,false);
		Checkbox cb2 = new Checkbox("��",group,true);

		frame.add(cb1);
		frame.add(cb2);
	
		//�̹��� ó���� html ó�� �ܼ������� �ʴ�!!
		//�̹����� �ٷ� ���Ұ�, ��Ŷ�̶�� Ŭ������ �����Ѵ�!!
		//��Ŷ�� �߻�Ŭ�����̸̹�, �ν��Ͻ� �޼��带 ��� �� �� ����
		//why? new�� �Ұ����ϴϱ� �׷��� sun������ �ν��Ͻ��� ��� ����� static���� ������

		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("C:/web_app_DB/java_workspace/project0504/res/mario.png");

		System.out.println(img);
	}
}
