package grade.impl;

public class Calculation {

    public static Grade calculateGrade(int labPoints, int examGrade) throws Exception {
        int bonusLevels = 0;

        if (labPoints > 50) {
            bonusLevels = (labPoints - 50) / 5;
            labPoints = 50;
        }

        if (examGrade > 10 || examGrade < 0) {
            throw new Exception();
        }

        examGrade += Math.round(examGrade * bonusLevels / 10f);

        if (labPoints < 0) {
            throw new Exception();
        }

        
        int labContribution = labPoints * 15 / 50;
        int examContribution = Math.round((examGrade * 15f) / 10f);
        int finalGrade = labContribution + examContribution;


        finalGrade = (labPoints < 25) ? (int) Math.floor(finalGrade) 
                : (labPoints > 40) ? (int) Math.ceil(finalGrade) 
                : Math.round(finalGrade);


        
        Grade g = new Grade(finalGrade);
        
        return g;
    }
}
