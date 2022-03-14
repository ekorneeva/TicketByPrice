package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tiket implements Comparable<Tiket> {
    private int id;
    private double price;
    private String airportFrom;
    private String airportTo;
    private int travelTime;

    @Override
    public int compareTo(Tiket o) {
        return (int) (price - o.price);
    }
}
