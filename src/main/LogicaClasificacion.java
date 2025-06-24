package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte una cadena de texto utilizando una pila (Stack).
     *
     * @param texto Cadena original a invertir.
     * @return Cadena invertida.
     *
     *         Ejemplo:
     *         Entrada: "Hola Mundo"
     *         Salida: "odnuM aloH"
     */
    public String invertirCadena(String texto) {
        Stack<Character> pila = new Stack<Character>();
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }
        String textoInvertido = "";
        while (!pila.isEmpty()) {
            Character c = pila.pop();
            textoInvertido += c;
        }
        return textoInvertido;
    }

    /**
     * Verifica si los símbolos de paréntesis, corchetes y llaves están bien
     * balanceados.
     *
     * @param expresion Cadena con símbolos.
     * @return true si está balanceada, false en caso contrario.
     *
     *         Ejemplo:
     *         Entrada: "{[()]}"
     *         Salida: true
     */
    public boolean validarSimbolos(String expresion) {
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < expresion.length(); i++) {
            if(expresion.charAt(i) == '(' || expresion.charAt(i) == '{' || expresion.charAt(i) == '[') {
                pila.push(expresion.charAt(i));
            } else if (expresion.charAt(i) == ')'){
                if(pila.peek() == '(') {
                    pila.pop();
                }
                else {
                    return false;
                }
            }else if (expresion.charAt(i) == '}'){
                if(pila.peek() == '{') {
                    pila.pop();
                }
                else {
                    return false;
                }
            }else if (expresion.charAt(i) == ']'){
                if(pila.peek() == '[') {
                    pila.pop();
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }

    /**
     * Ordena una pila de enteros en orden ascendente usando otra pila auxiliar.
     *
     * @return Lista ordenada.
     *
     *         Ejemplo:
     *         Entrada: [3, 1, 4, 2]
     *         Salida: [1, 2, 3, 4]
     */
    public List<Integer> ordenarPila(Stack<Integer> pila) {
        List<Integer> ordenada = new ArrayList<>();
        Stack<Integer> pilaAuxiliar = new Stack<>();
        while (!pila.isEmpty()) {
            int temp = pila.pop();
            while (!pilaAuxiliar.isEmpty() && pilaAuxiliar.peek() < temp) {
                pila.push(pilaAuxiliar.pop());
            }
            pilaAuxiliar.push(temp);
        }
        while (!pilaAuxiliar.isEmpty()) {
            ordenada.add(pilaAuxiliar.pop());
        }
        return ordenada;
    }


    /**
     * Clasifica una lista de enteros separando pares e impares.
     * Usa LinkedList para mantener el orden de inserción.
     *
     * @return Lista con pares primero, luego impares.
     *
     *         Ejemplo:
     *         Entrada: [1, 2, 3, 4, 5, 6]
     *         Salida: [2, 4, 6, 1, 3, 5]
     */
    public List<Integer> clasificarPorParidad(LinkedList<Integer> original) {

        return new ArrayList<>();
    }
}
