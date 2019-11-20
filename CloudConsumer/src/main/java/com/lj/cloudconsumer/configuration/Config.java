package com.lj.cloudconsumer.configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Configuration
public class Config {

    @LoadBalanced //负载均衡
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule() {
//        return new RoundRobinRule();
//        return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
//        return new RetryRule();
//        return new AbstractLoadBalancerRule() {
//            private AtomicInteger nextServerCyclicCounter;
//
//            public Server choose(ILoadBalancer lb, Object key) {
//                if (lb == null) {
//                    System.err.println("no load balancer");
//                    return null;
//                }
//
//                Server server = null;
//                int count = 0;
//                while (server == null && count++ < 10) {
//                    List<Server> reachableServers = lb.getReachableServers();
//                    List<Server> allServers = lb.getAllServers();
//                    int upCount = reachableServers.size();
//                    int serverCount = allServers.size();
//
//                    if ((upCount == 0) || (serverCount == 0)) {
//                        System.err.println("No up servers available from load balancer: " + lb);
//                        return null;
//                    }
//
//                    int nextServerIndex = incrementAndGetModulo(serverCount);
//                    server = allServers.get(nextServerIndex);
//
//                    if (server == null) {
//                        /* Transient. */
//                        Thread.yield();
//                        continue;
//                    }
//
//                    if (server.isAlive() && (server.isReadyToServe())) {
//                        return (server);
//                    }
//
//                    // Next.
//                    server = null;
//                }
//
//                if (count >= 10) {
//                    System.err.println("No available alive servers after 10 tries from load balancer: "
//                            + lb);
//                }
//                return server;
//            }
//
//            /**
//             * Inspired by the implementation of {@link AtomicInteger#incrementAndGet()}.
//             *
//             * @param modulo The modulo to bound the value of the counter.
//             * @return The next value.
//             */
//            private int incrementAndGetModulo(int modulo) {
//                for (; ; ) {
//                    int current = nextServerCyclicCounter.get();
//                    int next = (current + 1) % modulo;
//                    if (nextServerCyclicCounter.compareAndSet(current, next))
//                        return next;
//                }
//            }
//
//            public Server choose(Object key) {
//                return choose(getLoadBalancer(), key);
//            }
//
//            public void initWithNiwsConfig(IClientConfig clientConfig) {
//            }
//        };
//    }
}
