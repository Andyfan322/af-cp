基于Eureka和Consul的集群，编写的简单的提供者和消费者的简单示例。

* 配置到hosts文件中
    * 127.0.0.1 server-registry0
    * 127.0.0.1 server-registry1
    * 127.0.0.1 server-registry2
    * 127.0.0.1 server-registry3
    
* 下载eureka集群工程到本地[示例]。(https://github.com/Andyfan322/af_erueka_server)
* 安装Consul 集群，docker Hub上有个[image](https://hub.docker.com/r/progrium/consul/) 可以参考下
* 分别启动四个服务    