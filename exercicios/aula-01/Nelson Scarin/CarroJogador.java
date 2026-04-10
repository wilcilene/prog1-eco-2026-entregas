import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CarroJogador {
    private static final Path ARQUIVO_NITRO = Paths.get("nivel_nitro.txt");
    private String marca;
    private String modelo;
    private int velocidade;
    private int nivelNitro;

    public CarroJogador(String marca, String modelo, int velocidade, int nivelNitro) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        if (nivelNitro < 0) {
            this.nivelNitro = 0;
        } else if (nivelNitro > 100) {
            this.nivelNitro = 100;
        } else {
            this.nivelNitro = nivelNitro;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getNivelNitro() {
        return nivelNitro;
    }

    public void setNivelNitro(int nivelNitro) {
        if (nivelNitro < 0) {
            this.nivelNitro = 0;
        } else if (nivelNitro > 100) {
            this.nivelNitro = 100;
        } else {
            this.nivelNitro = nivelNitro;
        }
    }

    public void usarNitro() {
        final int CONSUMO_NITRO = 20;

        if (nivelNitro <= 0) {
            System.out.println("NITRO ACABOU!");
            return;
        }

        System.out.println("NITRO ATIVADO!");
        nivelNitro = Math.max(nivelNitro - CONSUMO_NITRO, 0);
        System.out.println("Nitro restante: " + nivelNitro + "%");

        if (nivelNitro == 0) {
            System.out.println("NITRO ACABOU!");
        }
    }

    public static void main(String[] args) {
        int nivelNitroSalvo = carregarNivelNitro();
        CarroJogador carro = new CarroJogador("Ferrari", "F8", 300, nivelNitroSalvo);

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Velocidade: " + carro.getVelocidade() + " km/h");
        System.out.println("Nitro inicial: " + carro.getNivelNitro() + "%\n");

        carro.usarNitro();
        salvarNivelNitro(carro.getNivelNitro());
    }

    private static int carregarNivelNitro() {
        if (Files.exists(ARQUIVO_NITRO)) {
            try {
                String conteudo = Files.readString(ARQUIVO_NITRO).trim();
                return Integer.parseInt(conteudo);
            } catch (IOException | NumberFormatException e) {
                // Se houver erro, começa com 100
            }
        }
        return 100;
    }

    private static void salvarNivelNitro(int nivelNitro) {
        try {
            Files.writeString(ARQUIVO_NITRO, String.valueOf(nivelNitro));
        } catch (IOException e) {
            System.out.println("Erro ao salvar o nível de nitro: " + e.getMessage());
        }
    }
}
