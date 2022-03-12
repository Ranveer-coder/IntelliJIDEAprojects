class InstanceAccessors {
public static void main(String[] args){
    private int rollNo;
    private String name;
    public int getRollNo(){ //Accessor method
        return rollNo;
    }
    public void setRollNo(int rollNo){ //Mutator method
        this.rollNo = rollNo;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public void DisplayRollNoName(){
        System.out.println("Roll No : "+rollNo);
        System.out.println("Name :" +name);
    }
}
