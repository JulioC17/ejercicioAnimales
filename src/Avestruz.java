public class Avestruz extends Aves {
    int patas;
    String salvajeDomestico;

    public Avestruz(String color, int patas, String salvajeDomestico){
        super("Avestruz", color);
        this.patas = patas;
        this.salvajeDomestico = salvajeDomestico;
    }


    @Override
    public void caminar() {
        System.out.println("Soy un " + this.especie + " y estoy caminando");
    }
}
