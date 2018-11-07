package cn.hit.hadoop.rpc;

import org.apache.hadoop.ipc.ProtocolSignature;

import java.io.IOException;

/**
 * Created by Administrator on 2018/10/16.
 */
public class LoginServiceImpl implements LoginServiceInterface {


    @Override
    public long getProtocolVersion(String protocol, long clientVersion) throws IOException {
        return LoginServiceInterface.versionID;
    }

    @Override
    public ProtocolSignature getProtocolSignature(String protocol, long clientVersion, int clientMethodsHash) throws IOException {
        return null;
    }

    @Override
    public String login(String username, String password) {
        return username + " logged in successfully!";
    }
}
