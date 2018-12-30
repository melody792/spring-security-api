package com.imooc.validator;

import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 描述:
 *
 * @author pzb
 * @create 2018-11-30 2:54 PM
 */
public class MyConstraintValidator implements ConstraintValidator<MyValidConstraint,Object> {

    //@Autowired
    //private HelloService helloService;

    /**
     * 校验器初始化
     * @param constraintAnnotation
     */
    @Override
    public void initialize(MyValidConstraint constraintAnnotation) {
        System.out.println("MyConstraintValidator--init ");
    }

    /**
     * 真正的校验方法
     * @param value
     * @param context
     * @return
     */
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        //helloService.greeting("tom");
        System.out.println(value);
        return false;
    }
}