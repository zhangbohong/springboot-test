package com.myproject.common.dataSourceUntil;

import java.lang.annotation.*;

/**
 * 在方法上使用，用于指定使用哪个数据源
 *
 * @author 张博鸿
 * @version v.0.1
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String master = "master";
    String readonly = "readonly";

    String value();
}
