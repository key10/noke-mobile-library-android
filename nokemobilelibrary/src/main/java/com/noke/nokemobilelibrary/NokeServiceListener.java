package com.noke.nokemobilelibrary;

/**
 * Created by Spencer on 1/19/18.
 * Listener for handling callbacks from NokeService
 */

public interface NokeServiceListener  {

    void onNokeDiscovered(NokeDevice noke);

    void onNokeConnecting(NokeDevice noke);

    void onNokeConnected(NokeDevice noke);

    void onNokeSyncing(NokeDevice noke);

    void onNokeUnlocked(NokeDevice noke);

    void onNokeDisconnected(NokeDevice noke);

    void onBluetoothStatusChanged(int bluetoothStatus);

    void onError(NokeDevice noke, int error, String message);

}
