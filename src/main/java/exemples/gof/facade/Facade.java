package exemples.gof.facade;

import exemples.gof.subsistema.crm.CrmService;
import exemples.gof.subsistema2.cep.CepAPI;

public class Facade {
    public void migrarCliente(String nome, String cep){

        String cidade = CepAPI.getInstance().recuperarCidade(cep);
        String estado = CepAPI.getInstance().recuperarCep(cep);



        CrmService.gravarCliente(nome, cep, estado, cidade);

    }
}
