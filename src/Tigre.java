public class Tigre extends Felinos{
    int patas;
    String salvajeDomestico;

    public Tigre(String color, int patas, String salvajeDomestico){
        super("Tigre", color);
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
