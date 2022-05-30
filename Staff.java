public class Staff {
    protected String sID;
    protected String sName;

    public Staff(String sID, String sName) {
        this.sID = sID;
        this.sName = sName;
    }

    public String getsID() {
        return sID;
    }
    public void setsID(String sID) {
        this.sID = sID;
    }
    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }
    public Double paySalary(double baseSalary,int workingTime) {
        return baseSalary * workingTime;
    }
    @Override
    public String toString (){
        return String.format("%s_%s",getsID(),getsName());
    }
}
