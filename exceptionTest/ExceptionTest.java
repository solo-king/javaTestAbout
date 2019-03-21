

class ExceptionTest{

    public static void main(String[] args){

        try{
            System.out.println("try...");
            return;
        }finally{
            System.out.println("finally...");
        }
    }
}