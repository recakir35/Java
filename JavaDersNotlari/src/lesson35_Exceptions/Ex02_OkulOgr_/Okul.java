package lesson35_Exceptions.Ex02_OkulOgr_;

public class Okul {
    String schoolName="Çakır Özel Okulları";
    int maxStudentCount=3;


    public Okul() {
    }

    public Okul(String schoolName, int maxStudentCount) {
        this.schoolName = schoolName;
        this.maxStudentCount = maxStudentCount;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getMaxStudentCount() {
        return maxStudentCount;
    }

    public void setMaxStudentCount(int maxStudentCount) {
        this.maxStudentCount = maxStudentCount;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "schoolName='" + schoolName + '\'' +
                ", maxStudentCount=" + maxStudentCount +
                '}';
    }
}

