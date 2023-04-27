package sim_objects;

public class WaterContainer {




    private final double maxPumpVolume;
    private double currentVolume;
    private double currentHeight;
    private final double BASE_AREA;
    private final double HEIGHT;
    private final double drainVolume;

    public WaterContainer(double baseArea, double height, double drainVolume, double maxPumpVolume) {
        this.BASE_AREA = baseArea;
        this.HEIGHT = height;
        this.drainVolume = drainVolume;
        this.currentHeight = 0;
        this.currentVolume = 0;
        this.maxPumpVolume = maxPumpVolume;
    }

    public double getMaxPumpVolume() {
        return maxPumpVolume;
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(double currentVolume) {
        this.currentVolume = currentVolume;
    }

    public double getCurrentHeight() {
        return currentHeight;
    }

    public void setCurrentHeight(double currentHeight) {
        this.currentHeight = currentHeight;
    }

    public double getBASE_AREA() {
        return BASE_AREA;
    }

    public double getHEIGHT() {
        return HEIGHT;
    }

    public double getDrainVolume() {
        return drainVolume;
    }
}
