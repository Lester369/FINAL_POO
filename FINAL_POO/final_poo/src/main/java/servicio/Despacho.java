package servicio;

import java.util.*;
import java.util.stream.Collectors;

public class Despacho {
    private final String codigo;
    private final String NombreMensajero;

    public Despacho(String codigo, String nombreMensajero) {
        this.codigo = codigo;
        NombreMensajero = nombreMensajero;
    }

    private final Map<String> pedidos = new LinkedHashMap<>();

    //la lista aca en despacho

    public List<pedidos> ordenarPorHoraDescYNombrePaciente() {
        Comparator<pedidos> criterio = Comparator.comparingInt(pedidos::get)
                .reversed()
                .thenComparing(pedidos::getNombrePaciente);
        return pedidos.values().stream().sorted(criterio).collect(Collectors.toList());
    }

}
