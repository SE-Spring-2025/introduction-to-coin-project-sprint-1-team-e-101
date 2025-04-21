JFLAGS = -d bin -sourcepath src
JUNIT5_JAR = lib/junit-platform-console-standalone-1.11.0.jar
JUNIT5_RUNNER = org.junit.platform.console.ConsoleLauncher
CKSTYLE_LIB =  lib/checkstyle-10.18.1-all.jar

default: 
	@echo "usage: make target"
	@echo "5 available targets: clean - removes editor tmpfiles and .class files"
	@echo "____________________ compile - builds codebase"
	@echo "____________________ test - runs JUnit5 tests"
	@echo "____________________ demo - runs demo (client)"
	@echo "____________________ check - runs checkstyle"
	@echo "Just starting with make? Try these 4 make commands successively:"
	@echo "________ make clean ; make compile ; make test ; make check"

compile: $(JUNIT5_JAR)
	-javac -d bin/client -cp .:src/main src/client/*.java
	-javac -d bin/tests -cp .:$(JUNIT5_JAR):src/main src/tests/*.java
	-javac -d bin/main -cp . src/main/*.java

test: $(JUNIT5_JAR)
	java -cp bin/tests:bin/main:$(JUNIT5_JAR) $(JUNIT5_RUNNER) execute --scan-class-path 

demo: bin/client/Demo.class
	java -cp .:bin/client:bin/main Demo

check: styles.xml $(CKSTYLE_LIB)
	java -jar $(CKSTYLE_LIB) -c ./styles.xml src/main/*.java

clean:
#	Java class files
	-rm -f ./bin/**/*.class
	-rm -f ./bin/*.class
#	Emacs editor backup files
	-rm -f ./*~
	-rm -f ./src/**/*~
	-rm -f ./docs/*~
	-rm -f ./docs/**/*~
