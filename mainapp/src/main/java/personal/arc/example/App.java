package personal.arc.example;

import org.springframework.boot.SpringApplication;
import personal.arc.example.restful.RestApp;
import personal.arc.example.rpc.RpcApp;

/**
 * Created by Arc on 26/4/2016.
 */
public class App {

    public static void main(String[] args) throws Exception {
        //Object[] objs = {RestApp.class};
        Object[] objs = {RestApp.class, RpcApp.class};
        SpringApplication.run(objs, args);
    }

}
