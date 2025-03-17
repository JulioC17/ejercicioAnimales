public class Mamiferos implements Caminar {
    String especie;
    String color;

    public Mamiferos (String especie, String color){
        this.especie = especie;
        this.color = color;
    }

    @Override
    public void caminar() {
        System.out.println("Estoy caminando");
    }
}
