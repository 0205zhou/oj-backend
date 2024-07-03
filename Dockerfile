# Docker 镜像构建
# @author <a href="https://www.snowyee.cn">程序媛雪儿</a>
FROM maven:3.8.1-jdk-8-slim as builder
# 作者
MAINTAINER snowyee
# VOLUME 指定临时文件目录为/tmp，在主机/var/lib/docker目录下创建了一个临时文件并链接到容器的/tmp
VOLUME /tmp
# 将jar包添加到容器中并更名为zzyy_docker.jar
ADD oj_snowyee_backend-0.0.1-SNAPSHOT.jar oj_snowyee_backend.jar
# 运行jar包
RUN bash -c 'touch /oj_snowyee_backend.jar'
ENTRYPOINT ["java","-jar","/oj_snowyee_backend.jar"]
#暴露8802端口作为微服务
EXPOSE 8802