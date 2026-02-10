package noe.moduls;
import java.time.LocalDate;

public class CarpenterApprentice extends Carpenter{
    private LocalDate trainingStartDate;
    private LocalDate trainingEndDate;

    public CarpenterApprentice(String firstName, String lastName, int age){
        super(firstName, lastName, age);
    }

    public CarpenterApprentice(String firstName, String lastName, int age, int numHousesBuilt,
                               LocalDate trainingStartDate, LocalDate trainingEndDate) {
        super(firstName, lastName, age, numHousesBuilt);
        setTrainingStartDate(trainingStartDate);
        setTrainingEndDate(trainingEndDate);
    }

    public void extendTrainingPeriod(LocalDate newEndDate){
        if(newEndDate.isAfter(getTrainingEndDate())){
            setTrainingEndDate(newEndDate);
        } else {
            System.out.println("new end date is before current end date. try again");
        }
    };

    public void extendTrainingPeriod(int daysToExtend){
        setTrainingEndDate(getTrainingEndDate().plusDays(daysToExtend));
    }

    @Override
    public String toString() {
        return super.toString() + "\nTraining period: " + getTrainingStartDate() + " - " + getTrainingEndDate();
    }

    public LocalDate getTrainingStartDate() {return trainingStartDate;}
    public void setTrainingStartDate(LocalDate trainingStartDate) {this.trainingStartDate = trainingStartDate;}
    public LocalDate getTrainingEndDate() {return trainingEndDate;}
    public void setTrainingEndDate(LocalDate trainingEndDate) {this.trainingEndDate = trainingEndDate;}
}
