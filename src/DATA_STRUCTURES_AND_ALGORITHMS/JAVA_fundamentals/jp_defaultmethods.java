package DATA_STRUCTURES_AND_ALGORITHMS.JAVA_fundamentals;
interface camera{
    void snapshot();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("recording in 4K");
    }
}
interface wifi{
    String [] getnetyworks();
    void connectToNetwork(String network);
}
class cellPhone{
    void pickCall(){
        System.out.println("Connecting...");
    }
    void callNumber(int phoneNumber){
        System.out.println("calling "+phoneNumber);
    }
}class smartPhone extends cellPhone implements wifi,camera{
    public void snapshot(){
        System.out.println("taking snapshot");
    }public void recordVideo(){
        System.out.println("recording..");
    }public String[] getNetworks(){
        System.out.println("getting list of networks.");
        String[] networkList={"harry","harsh","saksham"};
        return networkList;
}public void record4KVideo(){
        System.out.println("recording in 4K");
    }

    @Override
    public String[] getnetyworks() {
        return new String[0];
    }

    public void connectToNetwork(String network){
    System.out.println("connecting to "+network);
    }
}
public class jp_defaultmethods {
    public static void main(String[] args) {
smartPhone sp  = new smartPhone();
String[] ar = sp.getNetworks();
    }
}
