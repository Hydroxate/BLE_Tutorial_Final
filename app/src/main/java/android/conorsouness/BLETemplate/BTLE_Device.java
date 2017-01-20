package android.conorsouness.BLETemplate;

import android.bluetooth.BluetoothDevice;

/**
 * Created by Conor on 12/1/17.
 */
public class BTLE_Device {

    private BluetoothDevice bluetoothDevice;
    private int rssi;

    public BTLE_Device(BluetoothDevice bluetoothDevice) {
        this.bluetoothDevice = bluetoothDevice;
    }

    public String getAddress() {
        return bluetoothDevice.getAddress();
    }

    public String getName() {
        return bluetoothDevice.getName();
    }

    public BluetoothDevice getBluetoothDevice() { return bluetoothDevice;}

    public void setRSSI(int rssi) {
        this.rssi = rssi;
    }

    public int getRSSI() {
        return rssi;
    }
}
