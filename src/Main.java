/**
 * Created by Theodore Gaebler on 4/4/2017.
 * Garmin International
 * Software Engineer Internship Challange
 */
public class Main {

    public static void main(String[] args) {

        Goal success = new Goal("Find Me");

        Node Start = constructTree(success);

        printTree(Start, success);
    }

    /**
     * Takes a Goal object and constructs a tree as
     * defined by Garmin @ USM Job Fair.
     * @param success
     * @return root node of the tree
     */
    private static Node constructTree(Goal success) {

        Node D1 = new Node("D1", null, null);

        Node C1 = new Node("C1", null, null);
        Node Find_Me = new Node(success.toString(), D1, null);
        Node C2 = new Node("C2", null, null);

        Node B1 = new Node("B1", C1, null);
        Node B2 = new Node("B2", Find_Me, null);
        Node B3 = new Node("B3", C2, null);

        Node A1 = new Node("A1", B1, null);
        Node A2 = new Node("A2", B2, B3);

        Node Start = new Node("Start", A1, A2);

        return Start;
    }


    /**
     * @param node
     * @param success
     */
    private static void printTree(Node node, Goal success) {

        if (node.toString().equals(success.toString())) {
            System.out.println(node.toString());
            success.setFound();
            return;
        }

        if (node.getLeftChild() != null && !success.getFound()) {
            System.out.println(node.toString());
            printTree(node.getLeftChild(), success);
            if (!success.getFound())
                System.out.println(node.toString());
        }

        if (node.getRightChild() != null && !success.getFound()) {
            printTree(node.getRightChild(), success);
            if (!success.getFound())
                System.out.println(node.toString());
        }

        if (node.getLeftChild() == null && node.getRightChild() == null)
            System.out.println(node.toString());
    }
}