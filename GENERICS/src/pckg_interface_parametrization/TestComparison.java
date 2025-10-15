package pckg_interface_parametrization;

public class TestComparison {
    public static void main(String[] args) {

        String sFst = "tamo neki string...";
        String sSnd = "Novi string!";

        CompareTWO<String> stringCompareTWO = new CompareTWO<>(sFst, sSnd);
        stringCompareTWO.performComparison();

        Integer iFst = 100;
        Integer iSnd = 100;
        CompareTWO<Integer> integerCompareTWO = new CompareTWO<>(iFst, iSnd);
        integerCompareTWO.performComparison();

        StringLenghtComparison fst = new StringLenghtComparison(sFst);
        StringLenghtComparison snd = new StringLenghtComparison(sSnd);
        CompareTWO<StringLenghtComparison> stringLenghtComparisonCompareTWO = new CompareTWO<>(fst, snd);
        stringLenghtComparisonCompareTWO.performComparison();

    }
}
