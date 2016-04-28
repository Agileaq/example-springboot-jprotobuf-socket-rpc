package personal.arc.example.rpc.service.impl;

import com.baidu.jprotobuf.pbrpc.ProtobufRPCService;
import com.baidu.jprotobuf.pbrpc.spring.annotation.RpcExporter;
import org.springframework.stereotype.Component;
import personal.arc.example.share.param.EchoInfo;

/**
 * Created by Arc on 26/4/2016.
 */
@Component
@RpcExporter(port = "1031")
public class EchoServiceImpl {

    @ProtobufRPCService(serviceName = "echoService")
    public EchoInfo echo(EchoInfo info) {
        EchoInfo ret = new EchoInfo();
        ret.setMessage("hello:" + info.message);
        ret.setMap(info.getMap());
        System.out.println("hello:" + info.message);
        System.out.println(ret.getMap());
        return ret;
    }

    @ProtobufRPCService(serviceName = "echoService")
    public EchoInfo echo2(EchoInfo info) {
        EchoInfo ret = new EchoInfo();
        ret.setMessage("hello:" + info.message);
        ret.setMap(info.getMap());
        return ret;
    }
}
