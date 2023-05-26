<!--
 * @Description:
 * @FilePath: \README.md
 * @Author: hhrwvyy5654v huang_rongquan@outlook.com
 * @Date: 2023-05-17 18:04:27
 * @LastEditors: hhrwvyy5654v huang_rongquan@outlook.com
 * @LastEditTime: 2023-05-17 18:04:46
 * Copyright (c) 2023 by hhrwvyy5654v , All Rights Reserved.
-->

在一个 Java 项目中，通常会有以下几种组件：

1. Controller：控制器，负责接收用户的请求并调用 Service 层处理业务逻辑，然后返回响应结果。Controller 通常使用 Spring MVC、Struts2 等框架来实现。

2. Service：服务层，负责处理业务逻辑，与 DAO 层交互，并返回处理结果。Service 通常使用 Spring 框架来实现。

3. DAO：数据访问层，负责与数据库进行交互，执行数据的增删改查操作。DAO 通常使用 MyBatis、Hibernate 等框架来实现。

4. Model：模型层，负责定义数据模型，包括实体类、DTO（Data Transfer Object）等。Model 通常使用 JavaBean 来实现。

5. Interceptor：拦截器，负责拦截请求，对请求进行预处理或进行权限验证等操作。Interceptor 通常使用 Spring 框架来实现。

6. Util：工具类，负责提供一些公共的工具方法，如日期转换、字符串处理等。Util 通常是一个静态类，不需要实例化。

这些组件各自负责不同的功能，通过相互配合，完成了整个 Java 项目的开发和运行。
