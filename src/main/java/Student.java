

public class Student implements java.io.Serializable, Comparable<Student>{
	
	private String studentName;
	private String studentID;
	
	private int proj01;
	private int ict01;
	private int activeP01;
	
	private int marksICT01;
	
	private int codingAss;
	private int ict02;
	private int activeP02;
	
	private int marksICT02;
	
	private int ict03;
	private int activeP03;
	
	private int marksICT03;
	private double finalMarks;
	private String finalGrade;
	
	public Student(String studentName, String studentID, int proj01, int ict01,
			int activeP01, int codingAss, int ict02,
			int activeP02, int ict03, int activeP03) {
		super();
		this.studentName = studentName;
		this.studentID = studentID;
		this.proj01 = proj01;
		this.ict01 = ict01;
		this.activeP01 = activeP01;
		this.marksICT01 = (int)(proj01 * .3 + ict01 * .6 + activeP01 * .1);
		this.codingAss = codingAss;
		this.ict02 = ict02;
		this.activeP02 = activeP02;
		this.marksICT02 = (int)(codingAss * .5 + ict02 * .4 + activeP02 * .1);
		this.ict03 = ict03;
		this.activeP03 = activeP03;
		this.marksICT03 = (int)(ict03 * .9 + activeP03 * .1);
		this.finalMarks = marksICT01*.3 + marksICT02 * .35 + marksICT03 * .35;;
		this.finalGrade = "I dunno"; // You should write the logic to find out the grade
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getMarksICT01() {
		return marksICT01;
	}

	public int getMarksICT02() {
		return marksICT02;
	}
	public int getMarksICT03() {
		return marksICT03;
	}
	public double getFinalMarks() {
		return finalMarks;
	}
	public String getFinalGrade() {
		return finalGrade;
	}
	public int getProj01() {
		return proj01;
	}
	public void setProj01(int proj01) {
		this.proj01 = proj01;
	}
	public int getIct01() {
		return ict01;
	}
	public void setIct01(int ict01) {
		this.ict01 = ict01;
	}
	public int getActiveP01() {
		return activeP01;
	}
	public void setActiveP01(int activeP01) {
		this.activeP01 = activeP01;
	}
	public int getCodingAss() {
		return codingAss;
	}
	public void setCodingAss(int codingAss) {
		this.codingAss = codingAss;
	}
	public int getIct02() {
		return ict02;
	}
	public void setIct02(int ict02) {
		this.ict02 = ict02;
	}
	public int getActiveP02() {
		return activeP02;
	}
	public void setActiveP02(int activeP02) {
		this.activeP02 = activeP02;
	}
	public int getIct03() {
		return ict03;
	}
	public void setIct03(int ict03) {
		this.ict03 = ict03;
	}
	public int getActiveP03() {
		return activeP03;
	}
	public void setActiveP03(int activeP03) {
		this.activeP03 = activeP03;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentID="
				+ studentID + ", marksICT01=" + marksICT01 + ", marksICT02="
				+ marksICT02 + ", marksICT03=" + marksICT03 + ", finalMarks="
				+ finalMarks + ", finalGrade=" + finalGrade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + activeP01;
		result = prime * result + activeP02;
		result = prime * result + activeP03;
		result = prime * result + codingAss;
		result = prime * result
				+ ((finalGrade == null) ? 0 : finalGrade.hashCode());
		long temp;
		temp = Double.doubleToLongBits(finalMarks);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ict01;
		result = prime * result + ict02;
		result = prime * result + ict03;
		result = prime * result + marksICT01;
		result = prime * result + marksICT02;
		result = prime * result + marksICT03;
		result = prime * result + proj01;
		result = prime * result
				+ ((studentID == null) ? 0 : studentID.hashCode());
		result = prime * result
				+ ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (activeP01 != other.activeP01)
			return false;
		if (activeP02 != other.activeP02)
			return false;
		if (activeP03 != other.activeP03)
			return false;
		if (codingAss != other.codingAss)
			return false;
		if (finalGrade == null) {
			if (other.finalGrade != null)
				return false;
		} else if (!finalGrade.equals(other.finalGrade))
			return false;
		if (Double.doubleToLongBits(finalMarks) != Double
				.doubleToLongBits(other.finalMarks))
			return false;
		if (ict01 != other.ict01)
			return false;
		if (ict02 != other.ict02)
			return false;
		if (ict03 != other.ict03)
			return false;
		if (marksICT01 != other.marksICT01)
			return false;
		if (marksICT02 != other.marksICT02)
			return false;
		if (marksICT03 != other.marksICT03)
			return false;
		if (proj01 != other.proj01)
			return false;
		if (studentID == null) {
			if (other.studentID != null)
				return false;
		} else if (!studentID.equals(other.studentID))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		//To sort the students in Ascending order of marks
		return (int)Math.round(this.finalMarks - o.finalMarks);
	}
	
	
}
