# Checkpoin4Micro
Link docker hub repositório: https://hub.docker.com/repository/docker/guiengel23/checkpoint4/general
 
Guilherme Luis Engel RM 87438  
 
Gabriel dias Santiago RM 551406

## Para rodar o código:  
```
export DB_USER=root
export DB_PASSWORD=root_pwd
export DB_SERVER=localhost
export DB_PORT=3306
export DB_DATABASE=api

export $(cat .env | xargs)
env | grep DB_
```

## Para rodar com docker compose
```
docker compose up
docker compose down
```

## Para rodar com docker hub

```
docker pull guiengel23/checkpoint4:latest
docker run -p 8080:8080 guiengel23/checkpoint4:latest
```

