package Algorithm4th.Test;

import Algorithm4th.Sort.SingleLinkList;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleLinkListTest {


    public void add() {
        SingleLinkList<Integer> singleLinkList = new SingleLinkList<>();
        singleLinkList.add(12);
        singleLinkList.add(13);
        singleLinkList.add(17);
        singleLinkList.add(5);
        for (Integer i:singleLinkList) {
            System.out.println(i);
        }
    }
}