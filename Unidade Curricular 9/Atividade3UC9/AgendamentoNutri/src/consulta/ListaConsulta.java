package consulta;

import consulta.Consulta;
import java.util.List;
import java.util.ArrayList;

public class ListaConsulta {

    private static final List<Consulta> lista = new ArrayList<>();
    
    public static List<Consulta> Listar(){
        return lista;
    
    }
    
    public static void Adicionar(Consulta consulta){
        lista.add(consulta);
    }
    
}
