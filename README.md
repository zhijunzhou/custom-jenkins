# Custom docker offical jenkins images

If you are ready to use docker official [jenkins](https://github.com/jenkinsci/docker) images, but you can not automatically create an administrator account, and preinstall some plugins you like. The repo will help you to achieve your goal.

After run this image, you will get a customized official jenkins application mounted on the docker container. Meanwhile, you will get an initialized administator account(admin/admin), and some preinstall [plugins](./plugins.txt).

## Usage

```shell
$ docker run -d --name jenkins -p 8080:8080 -p 50000:50000 zhijunzhou/jenkins
```

## Default Administrator Account

username: admin
password: admin

## View jenkins logs

```shell
$ docker logs jenkins
```

## Stop jenkins instance

```shell
$ docker stop jenkins
$ docker rm jenkins
// remove unused containers and images
$ docker system prune
// remove images
$ docker rmi cjenkins
```

## Reference from 

https://github.com/geerlingguy/ansible-role-jenkins/issues/50

## docker hub
https://hub.docker.com/r/zhijunzhou/jenkins/
