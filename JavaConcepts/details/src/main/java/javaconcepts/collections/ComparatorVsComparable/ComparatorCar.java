package javaconcepts.collections.ComparatorVsComparable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ComparatorCar {
    private String carName;
    private String carType;
}
