package javaconcepts.collections.ComparatorVsComparable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ComparableCar implements Comparable<ComparableCar> {

    private String carName;
    private String carType;

    @Override
    public int compareTo(ComparableCar o) { // we can do sorting only on the carName now mostly it will violates Open-Close Principle
        // here we can only do one type of storing either asc or desc
       // return this.carName.compareTo(o.carName); // asc
        return o.carName.compareTo(this.carName);  //desc
    }
}
