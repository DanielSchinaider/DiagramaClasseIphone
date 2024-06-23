package model;

public interface Telephone {

    void answerCall();

    void endCall();

    void makeCall(String number);

    void startVoiceMail(String number);

    void sendMessage(String number, String message);
}
