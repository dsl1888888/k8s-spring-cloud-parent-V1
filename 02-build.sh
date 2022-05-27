cd /opt/k8s-spring-cloud-parent



rm -rf /opt/k8s-spring-cloud-parent/app01/docker-k8s/*.jar
rm -rf /opt/k8s-spring-cloud-parent/app02/docker-k8s/*.jar
rm -rf /opt/k8s-spring-cloud-parent/demo-springcloud-zuul/docker-k8s/*.jar


mvn clean install -DskipTests=true



cd /opt/k8s-spring-cloud-parent/app01/docker-k8s

rm -rf *.jar
cp /opt/k8s-spring-cloud-parent/app01/target/app01.jar .

docker build -f Dockerfile -t codingsoldier/app001:latest .
docker tag  codingsoldier/app001:latest localhost:32000/codingsoldier/app001:latest
docker push localhost:32000/codingsoldier/app001:latest

cd /opt/k8s-spring-cloud-parent/app02/docker-k8s

rm -rf *.jar
cp /opt/k8s-spring-cloud-parent/app02/target/app02.jar .

docker build -f Dockerfile -t codingsoldier/app002:latest .
docker tag  codingsoldier/app002:latest localhost:32000/codingsoldier/app002:latest
docker push localhost:32000/codingsoldier/app002:latest


cd /opt/k8s-spring-cloud-parent/demo-springcloud-zuul/docker-k8s

rm -rf *.jar
cp /opt/k8s-spring-cloud-parent/demo-springcloud-zuul/target/demo-springcloud-zuul-0.0.1-SNAPSHOT.jar .

docker build -f Dockerfile -t codingsoldier/api-gateway:latest .
docker tag  codingsoldier/api-gateway:latest localhost:32000/codingsoldier/api-gateway:latest
docker push localhost:32000/codingsoldier/api-gateway:latest

 

microk8s.kubectl apply  -f /opt/k8s-spring-cloud-parent/app01/docker-k8s/k8s-app01.yaml
microk8s.kubectl apply  -f /opt/k8s-spring-cloud-parent/app02/docker-k8s/k8s-app02.yaml
microk8s.kubectl apply  -f /opt/k8s-spring-cloud-parent/demo-springcloud-zuul/docker-k8s/k8s-api-gateway.yaml

