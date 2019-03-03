# demo-eureka-client
Demo project for Spring Cloud Eureka Client

## Eureka 客户端的配置主要分为两方面：
- `eureka.client`: **服务注册**相关的配置信息：服务注册中心的地址、服务获取的间隔时间、可用区域等。
- `eureka.instance`: **服务实例**相关的配置信息：服务实例的名称、IP地址、端口号、健康检查路径等。

### Eureka Client 常用配置参考
```yaml
eureka:
  client:
    fetch-registry: true # 是否从注册中心获取注册的信息
    register-with-eureka: true # 是否将自己的实例信息注册到注册中心
    registry-fetch-interval-seconds: 30 # 从注册中心拉取注册信息的间隔
    initial-instance-info-replication-interval-seconds: 40 # 初始化实例信息到注册中心的间隔
    instance-info-replication-interval-seconds: 30 # 更新实例变化信息到注册中心的间隔
    eureka-server-connect-timeout-seconds: 5 # 连接注册中心的超时时间
    eureka-server-read-timeout-seconds: 8 # 读取注册中心信息的超时时间
    eureka-service-url-poll-interval-seconds: 300 # 轮询注册中心地址更改的间隔
    eureka-server-total-connections: 200 # eureka 客户端到所有注册中心的连接总数
    eureka-server-total-connections-per-host: 50 # eureka 客户端到每个注册中心主机的连接总数
    eureka-connection-idle-timeout-seconds: 30 # eureka 客户端连接的空闲关闭时间
    heartbeat-executor-thread-pool-size: 2 # 心跳连接池的初始化线程数
    heartbeat-executor-exponential-back-off-bound: 10 # 心跳超时重试延迟时间的最大乘数值
    cache-refresh-executor-thread-pool-size: 2 # 缓存刷新线程池的初始化线程数
    cache-refresh-executor-exponential-back-off-bound: 10 # 缓存刷新超时重试延迟时间的最大乘数值
    use-dns-for-fetching-service-urls: false # 使用 DNS 来获取注册中心的 serviceUrl
    prefer-same-zone-eureka: true # 是否偏好使用处于相同 Zone 的注册中心
    filter-only-up-instances: true # 获取实例时是否过滤，仅保留 UP 状态的实例
    serviceUrl:
      defaultZone: http://39.105.99.4:8761/eureka/, http://39.106.44.105:8761/eureka/
```
更多详细配置请参考配置类：`org.springframework.cloud.netflix.eureka.EurekaClientConfigBean`