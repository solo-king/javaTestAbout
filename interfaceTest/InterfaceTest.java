
/**账号记录类 */
class AccountInfo{

    private String hostAddress;

    AccountInfo(String hostAddress){
        this.hostAddress = hostAddress;
    }

    public String getHostAddress(){

        return hostAddress;
    }

    public void setHostAddress(String address){
        
        hostAddress =  address;
    }

    @Override
    public String toString(){

        return "[hostAddress]"+hostAddress;
    }
}

interface RemoteClient{

    int connect(AccountInfo Info);
    int disconnect();
    int sendMsgToService(String msg);

}

interface RemoteConnector{

    RemoteClient connect(AccountInfo account);
    void disconnect(RemoteClient client);
}

/**Mqtt相关 */
class MqttRemoteClient implements RemoteClient{

    @Override
    public int connect(AccountInfo info){

        System.out.println("connect:"+info.toString());
        return 0;
    }
    @Override
    public int sendMsgToService(String msg){

        System.out.println("sendMsgToService:[msg]"+msg);
        return 0;
    }
    @Override
    public int disconnect(){

        System.out.println("disconnect");
        return 0;
    }
}

/**Mqtt服务端连接器 */
class MqttRemoteConnector implements RemoteConnector {

    @Override
    public RemoteClient connect(AccountInfo account){
        
        MqttRemoteClient client = new MqttRemoteClient();
        client.connect(account);
        return client;
    }

    @Override
    public void disconnect(RemoteClient client){

        client.disconnect();
    }

}

class InterfaceTest{

    public static void main(String[] args){
        
        MqttRemoteConnector connector = new MqttRemoteConnector();
        AccountInfo acount = new AccountInfo("127.0.0.1");
        RemoteClient mqttClient = connector.connect(acount);

        mqttClient.sendMsgToService("ganye is best!!!");

        connector.disconnect(mqttClient);
    }
}