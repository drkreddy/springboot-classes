package com.example.demo;

import javax.validation.constraints.NotEmpty;

public class DemoRequest {
    @NotEmpty
    public String name;
    public int id;
}
