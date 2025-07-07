package main.Ejercicio_03_listLeves;

import main.Materia.Models.Node;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class ListLevels {
    
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new LinkedList<>();
        
        if (root == null) {
            return result;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Node> currentLevel = new LinkedList<>();
            
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                currentLevel.add(currentNode);
                
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }
            
            result.add(currentLevel);
        }
        
        return result;
    }
    
    public void printLevels(List<List<Node>> levels) {
        for (List<Node> level : levels) {
            StringBuilder sb = new StringBuilder();
            for (Node node : level) {
                if (sb.length() > 0) {
                    sb.append(" → ");
                }
                sb.append(node.getValue());
            }
            System.out.println(sb.toString());
        }
    }
}