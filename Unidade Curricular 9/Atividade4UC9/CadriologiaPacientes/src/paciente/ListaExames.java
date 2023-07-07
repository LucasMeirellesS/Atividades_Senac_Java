package paciente;

import java.util.List;
import java.util.ArrayList;

public class ListaExames {
    
    private static final List<Exame> lista = new ArrayList<>();
    
    public static List<Exame> Listar(){
        return lista;
    }
    
    public static void Adicionar(Exame exame){
        lista.add(exame);
    }
    
}
