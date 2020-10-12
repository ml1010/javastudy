
package sample_project;

import javax.swing.*;

public class GUI_Ex extends JFrame{
	public GUI_Ex() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300);
		setVisiable(true);
		
	}
	
	public static void main(String[] args) {
		GUI_Ex frame = new GUI_Ex();
	}

}
