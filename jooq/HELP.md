# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

###在 \src\main\resources\jooq\jooq.xml 文件中配置需要映射的数据库以及表信息
在pom.xml 文件中的profiles中加载相关配置文件

最后在控制台执行 mvn clean install -Pdb
其中 "-P" 为参数 "db"为prifile配置的id

