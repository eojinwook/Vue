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
