package pckg_V1_Z1b;

public class MultiplicationStrategy implements CalculationStrategy {
    @Override
    public Double performCalculation(Double fst, Double snd) {
        return fst * snd;

    }
}
