package test;

import org.junit.Test;

import static org.junit.Assert.*;

public class PessoaTestTest {
    @Test
    public void testToString() {
        Pessoa pessoa = new Pessoa("Maria", "F");
        String expected = "Nome: Maria, Sexo: F";
        assertEquals(expected, pessoa.toString());
    }

}