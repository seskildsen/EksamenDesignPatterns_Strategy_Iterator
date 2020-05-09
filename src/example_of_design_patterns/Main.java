package example_of_design_patterns;

import example_of_design_patterns.iterator.ManipulateArrayListWithIterator;
import example_of_design_patterns.iterator.UseOfIterator;
import example_of_design_patterns.strategy.AnimalPlay;

public class Main
{
    public static void main(String[] args)
    {
        AnimalPlay animalPlay = new AnimalPlay();

        //animalPlay.wgg();

        ManipulateArrayListWithIterator manipulateArrayListWithIterator = new ManipulateArrayListWithIterator();

        manipulateArrayListWithIterator.showIteratorOnArrayList();
    }
}
