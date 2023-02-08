package DS;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BST<T extends Comparable<T>> {
    private static class Node<T> {
        Node<T> left = null;
        Node<T> right = null;
        T value = null;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node<T> root = null;

    public BST() {
    }

    private boolean less(T k1, T k2) {
        return k1.compareTo(k2) <= 0;
    }

    public Node<T> find(T val) {
        return val == null ? null : find(root, val);
    }

    private Node<T> find(Node<T> node, T val) {
        if (node == null || val == null) {
            return null;
        } else {
            Node<T> result;
            if (less(val, node.value)) {
                result = find(node.left, val);
            } else {
                result = find(node.right, val);
            }
            return result;
        }
    }

    public boolean add(T val) {
        if (val == null) {
            throw new IllegalArgumentException("argument can't be null");
        }
        if (root == null) {
            root = new Node<T>(val);
            return true;
        } else {
            add(val, root);
            return true;
        }
    }

    private void add(T val, Node<T> node) {
        if (less(val, node.value)) {
            if (node.left == null) {
                node.left = new Node<>(val);
            } else {
                add(val, node.left);
            }
        } else {
            if (node.right == null) {
                node.right = new Node<>(val);
            } else {
                add(val, node.right);
            }
        }
    }

    public List<T> traversal(Type type) {
        if (root == null) {return Collections.emptyList();}
        List<T> list = new LinkedList<>();
        if (type == Type.IN_ORDER) {
            inOrder(root, list);
        }
        if (type == Type.PRE_ORDER) {
            preOrder(root, list);
        }
        if (type == Type.POST_ORDER) {
            postOrder(root, list);
        }
        if (type == Type.LEVEL_ORDER) {
            levelOrder(list);
        }
        return list;
    }

    private void inOrder(Node<T> node, List<T> list) {
        if (node.left != null) { inOrder(node.left, list);}
        list.add(node.value);
        if (node.right != null) { inOrder(node.right, list); }
    }

    private void preOrder(Node<T> node, List<T> list) {
        list.add(node.value);
        if (node.left != null) { preOrder(node.left, list);}
        if (node.right != null) { preOrder(node.right, list); }
    }
    private void postOrder(Node<T> node, List<T> list) {
        if (node.left != null) { postOrder(node.left, list);}
        if (node.right != null) { postOrder(node.right, list); }
        list.add(node.value);
    }

    public void levelOrder(List<T> list) {
        Queue<Node<T>> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            Node<T> node = nodeQueue.poll();
            list.add(node.value);
            if (node.left != null) {nodeQueue.add(node.left);}
            if (node.right != null) {nodeQueue.add(node.right);}
        }
    }

}

