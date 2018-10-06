package binary_tree;

/**
 * Created by ethan.kim on 2018. 10. 6..
 */
public class App {

    /*
    root
     └── 1
         ├── 11
         │   └── 111
         └── 12
              └── 122
     */
    public static void main(String[] args) {
        Node root = new NodeImpl("1", new NodeImpl("11", new NodeImpl("111", NullNode.getInstance(),
                NullNode.getInstance()), NullNode.getInstance()), new NodeImpl("12", NullNode.getInstance(), new NodeImpl("122", NullNode.getInstance(), NullNode.getInstance())));

        root.walk();
    }
}
