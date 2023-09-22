package b2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"Trần Hữu Huy","Jv01",true,19,"Hà Nội");
        Student student2 = new Student(2,"Trần Hữu Sỹ","Jv01",true,19,"Hà Nam");
        Student student3 = new Student(3,"Trần Hữu Luyện","Jv01",true,19,"hà nội");

        System.out.println("-----------------Thông tin của Student----------------");
        student.display();
        System.out.println("-----------------Thông tin của Student2----------------");
        student2.display();
        System.out.println("-----------------Thông tin của Student3----------------");
        student3.display();

    }
}
