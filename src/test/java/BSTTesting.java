import org.DataStr.BST;
import org.DataStr.Type;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


public class BSTTesting {
    BST<Integer> bst = new BST<>();

    {
        Stream.of(new Integer[]{7,9,5,6,3,11,8}).forEach(bst::add);
    }
    @Test
    public void inOrderTesting() {
        List<Integer> expected = new ArrayList<Integer>(List.of(new Integer[]{3, 5, 6, 7, 8, 9, 11}));
        List<Integer> actual = bst.traversal(Type.IN_ORDER);
        assertEquals(expected, actual);
    }

    @Test
    public void preOrderTesting() {
        List<Integer> expected = new ArrayList<Integer>(List.of(new Integer[]{7,5,3,6,9,8,11}));
        List<Integer> actual = bst.traversal(Type.PRE_ORDER);
        assertEquals(expected, actual);
    }

    @Test
    public void postOrderTesting() {
        List<Integer> expected = new ArrayList<Integer>(List.of(new Integer[]{3,6,5,8,11,9,7}));
        List<Integer> actual = bst.traversal(Type.POST_ORDER);
        assertEquals(expected, actual);
    }

    @Test
    public void levelOrderTesting() {
        List<Integer> expected = new ArrayList<Integer>(List.of(new Integer[]{7,5,9,3,6,8,11}));
        List<Integer> actual = bst.traversal(Type.LEVEL_ORDER);
        assertEquals(expected, actual);
    }
}
