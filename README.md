# Práctica: Estructuras no lineales Árboles 

- *Título:* Práctica de Árboles Binarios: Inserción, Inversión, Listado por Niveles y Profundidad  
- *Asignatura:* Estructura de Datos  
- *Carrera:* Computación  
- *Estudiante:* Cristopher Salinas  
- *Fecha:* 7/07/2025  
- *Profesor:* Ing. Pablo Torres  

---

## Descripción

Esta práctica implementa cuatro ejercicios fundamentales sobre árboles binarios. Cada uno aborda una operación esencial en estructuras jerárquicas: inserción, inversión, recorrido por niveles y cálculo de profundidad. Se utiliza una clase `Node` como base para representar cada nodo del árbol.

---

## Estructura del Proyecto

- `InsertBST.java`: Inserción ordenada de nodos en un Árbol Binario de Búsqueda (ABB).
- `InvertBinaryTree.java`: Intercambio de hijos izquierdo y derecho para invertir el árbol.
- `ListLevels.java`: Recorrido por niveles del árbol usando cola (BFS).
- `Depth.java`: Cálculo recursivo de la altura máxima del árbol.

---

## Detalle de Ejercicios y Métodos

### 🔹 Ejercicio 1: `InsertBST.java` – Inserción en ABB

**Método:**  
```java
public Node insert(Node root, int value)
```

**Descripción:**  
Inserta un nodo con un valor dado respetando las propiedades de un árbol binario de búsqueda (ABB):
- Si el valor es menor al nodo actual, se inserta en el subárbol izquierdo.
- Si el valor es mayor, se inserta en el subárbol derecho.
- La inserción se realiza de forma recursiva hasta encontrar un lugar nulo, donde se crea el nuevo nodo.

**Retorno:**  
Devuelve el nodo raíz actualizado luego de la inserción.

---

### 🔹 Ejercicio 2: `InvertBinaryTree.java` – Invertir el árbol binario

**Método:**  
```java
public Node invertTree(Node root)
```

**Descripción:**  
Invierte el árbol binario recursivamente:
- Intercambia el hijo izquierdo y derecho de cada nodo.
- Llama recursivamente a los hijos ya intercambiados.
- Al finalizar, el árbol es una imagen reflejada respecto a su eje vertical.

**Retorno:**  
Devuelve el nuevo nodo raíz del árbol invertido.

---

### 🔹 Ejercicio 3: `ListLevels.java` – Listar nodos por niveles

**Método 1:**  
```java
public List<List<Node>> listLevels(Node root)
```

**Descripción:**  
Realiza un recorrido por niveles (BFS):
- Utiliza una cola (`Queue`) para almacenar los nodos por nivel.
- Cada iteración representa un nivel del árbol.
- Almacena los nodos de cada nivel en una lista interna y luego los agrupa en una lista principal.

**Retorno:**  
Una lista de listas, donde cada sublista contiene los nodos de un nivel específico.

---

**Método 2:**  
```java
public void printLevels(List<List<Node>> levels)
```

**Descripción:**  
Imprime los niveles del árbol en consola:
- Recorre cada sublista y concatena los valores con el separador `" → "`.
- Permite visualizar claramente los niveles del árbol.

**Salida esperada (ejemplo):**  
```
10  
15 → 5  
18 → 12 → 7 → 3
```

---

### 🔹 Ejercicio 4: `Depth.java` – Calcular profundidad del árbol

**Método:**  
```java
public int maxDepth(Node root)
```

**Descripción:**  
Calcula la profundidad máxima (altura) del árbol de forma recursiva:
- Evalúa recursivamente las profundidades del subárbol izquierdo y derecho.
- Toma el mayor de los dos y le suma 1 (por el nodo actual).
- El caso base es cuando el nodo es nulo, retornando 0.

**Retorno:**  
Un entero que representa la altura máxima del árbol.

---

## Ejemplo de Ejecución

1. Se insertan los valores: `10, 5, 15, 3, 7, 12, 18`.
2. Se invierte el árbol generado.
3. Se listan los nodos por niveles:
   ```
   10  
   15 → 5  
   18 → 12 → 7 → 3
   ```
4. Se calcula e imprime la profundidad del árbol (valor esperado: `3`).

---