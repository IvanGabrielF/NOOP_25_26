package pckg_V1_Z1a;

public class MultStrategy implements CalcStrategy{
    @Override
    public Double performCalculation(Double fst, Double snd) {
        return fst * snd;
    }
}
