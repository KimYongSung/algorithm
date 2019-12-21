package com.kys.algorithm.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BinarySearchTree {

    class Node{
        int data;
        private Node left, right;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public Integer search(int value){
        Node search = search(root, value);
        return Objects.isNull(search) ? -1 : search.data;
    }

    private Node search(Node node, int key) {
        if (node == null || node.data == key) return node;
        else if(node.data > key) return search(node.left, key);
        else return search(node.right, key);
    }

    public void insert(int value){
        root = insert(root, value);
    }

    private Node insert(Node node, int value){
        if(node == null) {
            node = new Node(value);
            return node;
        }

        if(node.data > value)
            node.left = insert(node.left, value);
        else if(node.data < value)
            node.right = insert(node.right, value);

        return node;
    }

    public void delete(int value){
        delete(root, value);
    }

    private Node delete(Node node, int value){
        if(node == null) return null;
        if(node.data > value)
            node.left = delete(node.left, value);
        else if(node.data < value)
            node.right = delete(node.right, value);

        if(node.left == null && node.right == null) return null;
        else if(node.left == null) return node.right;
        else if(node.right == null) return node.left;

        node.data = findMin(node.right);
        node.right = delete(node.right, node.data);
        return node;
    }

    private int findMin(Node node){
        int min = node.data;
        while (node.left != null){
            node = node.left;
            min = node.data;
        }

        return min;
    }

    public List<Integer> inorder(){
        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr;
    }

    private void inorder(Node node, List<Integer> list){
        if(Objects.isNull(node)) return;

        inorder(node.left, list);
        list.add(node.data);
        inorder(node.right, list);
    }
}
