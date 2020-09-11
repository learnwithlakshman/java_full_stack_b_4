package com.careerit.cj.day20;

public class Student {

		private String name;
		private String batch;
		private String ccStatus;
		private String pStatus;
		private String qualification;
		private double score;
		public Student() {
		}
		public Student(String name, String batch, String ccStatus, String pStatus, String qualification, double score) {
			this.name = name;
			this.batch = batch;
			this.ccStatus = ccStatus;
			this.pStatus = pStatus;
			this.qualification = qualification;
			this.score = score;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBatch() {
			return batch;
		}
		public void setBatch(String batch) {
			this.batch = batch;
		}
		public String getCcStatus() {
			return ccStatus;
		}
		public void setCcStatus(String ccStatus) {
			this.ccStatus = ccStatus;
		}
		public String getpStatus() {
			return pStatus;
		}
		public void setpStatus(String pStatus) {
			this.pStatus = pStatus;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public double getScore() {
			return score;
		}
		public void setScore(double score) {
			this.score = score;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", batch=" + batch + ", ccStatus=" + ccStatus + ", pStatus=" + pStatus
					+ ", qualification=" + qualification + ", score=" + score + "]";
		}
		
		
}
