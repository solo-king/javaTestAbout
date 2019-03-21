class Person{

    public Person(){
        System.out.println("Person construct");
    }
}

class Student{

    public Student(){
        System.out.println("Student construct!!");
    }
}

class ConstructTest{
    public static void main(String[] args){
        
        Student stu = new Student();
    }
    
}