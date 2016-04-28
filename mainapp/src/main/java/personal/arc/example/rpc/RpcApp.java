package personal.arc.example.rpc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Arc on 26/4/2016.
 */
@Configuration
@ComponentScan(basePackages = "personal.arc.example.rpc.service.impl")
@ImportResource("classpath:exampleContext.xml")
public class RpcApp {
}
