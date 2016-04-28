package personal.arc.example.test;

import com.baidu.jprotobuf.pbrpc.EchoInfo;
import com.baidu.jprotobuf.pbrpc.EchoService;
import com.baidu.jprotobuf.pbrpc.EchoServiceImpl;
import com.baidu.jprotobuf.pbrpc.client.ProtobufRpcProxy;
import com.baidu.jprotobuf.pbrpc.transport.RpcClient;
import com.baidu.jprotobuf.pbrpc.transport.RpcServer;

/**
 * Created by Arc on 27/4/2016.
 */
public class PureCodeTest {
    public static void main(String args[]) {
        RpcServer rpcServer = new RpcServer();
        EchoServiceImpl echoServiceImpl = new EchoServiceImpl();
        rpcServer.registerService(echoServiceImpl);
        rpcServer.start(1031);

        RpcClient rpcClient = new RpcClient();
// 创建EchoService代理
        ProtobufRpcProxy<EchoService> pbrpcProxy = new ProtobufRpcProxy<EchoService>(rpcClient, EchoService.class);
        pbrpcProxy.setPort(1031);
// 动态生成代理实例
        EchoService echoService = pbrpcProxy.proxy();
        EchoInfo request = new EchoInfo();
        request.setMessage("hello");
        EchoInfo response = echoService.businessExceptionCall(request);
        EchoInfo response2 = echoService.echo(request);
        System.out.println(response.getMessage());
        rpcClient.stop();

    }
}
