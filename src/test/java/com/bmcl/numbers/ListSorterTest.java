package com.bmcl.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListSorterTest {

    private List<Integer> list; // A lista a ser ordenada
    private List<Integer> expected; // O resultado esperado

    @BeforeEach
    public void setUp() {
        // Inicializa os dados antes de cada teste
        list = Arrays.asList(3, 2, 6, 1, 4, 5, 7);
        expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    }

    @Test
    public void sort() {
        // Arrange
        ListSorter sorter = new ListSorter();

        // Act
        List<Integer> sorted = sorter.sort(list);

        // Assert
        Assertions.assertEquals(expected, sorted); // Valida se a lista está ordenada corretamente
    }

    @Test
    public void sortDescendingList() {
        // Arrange
        ListSorter sorter = new ListSorter();
        list = Arrays.asList(7, 6, 5, 4, 3, 2, 1); // Redefine a lista como decrescente
        expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7); // Espera-se que seja ordenada em ordem crescente

        // Act
        List<Integer> sorted = sorter.sort(list);

        // Assert
        Assertions.assertEquals(expected, sorted); // Valida se a lista foi ordenada corretamente
    }

    @Test
    public void sortEmptyList() {
        // Arrange
        ListSorter sorter = new ListSorter();
        list = Arrays.asList(); // Lista vazia
        expected = Arrays.asList(); // Resultado esperado também é uma lista vazia

        // Act
        List<Integer> sorted = sorter.sort(list);

        // Assert
        Assertions.assertEquals(expected, sorted); // Valida se o resultado é uma lista vazia
    }

    @Test
    public void sortSingleElementList() {
        // Arrange
        ListSorter sorter = new ListSorter();
        list = Arrays.asList(42); // Lista com um único elemento
        expected = Arrays.asList(42); // O resultado esperado é o mesmo

        // Act
        List<Integer> sorted = sorter.sort(list);

        // Assert
        Assertions.assertEquals(expected, sorted); // Valida se a lista com um elemento foi retornada corretamente
    }
    @Test
    public void sortListWithDuplicates() {
        // Arrange
        ListSorter sorter = new ListSorter();
        list = Arrays.asList(4, 1, 2, 2, 3, 3, 3);
        expected = Arrays.asList(1, 2, 2, 3, 3, 3, 4); // Ordenada, com duplicados preservados

        // Act
        List<Integer> sorted = sorter.sort(list);

        // Assert
        Assertions.assertEquals(expected, sorted);
    }
    @Test
    public void sortListWithNegativeNumbers() {
        // Arrange
        ListSorter sorter = new ListSorter();
        list = Arrays.asList(-3, -1, -4, -2, 0, 2, 1);
        expected = Arrays.asList(-4, -3, -2, -1, 0, 1, 2); // Ordenada incluindo números negativos

        // Act
        List<Integer> sorted = sorter.sort(list);

        // Assert
        Assertions.assertEquals(expected, sorted);
    }

}
