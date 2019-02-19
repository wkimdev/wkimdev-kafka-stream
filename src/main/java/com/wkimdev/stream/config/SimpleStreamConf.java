package com.wkimdev.stream.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.wkimdev.stream.SimpleStreams;

/*
 * simple stream을 autowired 시켜주기 위해 바인딩 해주는 녀석 
 */
@EnableBinding(SimpleStreams.class)
public class SimpleStreamConf {

}
