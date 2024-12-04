import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os nomes e sexos separados por vírgula (Exemplo: Maria,F; João,M): ");
        String input = sc.nextLine();

        List<String> pessoas = Arrays.asList(input.split(";"));
        List<Pessoa> listaPessoas = pessoas.stream()
                .map(pessoa -> {
                    String[] dados = pessoa.split(",");
                    return new Pessoa(dados[0].trim(), dados[1].trim());
                })
                .collect(Collectors.toList());
        List<Pessoa> mulhers = listaPessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        System.out.println("Lista de mulheres: ");
        mulhers.forEach(System.out::println);
    }
}