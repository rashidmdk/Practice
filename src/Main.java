import java.util.ArrayList;
import java.util.List;
import javax.xml.soap.Node;

public class Main {

    public static void main(String[] args) {

        Singleton1 singleton = Singleton1.getInstance();

        Singleton4.Singleton singleton4 = Singleton4.getOnlyOne();


        int a=0,b;
        b = a++ + ++a + ++a;


        System.out.println("b = " + b);
        System.out.println("a = " + a);

        VrooziPrograms.countChar("rashidmahmood");

    }

    Node head;

    public void addNode(Node newNode)
    {
        Node insertingPositionNode = head;
        while(insertingPositionNode.getValue() != "Rashid"){
            insertingPositionNode = (Node) insertingPositionNode.getNextSibling();
        }
        Node storeNextNode = (Node) insertingPositionNode.getNextSibling();
        insertingPositionNode.appendChild(newNode);
        newNode.getNextSibling().setNodeValue(storeNextNode.getNodeValue());
        newNode.getPreviousSibling().setNodeValue(insertingPositionNode.getNodeValue());

    }

}
