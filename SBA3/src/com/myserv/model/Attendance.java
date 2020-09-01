package com.myserv.model;

import java.util.Date;

public class Attendance {
	private int studId;
	private String studName;
	private Date ADate;
	private int semester;
	private  String attendance;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public Date getADate() {
		return ADate;
	}
	public void setADate(Date aDate) {
		ADate = aDate;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getAttendance() {
		return attendance;
	}
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	public Attendance() {
		// TODO Auto-generated constructor stub
	}
	public Attendance(int studId, String studName, Date aDate, int semester, String attendance) {
		super();
		this.studId = studId;
		this.studName = studName;
		ADate = aDate;
		this.semester = semester;
		this.attendance = attendance;
	}
	@Override
	public String toString() {
		return "Attendance [studId=" + studId + ", studName=" + studName + ", ADate=" + ADate + ", semester=" + semester
				+ ", attendance=" + attendance + "]";
	}
}