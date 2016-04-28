package personal.arc.example.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import personal.arc.example.share.param.EchoInfo;
import personal.arc.example.test.client.AnnotationEchoServiceClient;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arc on 26/4/2016.
 */
@Test
@ContextConfiguration({"classpath:exampleContext-test.xml"})
public class RPCTest extends AbstractTestNGSpringContextTests {

    @Resource(name = "echoServiceClient")
    AnnotationEchoServiceClient annotationEchoServiceClient;

    public void testEcho() {
        EchoInfo echoInfo = new EchoInfo();
        echoInfo.setMessage("Hello RPC!");
        Map<String, String> map = new HashMap<>();
        map.put("A", "AAA");
        map.put("B", "BBB");
        echoInfo.setMap(map);
        EchoInfo echoInfoReturn = annotationEchoServiceClient.haEchoService.echo(echoInfo);
        System.out.println(echoInfoReturn.getMessage());
        System.out.println(echoInfoReturn.getMap());
    }
}
