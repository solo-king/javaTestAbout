interface Songer{

    void Songging();
}


interface Writer{

    
    void Writting();
}


interface SongerWriter extends Songer, Writer{

    void SongerWritering();
    
}


class Person implements SongerWriter{

    @Override
    public void Songging(){

        System.out.println("Songging");
    }
    @Override
    public void Writting(){

        System.out.println("Writting");
    }
    @Override
    public void SongerWritering(){
        
        System.out.println("SongerWriter");
    }
}

class InterfaceExtendsTest{

    public static void main(String[]args){

        Person per = new Person();
        per.Songging();
        per.Writting();
        per.SongerWritering();
    }
}