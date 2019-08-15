package com.example.demo;

import mydemo.scheduler.mycustomendpoint.MyEndPointResponse;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="dHealthCheck", enableByDefault = true)
public class MyEndpoint {
    @ReadOperation
    public MyEndPointResponse features(){

        return new MyEndPointResponse(1231,"My End point is LIVE", "UP_and_Running");
    }
}