package noe.utility;

public final class UnitConverter {
    public static final int CM_M_FACTOR = 100;
    public static final int M_KM_FACTOR = 1000;

    private UnitConverter(){}
    public static double cmToM(double cm){return cm/CM_M_FACTOR;}
    public static double mToCm(double m){return m*CM_M_FACTOR;}
    public static double mToKm(double m){return m/M_KM_FACTOR;}
    public static double kmToM(double km){return km*M_KM_FACTOR;}
}
