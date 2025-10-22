package pckg_V1_Z1b;

public enum ALG_OPERATION {

    ADDITION("Addition"),
    SUBSTRACTION("Substraction"),
    MULTIPLICATION("Multiplication"),
    DIVISION("Division");


    private String algOperLabel;

     ALG_OPERATION(String label){
        this.algOperLabel = label;

    }

    @Override
    public String toString() {
        return algOperLabel;
    }
}
