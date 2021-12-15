# ChosunMeal
------------
~~2021/08/27 최종배포 완료~~
<br>
(현재 서비스 종료)

## 개요
카카오톡 챗봇을 통해 식단을 알려주는 서비스
<br><br>

## 배경
식단을 확인하려면 직접 사이트에 접속하거나 식당에가서 번거롭게 확인해야되는 상황에 편리함을 주고자 만들게된 서비스
<br><br>

## 개발환경
![image](https://user-images.githubusercontent.com/76242399/146108931-b3749799-fd12-4788-9192-2c239ac4f876.png)


* Java
* Spring Boot
* MySQL
* AWS
<br><br>

## 구조도

<br><br>
![image](https://user-images.githubusercontent.com/76242399/146102831-44480228-f1ae-470e-9d9e-973da7f6a979.png)

## 기능
<div>
<img src="https://user-images.githubusercontent.com/76242399/146100264-588c0dc2-c088-48ad-84c8-d03af926cc01.png"  width="30%"/>
<img src="https://user-images.githubusercontent.com/76242399/146100301-44f51d88-7282-4250-9ea4-90b50a378a93.png"  width="30%"/>
</div>
<br><br>

## 진행사항
6 / 21
>   ( 조선대 식단 정보 크롤링 )

6 / 22
>   ( MariaDB 및 AWS )
- 크롤링 정보 List 생성
- MariaDB 설치 및 생성
- AWS ec2 연결 성공
- MariaDB 연결 테스트 성공

6 / 23
>   ( AWS RDS MariaDB 생성)
- ec2에서 mariaDB 연결
- jdbcMealRepository.class -> 로컬 mariaDB와 연결

6 / 24
> ( ec2에 프로젝트 업로드 )

7 / 29
> ( AWS RDS MariaDB 연결 )
- Mybatis 활용 학식 정보 DB 업로드
- 로컬호스트에 학식 메뉴 띄우기 성공

8 / 26
> ( ec2 JSON 형식 response 연결)
- @RequestBody 요청으로 ec2에서 응답 성공

8 / 27
> ( 카카오톡 챗봇 추가 및 배포)
- 카카오톡 챗봇에 스킬 추가
- 배포 완료.
- 채널 이름 -> (조선대 학식봇 (글로벌))
