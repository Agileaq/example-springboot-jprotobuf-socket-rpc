package personal.arc.example.test;

import com.baidu.jprotobuf.pbrpc.client.ProtobufRpcProxy;
import com.baidu.jprotobuf.pbrpc.transport.RpcClient;
import personal.arc.example.share.api.EchoService;
import personal.arc.example.share.param.EchoInfo;

/**
 * Created by Arc on 27/4/2016.
 */
public class MainTest {
    public static void main(String args[]) {
        RpcClient rpcClient = new RpcClient();
// 创建EchoService代理
        ProtobufRpcProxy<EchoService> pbrpcProxy = new ProtobufRpcProxy<EchoService>(rpcClient, EchoService.class);
        pbrpcProxy.setPort(1031);
// 动态生成代理实例
        EchoService echoService = pbrpcProxy.proxy();
        EchoInfo request = new EchoInfo();
        request.setMessage("hello");
        EchoInfo response = echoService.echo(request);
        System.out.println(response.getMessage());
        rpcClient.stop();
    }
}
