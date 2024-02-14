package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Yibo Ma(yibom)
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    // Write your implementation below with API documentation
    private int totalAdded;

    /**
     * Constructor for InheritanceSortedIntList
     */
    public InheritanceSortedIntList() {
        super();
        totalAdded = 0;
    }

    /**
     * Overridden add method to keep track of the totalAdded
     */
    @Override
    public boolean add(int num) {
        totalAdded++;
        return super.add(num);
    }

    /**
     * Overridden addAll method to keep track of the totalAdded
     */
    @Override
    public boolean addAll(IntegerList list) {
        //InheritanceSortedIntList newlist = (InheritanceSortedIntList) list;
        // totalAdded += list.size();
        return super.addAll(list);
    }

    /**
     * Accessor for the totalAdded
     * @return the totalAdded
     */
    public int getTotalAdded() {
        return totalAdded;
    }

    // public int size() {
    //     return super.size();
    // }

}