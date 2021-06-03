package com.pengchun.spring.CircularDependency;

//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.Signature;
//import org.aspectj.lang.annotation.*;
//import org.aspectj.lang.reflect.SourceLocation;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author 彭淳
 * @Date 2021/4/18
 */
//@Aspect
@Component
public class AspectA {

    //@Pointcut("execution(* com.pengchun.spring.CircularDependency.StudentA.run())")
    public void a() {

    }

    //@Before("a()")
    public void aspectPointcut() {
        System.out.println("aop success");
    }
}
