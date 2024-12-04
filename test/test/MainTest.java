package test;

import java.util.List;
import java.util.stream.Collectors;

public class MainTest {
    public static List<Pessoa> filtrarMulheres(List<Pessoa> listaPessoas) {
        return listaPessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());
    }
}