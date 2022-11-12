.DEFAULT_GOAL := build-run
run-dist:
	./build/install/app/bin/app

clean:
	./gradlew clean

build:
	 ./gradlew clean build test

install:
	./gradlew clean installDist

run:
	./gradlew run

test:
	./gradlew test

report:
	./gradlew test jacocoTestReport

lint:
	./gradlew checkstyleMain checkstyleTest

update-deps:
	./gradlew useLatestVersions


build-run: build run

.PHONY: build