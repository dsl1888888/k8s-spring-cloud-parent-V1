# k8s-spring-cloud-parent-V1 ,k8s , 引入外部Eureka
k8s-spring-cloud-parent-V1


# 文档地址
````
http://5.34.180.96:1234/showdoc1234/web/#/1?page_id=606
````


# 参照文件；网络检索关键字：k8s-spring-cloud-csdn      , java-learn-master , java learn
````
参考：

https://github.com/CodingSoldier/java-learn/tree/master/project/k8s-spring-cloud-csdn

https://github.com/CodingSoldier/java-learn
````



# 测试地址

````

#eureka
http://us01.tool1314.com:30001/

#basic service
http://us01.tool1314.com:30012/test02/get

http://us01.tool1314.com:30011/test01/get


#zuul service
curl http://us01.tool1314.com:30005/app02/test02/get

curl http://us01.tool1314.com:30005/app01/test01/get


curl http://localhost:30005/app02/test02/get

curl http://localhost:30005/app01/test01/get

````



# k8s , 引入外部Eureka
````
https://github.com/dsl1888888/eureka-on-kubernetes

````

````
git clone https://github.com/dsl1888888/eureka-on-kubernetes

cd eureka-on-kubernetes

microk8s.kubectl apply -f k8s-eureka-prod.yml

````