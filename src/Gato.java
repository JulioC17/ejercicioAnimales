public class Gato extends Felinos{
    int patas;
    String salvajeDomestico;

    public Gato(String color, int patas, String salvajeDomestico){
        super("Gato", color);
        this.patas = patas;
        this.salvajeDomestico = salvajeDomestico;
    }

    @Override
    public void nadar() {
        System.out.println("Soy un " + this.especie + " y estoy nadando");
    }

    @Override
    public void caminar() {
        System.out.println("Soy un " + this.especie + " y estoy caminando");
    }
}



