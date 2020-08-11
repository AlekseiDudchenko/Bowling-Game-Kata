package com.duch.prime.factors;


import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

class PrimeFactorsTest {

    @Test
    public void factors(){
        assertThat(PrimeFactors.factorsOf(1), empty());
        assertThat(PrimeFactors.factorsOf(2), contains(2));
        assertThat(PrimeFactors.factorsOf(3), contains(3));
        assertThat(PrimeFactors.factorsOf(4), contains(2, 2));
        assertThat(PrimeFactors.factorsOf(5), contains(5));
        assertThat(PrimeFactors.factorsOf(6), contains(2, 3));
        assertThat(PrimeFactors.factorsOf(7), contains(7));
        assertThat(PrimeFactors.factorsOf(8), contains(2,2,2));
        assertThat(PrimeFactors.factorsOf(9), contains(3, 3));
        assertThat(PrimeFactors.factorsOf(2*2*3*3*5*7*11*13),
                contains(2,2,3,3,5,7,11,13));
    }

}