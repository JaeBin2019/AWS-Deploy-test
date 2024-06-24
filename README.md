# AWS-Deploy-test
AWS deploy test repository

# Spring Boot Test
cd spring-boot-test/
export $(grep -v '^#' src/main/resources/db.env | xargs)   =>   testenv.txt 수정해서 직접 만들어야 함

./gradlew clean build
nohup java -jar build/libs/spring-boot-test-0.0.1-SNAPSHOT.jar &> application.log & => 백그라운드에서 어플리케이션 실행
nohup java -jar build/libs/app.jar &> application.log & => 백그라운드에서 어플리케이션 실행

ps aux | grep app.jar     =>  실행중인 spring boot process 확인



# React Test
npm run build

build 폴더를 S3에 업로드
버튼을 클릭시 api 에서 cors 에러가 나는 지 체크할 수 있다