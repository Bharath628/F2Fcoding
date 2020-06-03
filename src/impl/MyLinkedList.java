package impl;

public class MyLinkedList<T> {
    public Node<T> headNode;
    public int size;

    public MyLinkedList(){
        headNode = null;
        size = 0;
    }

    public boolean isEmpty(){
        if(headNode == null)
            return true;
        return false;
    }

    public void insertAtStart(T data){
        Node<T> node = new Node<>();
        node.data = data;
        node.nextNode = null;
        headNode = node;
    }

    public void insert(T data){
        Node<T> node = new Node<>();
        node.data = data;
        while (headNode != null){

        }
    }
}
