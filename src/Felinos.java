public class Felinos extends Mamiferos implements Nadar {

    public Felinos (String especie, String color){
        super(especie,  color);
    }


    @Override
    public void nadar() {
        System.out.println("Estoy Nadando");
    }
}
