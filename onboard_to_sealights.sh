# Onboard the sample Calculator app to SeaLights
# Using the Gradle plugin

# Download the SeaLights Java agent
cd $PROJECT_ROOT_DIR
rm -rf sealights
mkdir sealights && cd sealights
wget -nv https://agents.sealights.co/sealights-java/sealights-java-latest.zip
unzip -oq sealights-java-latest.zip

# Add SeaLights dependencies to the pom.xml file.
java -jar sealights/sl-build-scanner.jar -pom \
    -configfile sl-maven.json \
    -workspacepath .

# Build and run unit tests
#
# Because SeaLights was dynamically added to the pom.xml, 
# this command can be run "as usual". The SL build session
# will be created, build metatada uploaded, and unit tests
# dynamically instrumented for test coverage.
mvn clean package

# Restore the pom.xml
java -jar sealights/sl-build-scanner.jar -restorePom -workspacepath .

# Manual tests
#
# Start the test stage
java -jar sealights/sl-test-listener.jar start \
    -tokenfile sealights/sltoken-dev-cs.txt \
    -buildsessionidfile buildSessionId.txt \
    -testStage "Manual Tests"
#
# Start the app with the test listener attached as a java agent
#
java -cp target/calculator_mvn-1.0-SNAPSHOT.jar \
    -javaagent:sealights/sl-test-listener.jar \
    -Dsl.tokenFile=sealights/sltoken-dev-cs.txt \
    -Dsl.buildSessionIdFile=buildSessionId.txt \
    -Dsl.tags="Calculator-Terminal-Maven" \
    -Dsl.testStage="Manual Tests" \
#    -Dsl.filesStorage=sealights/ \
    -Dsl.log.toFile=true -Dsl.log.folder=sealights -Dsl.log.level=info \
    io.sealights.samples.maven.java.App

#
# End the test stage
java -jar sealights/sl-test-listener.jar end \
    -tokenfile sealights/sltoken-dev-cs.txt \
    -buildsessionidfile buildSessionId.txt
