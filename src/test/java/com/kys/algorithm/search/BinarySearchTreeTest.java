package com.kys.algorithm.search;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTreeTest {

    @Test
    public void case01(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(4);
        bst.insert(1);
        bst.insert(2);
        bst.insert(5);
        bst.insert(6);
        bst.insert(8);

        System.out.println(bst.inorder().toString());
        assertThat(bst.search(4)).isEqualTo(4);
        bst.delete(4);
        assertThat(bst.search(4)).isEqualTo(-1);
        System.out.println(bst.inorder().toString());
    }
}
