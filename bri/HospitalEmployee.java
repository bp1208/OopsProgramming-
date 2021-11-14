package bri;
public class HospitalEmployee
{
   protected String name;
   protected int number;
   
   public HospitalEmployee(String name, int number) {
      this.name = name;
      this.number = number;
   }

   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
  
   public int getNumber() {
      return number;
   }
  
   public void setNumber(int number) {
      this.number = number;
   }
  
   
   @Override
   public String toString() {
      return name + " " +number;
   }

   public void work()
   {
      System.out.println(name +" works for the hospital.");
   }

}   
class Doctor extends HospitalEmployee
{
    String speciality;
    public Doctor(String name, int number, String speciality) {
        super(name, number);
        this.speciality = speciality;
    }
    @Override
    public String toString() {
        return super.toString()+" "+speciality;
    }
    @Override
    public void work() {
        System.out.println(name +" works for the hospital."+name+" is a(n) "+speciality+" doctor");
    }
    
    
}
class Nurse extends HospitalEmployee
{
    int numOfPatients;
    public Nurse(String name, int number, int numOfPatients) {
        super(name, number);
        this.numOfPatients = numOfPatients;
    }
    @Override
    public String toString() {
        return super.toString()+" has "+numOfPatients+" patients.";
    }
    @Override
    public void work() {
        System.out.println(name +" works for the hospital."+name+" is a nurse with "+numOfPatients+" patients");
    }
    
}
