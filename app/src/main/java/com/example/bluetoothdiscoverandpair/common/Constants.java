package com.example.bluetoothdiscoverandpair.common;

public class Constants {
    // Message types sent from the BluetoothCommunicationService Handler
    public static final int MESSAGE_STATE_CHANGE = 1;
    public static final int MESSAGE_READ = 2;
    public static final int MESSAGE_WRITE = 3;
    public static final int MESSAGE_DEVICE_NAME = 4;
    public static final int MESSAGE_TOAST = 5;

    // Key names received from the BluetoothCommunicationService Handler
    public static final String DEVICE_NAME = "device_name";
    public static final String TOAST = "toast";
    public static final String NOT_CONNECTED ="Not connected";
    public static final String DATA_ACCEPTED = "DATA_ACCEPTED!";
    public static final String DATA_NOT_ACCEPTED = "DATA_NOT_ACCEPTED!";
}
