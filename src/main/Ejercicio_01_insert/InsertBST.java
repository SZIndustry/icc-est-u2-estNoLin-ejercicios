package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBST {

    private Node root;

    public InsertBST() {
        root = null;
    }

    // Modificamos el insert para que también acepte una referencia de la raíz
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));
        }

        return root;  // Retornamos el nodo raíz actualizado
    }
}
