package personal.arc.example.test.client;

import com.baidu.jprotobuf.pbrpc.spring.annotation.HaRpcProxy;
import org.springframework.stereotype.Service;
import personal.arc.example.share.api.EchoService;

/**
 * Created by Arc on 27/4/2016.
 */
@Service("echoServiceClient")
public class AnnotationEchoServiceClient {
    @HaRpcProxy(namingServiceBeanName = "namingService", serviceInterface = EchoService.class,
            lookupStubOnStartup = false)
    public EchoService haEchoService;

}

