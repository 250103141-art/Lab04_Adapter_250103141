public class BulbAdapter implements SmartDevice {
    private final LegacyBulb bulb;

    public BulbAdapter(LegacyBulb bulb) {

        if (bulb == null) throw new IllegalArgumentException("Bulb argument is null");
    }

    public void turnOn() {
        bulb.setBrightness(255);
    }

    public void turnOff() {
        bulb.setBrightness(0);
    }

    public boolean isOn() {
        if(bulb.hasPower() && bulb.readBrightness()>0) return true;
    }

    public int getPowerPercent() {
        if (!bulb.hasPower()) {
            return 0;
        }
        int raw = bulb.readBrightness();
        if (raw == 0) {
            return 0;
        }
        int basePercent = (raw * 100) / 255;
        int calibrated = basePercent + 1;
        if (calibrated > 100) {
            return 100;
        }
        return calibrated;
    }
}
