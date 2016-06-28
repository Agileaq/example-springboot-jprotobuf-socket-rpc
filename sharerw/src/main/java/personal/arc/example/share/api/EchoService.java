package personal.arc.example.share.api;

import com.baidu.jprotobuf.pbrpc.ProtobufRPC;
import personal.arc.example.share.param.EchoInfo;

/**
 * Created by Arc on 26/4/2016.
 */
public interface EchoService {

    @ProtobufRPC(serviceName = "echoService", onceTalkTimeout=10000)
    EchoInfo echo(EchoInfo info);

}
