package forelesing11.util;

public final class UniConverter {


    public static final int CM_METER_FACTOR = 100;
    public static final int METER_KM_FACTOR = 1000;

    public UniConverter(){
        
    }

    public static double cmTometer(double cm){
        return cm/CM_METER_FACTOR;
    }

    public static double meterToCm(double meter) {
        return meter * CM_METER_FACTOR;
    }

    public static double meterToKm(double meter){
        return meter/METER_KM_FACTOR;
    }

    public static double kmToMeter(double km){
        return km*METER_KM_FACTOR;
    }

}
