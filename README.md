# 예약 맛집, 예맛

- 배포 URL : http://docs.yi.or.kr:3015/home
- test ID : admin<br>
- test PW : 222

<br>

<details open="open">
<summary>목록보기</summary>
<ol>
<li>
<a href="#개요">개요</a>
</li>
<li>
<a href="#내용">내용</a><br>
</li>
<li>
<a href="#avatar">구현 페이지</a>
<ul>
<li><a href="#main">메인 페이지</a></li> 
<li><a href="#search">검색 페이지</a></li> 
<li><a href="#notice">공지사항 페이지</a></li> 
<li><a href="#event">이벤트 페이지</a></li> 
<li><a href="#restdetail">가게 상세보기 페이지</a></li> 
<li><a href="#mypage">마이 페이지</a></li> 
<li><a href="#ownerpage">점주 페이지</a></li> 
<li><a href="#manager">관리자 페이지</a></li> 
<li><a href="#login">로그인 페이지</a></li> 
<li><a href="#singup">회원가입 페이지</a></li> 
</ul>
</li>
</ol>
</details>

## 프로젝트 소개
- 대구시 내에 있는 맛집들의 정보와 위치를 제공합니다.<br>
- 맛집 검색을 할 수 있으며 원하는 맛집을 예약을 할 수 있습니다.

## 개요
💡 프로젝트 명 : 예맛<br><br>
⭐ 프로젝트 인원 : 5명<br><br>
🚩 프로젝트 기간 : 2024년 1월 ~ 2024년 3월 (총 2달)<br><br>

내가 맡은 역할 : 관리자 페이지

⌨️ **개발 환경 :**<br><br>
  ![Linux](https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)
  ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
  ![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)<br><br>

⌨ **사용된 기술 스택 :** <br><br>
  ![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)
  ![Bootstrap](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)
  ![HTML](https://img.shields.io/badge/HTML-239120?style=for-the-badge&logo=html5&logoColor=white)
  ![CSS](https://img.shields.io/badge/CSS-239120?&style=for-the-badge&logo=css3&logoColor=white)
  ![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white)
  ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
  ![jQuery](https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white)<br><br>

## 내용

<h3>데이터베이스 구조</h3>

![Database Structure](https://github.com/doyeon27/project01/assets/149025529/be8ca77f-cd19-46c6-8ea2-f53d1794c569)

<br><br>

<h3>사이트 맵</h3>

![Site Map](https://github.com/doyeon27/project01/assets/149025529/9f3f99de-bfdf-4a48-b4f1-03742181341f)

<br>

[//]: # (## 구현_페이지)
<h2 id="avatar">구현 페이지</h2>

<h3 id="main">메인 페이지</h3>

![Main Screen](https://github.com/doyeon27/project01/assets/149025529/3028641a-08ef-4d01-98f3-5af53630db4f)

» 구현 기능<br>

    * 예맛 프로젝트의 메인 페이지

    * 예약 많은 순, 추천순, 카테고리 별로 맛집 추천

    * 웹사이트 로고 클릭을 통해 메인 페이지로 이동

    * 검색 기능 구현

    * 고객, 점주, 관리자 별로 마이페이지, 점주 페이지, 관자페이지 클릭 가능

    * 실시간 날씨 정보와, 알림 기능 구현


<h3 id="search">검색 페이지</h2>

![Search Screen](https://github.com/doyeon27/project01/assets/149025529/19126cf8-2856-4117-a1f9-625a738bfbc4)

» 구현 기능<br>

    * 예맛 프로젝트의 검색 페이지

    * 화면 우측 상단에 검색어를 입력하면 실시간 검색 기능 구현

    * 업태별 필터 기능 구현

    * 평점, 리뷰, 예약 필터 기능 구현

    * 지도에 마커 기능 구현

<h3 id="notice">공지사항 페이지</h3>

![Notice](https://github.com/doyeon27/project01/assets/149025529/f11f78a3-2ba1-4bd2-9081-95a1d98c4402)

» 구현 기능<br>

    * 예맛 프로젝트의 공지사항 페이지

    * 고정 공지사항, 일반 공지사항 분류 기능 구현

    * 각 공지사항 게시글 클릭 시 상세보기 이동 가능

    * 페이징을 통해 공지사항 목록 넘기기


<h3 id="event">이벤트 페이지</h3>

![Event](https://github.com/Hyeonim/yemaat/assets/122865860/6d3a575f-7523-4eaa-8fed-f2d3e2fba6f8)

» 구현 기능<br>

    * 예맛 프로젝트의 이벤트 페이지

    * 가게 별 진행중인 이벤트를 확인할 수 있음

    * 각 이벤트 들은 점주페이지 에서 이벤트 추가 가능

    * 페이징을 통해 공지사항 목록 넘기기

<h3 id="restdetail">가게 상세보기 페이지</h3>

![rest Detail](https://github.com/doyeon27/project01/assets/149025529/7e9a79b2-0ef1-4699-8523-659f5e3c0f4c)

» 구현 기능<br>

    * 예맛 프로젝트의 가게 상세보기 페이지

    * 가게 정보 확인 가능

    * 가게를 이용한 고객들의 리뷰 열람 가능

    * 예약 기능 구현

<h3 id="mypage">마이 페이지</h3>

![My Page](https://github.com/doyeon27/project01/assets/149025529/f9110f51-5e73-43ff-9114-44a39b028d41)

» 구현 기능<br>

    * 예맛 프로젝트의 마이 페이지

    * 권한이 고객일 경우 접속 가능

    * 예약, 찜, 리뷰, 문의, 개인정보에 관한 기능 구현

    * 관리자와 연동하여 문의 기능 구현

    * 리모컨 기능 구현

<h3 id="ownerpage">점주 페이지</h3>

![Owner Page](https://github.com/doyeon27/project01/assets/149025529/1675e64b-6cb1-4100-9639-9b46e3a2570d)

» 구현 기능<br>

    * 예맛 프로젝트의 점주 페이지

    * 가게 추가, 수정, 삭제 기능 구현

    * 관리자와 연동하여 가게등록, 폐점 신청 기능 구현

    * 가게 이벤트 추가 가능

    * 좌측 상단 로고 클릭 시 메인 페이지로 이동

<h3 id="manager">관리자 페이지</h3>

![Admin Page](https://github.com/doyeon27/project01/assets/149025529/9cb4bfd0-61c3-4cbe-a86a-f1d45800a102)

» 구현 기능<br>

    * 예맛 프로젝트의 관리자 페이지

    * 관리자 메인 페이지에 막대 그래프, 도넛 그래프를 활용한 회원, 가게 현황 표시 

    * 고객, 점주에 대해 추가, 수정, 삭제 기능 구현

    * 고객에 대한 블랙리스트 기능 구현

    * 점주 페이지에서 신청한 가게등록, 가게폐점 수락 및 거절 기능 구현

    * 공지사항 추가, 수정, 삭제 기능 구현

    * 공지사항 고정 기능 구현

    * 마이 페이지에서 신청 한 문의 처리 기능 구현

    * 좌측 상단 로고 클릭 시 메인 페이지로 이동

<h3 id="login">로그인 페이지 및 푸터 영역</h3>

![Login Page](https://github.com/doyeon27/project01/assets/149025529/b6055e37-3707-4dc5-80cc-8fdae479afc3)

» 구현 기능<br>

    * 예맛 프로젝트의 로그인 페이지

    * 예맛 프로젝트의 푸터 영역

    * 일반 로그인, 소셜 로그인 기능 구현

    * 아이디, 비밀번호 찾기 가능

<h3 id="singup">회원가입 페이지</h3>

![Sign_Up](https://github.com/doyeon27/project01/assets/149025529/e5d37cc7-713c-44f6-bf53-0b8f697b7c22)

» 구현 기능<br>

    * 예맛 프로젝트의 회원가입 페이지

    * 개인 회원가입, 점주 회원가입이 나눠져 있음

    * 일반 로그인, 소셜 로그인 기능 구현

    * 아이디, 비밀번호 찾기 가능




## 프로젝트 후기
ㅁㄹㅇㄴㅁㄹㄴㅁㅇㄹㄴㅁㄹㅇ



