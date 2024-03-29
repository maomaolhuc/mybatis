//package com.lhuc.config;
//
//import com.alibaba.fastjson.serializer.SerializerFeature;
//import com.alibaba.fastjson.support.config.FastJsonConfig;
//import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
//import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.HttpMessageConverter;
//
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author lhucstart
// * @create 2021-05-12 11:26
// */
//@Configuration
//public class WebConfig {
//    /**
//     * @return 返回一个消息转换的bean
//     * @Author anson
//     * @Description 配置消息转换器
//     * @Date: 2019-12-8 11:23:33
//     * @version: 1.0
//     * new HttpMessageConverters(true, converters);
//     * 一定要设为true才能替换否则不会替换
//     */
//    @Bean
//    public HttpMessageConverters fastJsonMessageConverters() {
//        List<HttpMessageConverter<?>> converters = new ArrayList<>();
//        //需要定义一个convert转换消息的对象;
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//        //添加fastJson的配置信息;
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        //全局时间配置
//        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
//        fastJsonConfig.setCharset(Charset.forName("UTF-8"));
//        //处理中文乱码问题
//        List<MediaType> fastMediaTypes = new ArrayList<>();
//        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//        //在convert中添加配置信息.
//        fastConverter.setSupportedMediaTypes(fastMediaTypes);
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//
//        converters.add(0, fastConverter);
//        return new HttpMessageConverters(converters);
//    }
//}
