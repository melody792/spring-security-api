package com.imooc.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述:
 *
 * @author pzb
 * @create 2018-11-30 2:54 PM
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MyConstraintValidator.class)
public @interface MyValidConstraint {

    String message();

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
