package org.example.item1;

public class Settings {
    private boolean useAutoSetting;
    private boolean useABS;

    private static final Settings SETTINGS = new Settings();

    private Settings() {}

    public static Settings getInstance() {
        return SETTINGS;
    }

}
