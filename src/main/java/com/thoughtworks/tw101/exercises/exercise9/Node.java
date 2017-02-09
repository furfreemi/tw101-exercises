package com.thoughtworks.tw101.exercises.exercise9;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private String name;
    private Node leftChild = null;
    private Node rightChild = null;

    public Node(String name) {
        this.name = name;
    }

    // left child: alphabetically before this node
    // right child: alphabetically matching or after this node
    // If child nodes are already present, pass down in correct direction to append as lower child
    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareTo(name) < 0){
            if (leftChild == null){
                leftChild = new Node(nameOfNewNode);
            } else {
                leftChild.add(nameOfNewNode);
            }
        } else {
            if (rightChild == null){
                rightChild = new Node(nameOfNewNode);
            } else {
                rightChild.add(nameOfNewNode);
            }
        }
    }

    // Get alphabetical list of names based on this as root node
    public List<String> names() {
        return namesBuilder(new LinkedList<String>());
    }

    // Helper method for names(): pass around list while building it up
    private List<String> namesBuilder(List<String> list){
        //left - this - right order in order to maintain alphabetical
        if (leftChild != null){
            leftChild.namesBuilder(list);
        }
        list.add(this.name);
        if (rightChild != null){
            rightChild.namesBuilder(list);
        }
        return list;
    }
}
