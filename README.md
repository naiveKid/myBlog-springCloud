# blogcloud

服务注册发现中心：

> eureka-server

----------

配置中心：

> config-server

----------

服务监控中心：

> spring-admin

----------

外部访问组件：

> api-gateway 为网关服务、鉴权。负责页面渲染和服务调用。session传递使用JWT

----------
服务提供组件：

> blog-base 为基础模块。提供公共的实体类和工具类等。

> user-service 为用户服务。负责后台和用户相关模块

> blog-service 为网站服务。负责网站前台相关功能的接口调用