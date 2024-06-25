import java.util.Map;

public class StudentGrades {
    private boolean isPass;
    private Map<String,Integer> resultCard;

    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }

    public Map<String, Integer> getResultCard() {
        return resultCard;
    }

    public void setResultCard(Map<String, Integer> resultCard) {
        this.resultCard = resultCard;
    }

    @Override
    public String toString() {
        return "StudentGrades{" +
                "isPass=" + isPass +
                ", resultCard=" + resultCard +
                '}';
    }
}
