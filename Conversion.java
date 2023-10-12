public class Conversion {
    
    public static double convertPeriodToFrequency(double period, String periodUnit) {
        switch (periodUnit) {
            case "s":
                return 1 / period;
            case "ms":
                return 1 / (period * 1e-3);
            case "us":
                return 1 / (period * 1e-6);
            case "ns":
                return 1 / (period * 1e-9);
            case "ps":
                return 1 / (period * 1e-12);
            default:
                throw new IllegalArgumentException("Unknown unit: " + periodUnit);
        }
    }

    //Added new feature to convert to desired unit 
    public static double convertFrequencyToUnit(double frequency, String desiredFrequencyUnit) {
        switch (desiredFrequencyUnit) {
            case "Hz":
                return frequency;
            case "KHz":
                return frequency * 1e-3;
            case "MHz":
                return frequency * 1e-6;
            case "GHz":
                return frequency * 1e-9;
            case "THz":
                return frequency * 1e-12;
            default:
                throw new IllegalArgumentException("Unknown frequency unit: " + desiredFrequencyUnit);
        }
    }

    public static double convertFrequencyToPeriod(double frequency, String frequencyUnit) {
        switch (frequencyUnit) {
            case "Hz":
                return 1 / frequency;
            case "KHz":
                return 1 / (frequency * 1e3);
            case "MHz":
                return 1 / (frequency * 1e6);
            case "GHz":
                return 1 / (frequency * 1e9);
            case "THz":
                return 1 / (frequency * 1e12);
            default:
                throw new IllegalArgumentException("Unknown unit: " + frequencyUnit);
        }
    }

    //Added new feature to convert to desired unit 
    public static double convertPeriodToUnit(double period, String desiredPeriodUnit) {
        switch (desiredPeriodUnit) {
            case "s":
                return period;
            case "ms":
                return period * 1e3;
            case "us":
                return period * 1e6;
            case "ns":
                return period * 1e9;
            case "ps":
                return period * 1e12;
            default:
                throw new IllegalArgumentException("Unknown period unit: " + desiredPeriodUnit);
        }
    }
}