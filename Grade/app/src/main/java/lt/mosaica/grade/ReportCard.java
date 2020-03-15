package lt.mosaica.grade;

public class ReportCard {
    /**
     * Default values for the grades
     */
    private int mChemistryGrade;
    private int mMathGrade;
    private int mHistoryGrade;

    public ReportCard(int chemistryGrade, int mathGrade, int historyGrade) {
        mChemistryGrade = chemistryGrade;
        mMathGrade = mathGrade;
        mHistoryGrade = historyGrade;
    }

    public int getChemistryGrade() {
        return mChemistryGrade;
    }

    public void setChemistryGrade(int grade) {
        mChemistryGrade = grade;
    }

    public int getmMathGrade() {
        return mMathGrade;
    }

    public void setmMathGrade(int mMathGrade) {
        this.mMathGrade = mMathGrade;
    }

    public int getmHistoryGrade() {
        return mHistoryGrade;
    }

    public void setmHistoryGrade(int mHistoryGrade) {
        this.mHistoryGrade = mHistoryGrade;
    }

    @Override
    public String toString() {
        return "Math" + mMathGrade +  mHistoryGrade + mChemistryGrade;
    }
}

