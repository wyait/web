# web
[springboot 创建父子工程、聚合工程:]  
博客地址：

开发工具：IntellJ IDEA 2017  

### 项目名称
wyait父工程【父】：wyait-parent（用于统一依赖版本管理）
wyait通用工程【子】：wyait-common（统一保存通用工具类）
wyait-web工程【子】：wyait-web（聚合工程）  

### 项目框架简述

wyait-web 项目框架设计简述：
 
-	wyait-web-pojo：保存pojo和entity实体类；
-	wyait-web-dao：数据访问层，与底层 MySQL进行数据交互(依赖pojo)；
-	wyait-web-service：相对具体的业务逻辑服务层(依赖mapper/pojo)；
-	wyait-web-controller：对访问控制进行转发，各类基本参数校验，或者不复用的业务简单处理等（依赖service/pojo）；
-	wyait-web-webapp：项目启动Application类、配置类、静态资源文件（依赖controller/pojo）。

