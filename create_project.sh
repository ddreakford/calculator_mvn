#!/bin/sh

mvn archetype:generate \
	-DarchetypeGroupId=org.apache.maven.archetypes \
	-DarchetypeArtifactId=maven-archetype-simple \
	-DarchetypeVersion=1.4 \
	-DgroupId=io.sealights.samples.maven.java \
	-DartifactId=calculator_mvn \
	-DinteractiveMode=false
