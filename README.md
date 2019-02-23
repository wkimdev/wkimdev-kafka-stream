# wkimdev-kafka-stream
- kafka stream prototype project
- kafka stream 서비스에 대한 프로토타입 프로젝트 입니다. 


# kafka 활용
- 메시징 시스템과 같은 데이터 스트림 게시 및 구독
- 주요한 일은 스트리밍 데이터의 실시간 처리를 수행 할 수있는 기능을 제공하는 것

## redis vs kafka vs rabbitMQ  
  
```
## redis
- Redis is an open source, advanced key-value store and an apt solution for building highperformance, scalable web applications.
- 사용자가 방문한 적이없는 새로 생성 된 URL을 방문하면 DB에 의해 처리되지만 HTML 응답은 redis로 캐시
- redis 는 데이터베이스, 캐시 및 메시지 브로커 
- 메모리 데이터 구조 저장소 
- redis는 게시 / 가입 메시징 시스템으로도 사용됩니다. 분산 된 작업 대기열에 대한 메시지 브로커뿐만 아니라 간단한 채팅 응용 프로그램에서도 활용되는
- redis가하는 주요한 일은 빠른 메모리 내장 데이터 구조 저장소이며, 이와 같이 주로 캐싱 관련 시나리오에서 볼 수 있습니다. 그러나 릴리스 3 이후에는 많은 기능이 추가되었으며 redis는 이제 RabbitMQ 영역으로 넘어가는 게시 / 가입 메시징 시스템으로 널리 사용됩니다.

# kafka활용
- 메시징 시스템과 같은 데이터 스트림 게시 및 구독
- 주요한 일은 스트리밍 데이터의 실시간 처리를 수행 할 수있는 기능을 제공하는 것

# rabbitMQ 
- 가장 널리 배포된 오픈 소스 메세지 브로커 
-  메시징 큐를 제공합니다. 게시 / 구독 및 작업 대기열 솔루션을 구축하는 데 사용할 수 있습니다. 
- 메시지 수신 확인을 지원
- 그렇게하면 근로자가 간혹 사망하더라도 메시지를 잃어 버리지 않을 것입니다.
```
