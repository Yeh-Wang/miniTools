# miniTools
***

## 部署

在使用该工具时你需要确保你的项目使用的是JDK 17。然后按照下面的步骤将该jar依赖放到你自己的项目中。

### 下载jar包
### Maven导入
```xml
        <dependency>
            <groupId>yeh</groupId>
            <artifactId>miniTools</artifactId>
            <version>1.0-SNAPSHOT</version>
            <scope>system</scope>
            <systemPath>${project.basedir}/src/main/resources/miniTools-1.0-SNAPSHOT.jar</systemPath>
        </dependency>
```
* groupId: 随意起名
* artifactId: 随意起名
* version: 1.0-SNAPSHOT 也是随意版本号
* scope: system
* systemPath: 你的jar包的路径，必须得有${project.basedir}，否则会报错
***
### Maven打包  maven打包不会将这个jar包含进去，你需要在pom.xmzhong配置：
```xml
<build>
    <resources>
        <resource>
            <directory>src/main/resources</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
                <include>**/*.jar</include>
            </includes>
        </resource>
    </resources>
</build>
```
* directory: 你的jar包的路径
* includes: 你的jar包的名字

这样你就可以在你的项目中使用jar包含的工具类了。

** 使用
你可以查看我们的接口文档来使用我们的工具类。[接口文档](Doc/index.html)
