public class Aves implements Caminar {
    String especie;
    String color;

    public Aves (String especie, String color){
        this.especie = especie;
        this.color = color;
    }

    @Override
    public void caminar() {
        System.out.println("Estoy caminando");
    }
}
