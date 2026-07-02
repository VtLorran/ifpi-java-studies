import java.time.LocalDate;

public class Contrato {
    private static int proximoId = 1;

    private int id;
    private Imovel imovel;
    private Cliente cliente;
    private Corretor corretor;
    private TipoContrato tipo;
    private LocalDate data;
    private double valorFinal;


    public Contrato(Imovel imovel, Cliente cliente, Corretor corretor, double valorFinal, TipoContrato tipo, LocalDate data) {
        this.id = proximoId;
        proximoId++;

        this.imovel = imovel;
        this.cliente = cliente;
        this.corretor = corretor;
        this.valorFinal = valorFinal;
        this.tipo = tipo;
        this.data = data;
    }

 
    public void imprimir() {
        System.out.println("Detalhes do Contrato:");
        System.out.println("ID do Contrato: " + this.id);
        System.out.println("Tipo de Contrato: " + this.tipo);
        System.out.println("Data da Assinatura: " + this.data);
        System.out.println("Valor Final: R$ " + this.valorFinal);
        
        System.out.println("Cliente: " + (this.cliente != null ? this.cliente.getNome() : "Não informado"));
        System.out.println("Corretor: " + (this.corretor != null ? this.corretor.getNome() : "Não informado"));
        
        System.out.println("ID do Imóvel: " + (this.imovel != null ? this.imovel.getId() : "Não informado"));
    }

    public int getId() {
        return this.id;
    }

    public Imovel getImovel() {
        return this.imovel;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Corretor getCorretor() {
        return this.corretor;
    }

    public TipoContrato getTipo() {
        return this.tipo;
    }

    public LocalDate getData() {
        return this.data;
    }

    public double getValorFinal() {
        return this.valorFinal;
    }
}