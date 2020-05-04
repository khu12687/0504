/*
java SE에서 GUI는 AWT/Swing 으로 지원
모든 GUI 프로그래밍에서 반드시 기본적으로 존재해야하는 객체는 바로 윈도우이다!!
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
		/*sun 에서 제공하는 클래스 파일의 위치는?
			자바설치 경로에 rt.jar
		*/
		Frame frame; //선언만 했지, 인스턴스 생성은 하지도 않음

		//추상클래스와 인터페이스만 아니라면, 생성할때 new 할 수 있다.
		frame = new Frame(); //원도우 생성함!!
		frame.setSize(300,400);
		//윈도우는 디폴트상태가 않보이기임!!
		//보일지 여부를 결정하는 메서드를 호출해야함!!
		frame.setVisible(true);

	

		//대왕버튼이 생성된 이유는??
		//html 문서처럼, 컴퍼넌트 요소를 윈도우에 부착할때는 위치를 지정해야하고,
		//자바언어에서는 이 위치를 결정짓는 클래스가 지원됨
		//우리는 버튼에 대한 위치를 아무것도 지정하지 않았기 떄문에
		//디폴트 배치관리자가 적용되어 대왕버튼이 출현함!!
		//여러 배치관리자 중 FlowLayout 이라는 객체를 이용해본다
		//마치 안드로이드의 LinearLayout과 상당히 유사!!
		//컴포넌트들을 윈도우의 크기에 따라 일렬로 정렬시킴!!
		FlowLayout flowLayout = new FlowLayout();

		//frame 이라는 윈도우에 생성된 레이아웃을 적용
		frame.setLayout(flowLayout); //frame에 플로우 배치적용

		for(int i=1; i<=5; i++){
			//html에 지원하는 버튼, 텍스트박스,체크박스,라디오박스, select, textarea 등등
			//보다 많은 컴포넌트를 지원!!
			Button bt = new Button("버튼"+i);
			//DOM과 유사하게 생성된 버튼은 컨테이너에 부착해야 함!!
			//따라서 윈도우에 버튼을 부착하자!!
			frame.add(bt);
		}

		//텍스트박스!! TextField
		int n=7;
		TextField t1 = new TextField(n); //n자 크기의 박스 생성
		//n이 갖는의미?? 테어날때 너비를 결정짓는 것이다!! html의 <input type = "test" size = 7>과같다
		frame.add(t1);

		//checkbox 3개 나오게 처리!!
		//낚시, 영화, 음악감상

		Checkbox ch1 = new Checkbox("낚시",false);
		Checkbox ch2 = new Checkbox("영화",true);
		Checkbox ch3 = new Checkbox("음악감상",false);

		frame.add(ch1);
		frame.add(ch2);
		frame.add(ch3);

		//html에서의 select 는 자바에서 choice 컴포넌트라 함!!
		Choice ch = new Choice();
		ch.add("사과"); //option 테그와 비슷
		ch.add("딸기");
		ch.add("바나나");
		ch.add("오랜지");
		//윈도우에 부착!!
		frame.add(ch);

		//멀티라인 텍스트 필드인 TextArea
		TextArea area =  new TextArea(5, 40);
		frame.add(area);
		
		
		//html에서 radio를 배열로 만든것과 동일하게, 자바에서는
		//체크박스를 그룹으로 묶어야한다!!
		CheckboxGroup group = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("남",group,false);
		Checkbox cb2 = new Checkbox("여",group,true);

		frame.add(cb1);
		frame.add(cb2);
	
		//이미지 처리는 html 처럼 단순하지가 않다!!
		//이미지는 바로 사용불가, 툴킷이라는 클래스에 의존한다!!
		//툴킷은 추상클래스이미르, 인스턴스 메서드를 사용 할 수 없다
		//why? new가 불가능하니깐 그래서 sun에서는 인스턴스를 얻는 방법을 static으로 제공함

		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("C:/web_app_DB/java_workspace/project0504/res/mario.png");

		System.out.println(img);
	}
}
