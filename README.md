# 180904_revision
비트캠프 자바 110기 복습 프로젝트

## java110-project minor-division

- 자바 프로젝트 디렉토리 구성하기
```
1) github - repository 생성

2) terminal - 대상 dir 들어가서 git clone url
    -2  cd dir
    -3  mkdir 작업 폴더 만들기
    -4  cd 작업폴더

3) terminal - gradle을 통해 setupType을 용도에 맞게 java-application을 설정.
            $ gradle init --type java-application

4) VisualStudioCode(이하VS) - gradle 설정 파일 (build.gradle)에 
                            id 'eclipse' 추가 + mavenCentral() 옵션

5) terminal - 작업폴더에 이클립스 설정 파일 생성
            $ gradle eclipse

6) VS - .gitignore 파일 생성
        .gradle/ .setting/ bin/ build/ .classpath .project
        지정해주면 git이 지정된 파일을 올리지 않음.

7) eclipse에서 프로젝트 import.

    이렇게 하는 이유.
        gradle : 프로젝트를 형상화 해주는 빌드 도구. 협업을 위해 IDE에 종속되지 않도록 하는 개발.
        VS : 이클립스에서 할 수 없는 설정을 할 수 있음.
```