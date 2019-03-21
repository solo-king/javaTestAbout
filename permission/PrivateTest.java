class Person{

    int age;
}

class Student extends Person{

    public int getAge(){

        return age;
    }
}

class PrivateTest{

    public static void main(String[] args){

        Student stu = new Student();
        System.out.println("[age]"+stu.getAge());
    }

}