package Domain;
public class Grade {
    private  Course course;
    private  float numGrade;
    private String letterGrade;
    private boolean isPassed;

    public Grade(Course course, float numericGrade) {
        this.course = course;
        this.numGrade = numericGrade;
        LetterGradeCalculation();
    }
    public Grade(){

    }
    private void LetterGradeCalculation() {
        if (numGrade >= 88) {
            isPassed = true;
            letterGrade = "AA";
        } else if (numGrade >= 81) {
            isPassed = true;
            letterGrade = "BA";
        } else if (numGrade >= 74) {
            isPassed = true;
            letterGrade = "BB";
        } else if (numGrade >= 67) {
            isPassed = true;
            letterGrade = "CB";
        } else if (numGrade >= 60) {
            isPassed = true;
            letterGrade = "CC";
        } else if (numGrade >= 53) {
            isPassed = true;
            letterGrade = "DC";
        } else if (numGrade >= 46) {
            isPassed = true;
            letterGrade = "DD";
        }else {
            isPassed = false;
            letterGrade = "FF";
        }
    }


    public Course getCourse() {
        return course;
    }

    public float getNumericGrade() {
        return numGrade;
    }

    public String getLetterGrade() {
        return letterGrade;
    }


    public boolean isPassed() {
        return isPassed;
    }


    public void setPassed(boolean passed) {
        isPassed = passed;
    }


}
