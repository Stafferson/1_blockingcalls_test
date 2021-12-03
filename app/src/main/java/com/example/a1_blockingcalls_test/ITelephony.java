//package com.example.a1_blockingcalls_test;
package com.android.internal.telephony;

public interface ITelephony {
    boolean endCall();
    void answerRingingCall();
    void silenceRinger();
}
