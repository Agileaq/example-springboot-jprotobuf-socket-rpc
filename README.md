# example-springboot-jprotobuf-socket-rpc

用Springboot搭建
1. 基于SpringMVC 监听于8080端口的应用
2. 基于jprotoBuf 监听于1031端口的rpc应用

RPC使用方式：
1. 在intelliJ中引入gradle项目更新项目
2. 在intelliJ中安装lombok插件， 并enable annotation process
3. 找到App.java 文件， 跑main方法
4. 在控制台查看启动日志是否正常
5. 在mainapp模块下的test中运行RPCTest.

MVC使用方式：
打开浏览器：  http://localhost:8080 即可
