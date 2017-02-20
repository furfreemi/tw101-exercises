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


    public List<String> names() {
        return namesBuilder(new LinkedList<String>());
    }


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
