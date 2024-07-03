package com.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class ProjectApp {
	JFrame frame;
	JSplitPane split;
	JDesktopPane desktop;

	public ProjectApp() {
		frame = new JFrame("Project Application");
		split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, 
				leftButtonPanel(), rightDesktopPanel());
		frame.add(split);

		frame.setBounds(150, 120, 1000, 600);
		frame.setIconImage(new ImageIcon("title.png").getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private JPanel leftButtonPanel() {
		JPanel pnl = new JPanel(new GridLayout(10,1));
		JButton btnStudent = new JButton("Student");
		JButton btnSemester = new JButton("Semester");
		JButton btnCourse = new JButton("Course");
		JButton btnCollege = new JButton("College");
		btnStudent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JInternalFrame iframe = new JInternalFrame("Student Information");
				iframe.setClosable(true);
				iframe.setMaximizable(true);
				iframe.setResizable(true);
				iframe.setBounds(25, 25, 350, 250);
				desktop.add(iframe);
				iframe.setVisible(true);
			}
		});
		pnl.add(btnStudent);
		pnl.add(btnSemester);
		pnl.add(btnCourse);
		pnl.add(btnCollege);
		return pnl;
	}

	private JDesktopPane rightDesktopPanel() {
		desktop = new JDesktopPane();
		return desktop;
	}
	
	public static void main(String[] args) {
		new ProjectApp();
	}

}
