package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //setting values of the variables
        obj.setName("Maulik");
        obj.setAge(22);
        obj.setRollNo(8);
        // Displaying values of the variables
        System.out.println("CodeBusters name : "+obj.getName());
        System.out.println("CodeBusters age : "+obj.getAge());
        System.out.println("CodeBusters rollno : "+obj.getRollNo());

    }
}
