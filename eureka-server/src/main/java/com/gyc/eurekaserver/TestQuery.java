package com.gyc.eurekaserver;

@RestController
@RequestMapping("/query")
public class TestQuery {
    @Autowired
    EurekaClientConfigBean eurekaClientConfigBean;

    @GetMapping("/eureka-server")
    public Object getEurekaServerUrl(){
        return eurekaClientConfigBean.getServiceUrl();
    }
}
