package com.bmcl.numbers;

import java.util.Collections;
import java.util.List;

public class ListSorter {

    public List<Integer> sort(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("A lista não pode ser nula");
        }

        // Verifica se a lista está vazia
        if (list.isEmpty()) {
            return list; // Retorna a lista vazia diretamente
        }

        Collections.sort(list); // Ordena a lista in-place em ordem crescente
        return list;
    }
}
