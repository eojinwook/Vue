# 📦 Vue 기반 인사 ERP 시스템

## 📌 프로젝트 개요
이 프로젝트는 인사 ERP 시스템을 구현한 프로젝트로, 프론트엔드는 **Vue 3 + Pinia + Vuetify**,  
백엔드는 **Spring Boot + JPA + MyBatis**, 데이터베이스는 **Oracle**을 사용하였습니다.

인사 관리, 근태 관리, 급여 관리의 흐름을 체계적으로 구현하여 HR 업무를 전산화할 수 있도록 설계되었습니다.

---

## 📌 기술 스택
### 프론트엔드 (F/E)
- Framework: Vue 3
- 상태 관리: Pinia
- UI: Vuetify
- 주요 기능: 사원 조회/등록, 근태 관리 UI, 급여 생성 모달

### 백엔드 (B/E)
- Framework: Spring Boot
- ORM: JPA, MyBatis
- API 설계: RESTful API
- IDE: IntelliJ

### 데이터베이스 (DB)
- DBMS: Oracle
- Tool: SQL Developer

---

## 🔥 주요 기능
- ✅ 로그인 & 세션 관리
- ✅ 사원 등록/조회/수정/삭제 (CRUD)
- ✅ 근태 관리 (일근태/월근태 집계)
- ✅ 급여 생성 및 조회 (급여 모달 + 프로시저 연동)
- ✅ 초과수당, 상여금, 퇴직금 반영
- ✅ DTO ↔ Entity 변환 자동화 (MapStruct 활용)

---

## 🔗 시스템 흐름
1. 사원 관리 → 사원 등록/조회
2. 근태 관리 → 일근태 집계 → 월근태 집계
3. 급여 관리 → 급여 생성 모달 → 급여 저장/조회

🛠 덤프 파일 넣는 방법

1️⃣ SQL*Plus 접속

sqlplus /nolog

아래 명령어를 시도하여 접속

conn / as sysdba

2️⃣ 사용자 생성 및 권한 부여

CREATE USER 계정명 IDENTIFIED BY 비밀번호 DEFAULT TABLESPACE system;

GRANT CONNECT, RESOURCE, DBA TO 계정명;

✅ 예시

CREATE USER reactproject IDENTIFIED BY reactproject DEFAULT TABLESPACE system;

GRANT CONNECT, RESOURCE, DBA TO reactproject;

3️⃣ 사용자 계정으로 접속

conn 계정명/비밀번호

✅ 예시

conn reactproject/reactproject

이후 SQLPLUS 종료

exit

4️⃣ 덤프 파일 복원

imp userid=계정명/비밀번호 file="C:\경로\파일명.dmp" full=y;

✅ 예시

imp userid=reactproject/reactproject file="C:\Users\wjdgj\OneDrive\바탕 화면\It Project\reactLogi\react.dmp" full=y;

🛠 Front-End 설치 명령어 후 실행 명령어

1.npm install -g pnpm

2.pnpm install

3.pnpn run dev