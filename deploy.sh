local='/home/wesley'

cd "$local/Projects/privacy-workshop"

docker-compose stop
docker rm privacyworkshop_myapp_1
docker rmi privacyworkshop_myapp

mvn clean install

docker-compose up -d

