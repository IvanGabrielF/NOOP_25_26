package pckg_V1_Z1b;

public class InputPanelData {

    private double fstNum;
    private double sndNum;
    private ALG_OPERATION alg_operation;

    public InputPanelData(double fstNum, double sndNum, ALG_OPERATION alg_operation) {
        this.fstNum = fstNum;
        this.sndNum = sndNum;
        this.alg_operation = alg_operation;


    }

    public Double getFstNum() {
        return fstNum;

    }
    public Double getSndNum() {
        return sndNum;
    }
    public ALG_OPERATION getAlgOperation() {
        return alg_operation;

    }
}
