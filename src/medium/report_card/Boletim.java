package medium.report_card;

public class Boletim {
    public String name;
    public double grades[] = new double[3];
    public double finalGrade;

    public double sumGrades() {
        finalGrade = grades[0] + grades[1] + grades[2];
        return finalGrade;
    }

    public String result() {
        if(finalGrade > 60) {
            return "Aprovado";
        } else {
            return "Reprovado, faltam " + (60 - finalGrade);
        }
    }
}
