package arraylist;

import java.util.ArrayList;

public class Student {
	//Student �� ��� ����
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;	//Arraylist ����
	//������
	public Student(int studentID, String studentName) {
		this.studentID=studentID;
		this.studentName=studentName;
		subjectList=new ArrayList<Subject>();	//Arraylist �����ϱ�
	}
	//�л��� �����ϴ� ������ subjectlist �迭�� �ϳ��� �߰��ϴ� �޼���
	public void addSubject(String name, int score) {
		Subject subject=new Subject();	//Subject ����
		subject.setName(name);			//���� �̸� �߰�
		subject.setScorePoint(score);	//���� �߰��ϱ�
		subjectList.add(subject);		//�迭�� �����ϱ�
	}
	
	public void shoeStudentInfo() {
		int total=0;
		//�迭 ��� �� ���
		for (Subject s : subjectList) {
			total+=s.getScorePoint();	//���� ���ϱ�
			System.out.println("�л�"+studentName+"��"+s.getName()+"���� ������"+s.getScorePoint()+"�Դϴ�.");
		}
		System.out.println("�л�"+studentName+"�� ������"+total+"�Դϴ�.");
	}
}
