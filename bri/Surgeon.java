package bri;
public class Surgeon extends HospitalEmployee {
    String operating;
    boolean value;
    
    public Surgeon(String name, int number, String operating, boolean value) {
        super(name, number);
        this.operating = operating;
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString()+" "+operating+"Operating:"+value;
    }

    @Override
    public void work() {
        System.out.println(name +" works for the hospital."+name+" is operating now");
    }
    
    

}
