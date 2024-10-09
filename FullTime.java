package LatihanSubClass;

public class FullTime extends Teacher{
    private int anualSalary;
    private String unit;

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    public FullTime(){
        super();
        anualSalary = 0;
        unit = " ";
    }
    public FullTime(String name, int age, String subject, int annualSalary, String unit){
        super(name, age, subject);
        this.unit=unit;
        this.anualSalary=anualSalary;
    }
    public void print(){
		super.print();
		System.out.println("Anual Salary\t= "+anualSalary);
		System.out.println("Unit\t= "+unit);
	}


}
