package exemples.gof.subsistema2.cep;

public class CepAPI {

    private static CepAPI instancia = new CepAPI();

    private CepAPI(){
        super();
    }
    public static CepAPI getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cidade){
        return "Antonio Barbosa";
    }

    public String recuperarCep(String cep){
        return "85858";
    }



}

