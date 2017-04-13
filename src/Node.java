import java.util.ArrayList;
import java.util.List;

/**
 * Created by Theodore Gaebler on 4/4/2017.
 * Node has a leftChild and a rightChild
 */
public class Node {

    public String name;
    public List<Node> children;

    public Node(){}

    /**
     * Constructor with one parameter
     * @param name
     */
    public Node(String name){
        this.name = name;
        children = new ArrayList<Node>();
    }

    /**
     * Constructor with three parameters
     * @param name
     * @param leftChild
     * @param rightChild
     */
    public Node(String name, Node leftChild, Node rightChild){
        this.name = name;
        children = new ArrayList<Node>();
        children.add(leftChild);
        children.add(rightChild);
    }

    /**
     * Get node's name
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * Set node's name
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Get node's leftChild
     * @return
     */
    public Node getLeftChild(){
        return children.get(0);
    }

    /**
     * Set node's rightChild
     * @param leftChild
     */
    public void setLeftChild(Node leftChild){
        children.add(0, leftChild);
    }

    /**
     * Get node's rightChild
     * @return
     */
    public Node getRightChild(){
        return children.get(1);
    }

    /**
     * Set node's rightChild
     * @param rightChild
     */
    public void setRightChild(Node rightChild){
        children.add(1, rightChild);
    }

    /**
     * @return String object
     */
    public String toString(){
        return name;
    }
}
