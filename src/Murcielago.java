public class Murcielago extends Mamiferos implements Volar {
    int patas;
    String salvajeDomestico;

    public Murcielago(String color, int patas, String salvajeDomestico){
        super("Murcielago", color);
        this.patas = patas;
        this.salvajeDomestico = salvajeDomestico;
    }

    @Override
    public void volar() {
        System.out.println("Soy un " + this.especie + " y estoy volando");
    }

    @Override
    public void caminar() {
        System.out.println("Soy un " + this.especie + " y estoy caminando");
    }
}
