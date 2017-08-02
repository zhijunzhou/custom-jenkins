# Custom docker offical jenkins images

If you are ready to use docker official jenkins images, but you can not automatically create an administrator account, and preinstall some plugins you like. The repo will help you to achieve your goal.

After run this image, you will get a customized official jenkins application mounted on the docker container. Meanwhile, you will get an initialized administator account(admin/admin), and some preinstall [plugins](./plugins.txt).

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
