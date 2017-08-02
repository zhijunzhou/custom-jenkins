# Custom offical jenkins images

## Build docker file

```shell
$ docker build -t cjenkins .
```

## Run docker container

```shell
$ docker run -d --name jenkins -p 8080:8080 -p 50000:50000 cjenkins
```

## Custom Jenkins Administrator Account

username: admin
password: admin

## View jenkisn logs

```shell
$ docker logs jenkins
```

## Stop jenkins instance

```shell
$ docker stop jenkins
$ docker rm jenkins
$ docker system prune
$ docker rmi cjenkins
```

## Reference from 

https://github.com/geerlingguy/ansible-role-jenkins/issues/50

## docker hub
https://hub.docker.com/r/zhijunzhou/jenkins/
