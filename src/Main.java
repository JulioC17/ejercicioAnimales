 public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("negro", 4, "Domestico");

        Tigre tigre1 = new Tigre("amarillo y negro", 4, "Salvaje");

        Murcielago murcielgao1 = new Murcielago("Marron", 2,  "Salvaje");

        Loro loro1 = new Loro("Verde", 2, "domestico");

        Avestruz avestruz1 = new Avestruz("Blanco", 2, "Salavaje");

        System.out.println("Soy un " + gato1.especie + ", soy de color " + gato1.color + ", tengo " + gato1.patas + " patas y soy un Animal " + gato1.salvajeDomestico );
        System.out.println("Soy un " + tigre1.especie + ", soy de color " + tigre1.color + ", tengo " + tigre1.patas + " patas y soy un Animal " + tigre1.salvajeDomestico );
        System.out.println("Soy un " + murcielgao1.especie + ", soy de color " + murcielgao1.color + ", tengo " + murcielgao1.patas + " patas y soy un Animal " + murcielgao1.salvajeDomestico );
        System.out.println("Soy un " + loro1.especie + ", soy de color " + loro1.color + ", tengo " + loro1.patas + " patas y soy un Animal " + loro1.salvajeDomestico );
        System.out.println("Soy un " + avestruz1.especie + ", soy de color " + avestruz1.color + ", tengo " + avestruz1.patas + " patas y soy un Animal " + avestruz1.salvajeDomestico );

        gato1.nadar();
        gato1.caminar();

        tigre1.nadar();
        tigre1.caminar();

        murcielgao1.caminar();
        murcielgao1.volar();

        loro1.caminar();
        loro1.volar();

        avestruz1.caminar();

    }
}