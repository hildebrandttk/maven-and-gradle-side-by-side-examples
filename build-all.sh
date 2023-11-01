#/bin/sh

set -e
set -E

for name in */build.gradle*; do
  gradlew -p `dirname $name` clean jar;
done

for name in */pom.xml; do
  mvnw -f $name clean verify;
done