package module3.strategy;

import java.util.UUID;

public class User {

    public User(String name, int pinCod, String password, UUID fingerprintParameters, UUID faceParameters) {
        this.name = name;
        this.pinCod = pinCod;
        this.password = password;
        this.fingerprintParameters = fingerprintParameters;
        this.faceParameters = faceParameters;
    }

    private String name;

    private int pinCod;

    private String password;

    private UUID fingerprintParameters;

    private UUID faceParameters;

    public void unlockPhone(Phone phone) {
        phone.unlock(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPinCod() {
        return pinCod;
    }

    public void setPinCod(int pinCod) {
        this.pinCod = pinCod;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UUID getFingerprintParameters() {
        return fingerprintParameters;
    }

    public void setFingerprintParameters(UUID fingerprintParameters) {
        this.fingerprintParameters = fingerprintParameters;
    }

    public UUID getFaceParameters() {
        return faceParameters;
    }

    public void setFaceParameters(UUID faceParameters) {
        this.faceParameters = faceParameters;
    }
}
