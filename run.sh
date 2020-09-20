#!/bin/bash
rm -rf out
javac --module-source-path src -d out $(find . -name '*.java')
rm -rf jars && mkdir -p jars
jar --create --file jars/adee.api.jar -C out/adee.api .
jar --create --file jars/adee.api.classwork.jar -C out/adee.api.classwork .
jar --create --file jars/adee.api.homework.jar -C out/adee.api.homework .
jar --create --file jars/easytext.cli.jar --main-class=javamodularity.easytext.cli.AdeeCli -C out/easytext.cli .
jar --create --file jars/easytext.analysis.jar --main-class=javamodularity.easytext.analysis.AdeeAnalysis -C out/easytext.analysis .
rm -rf image
/Users/adeep/Library/Java/JavaVirtualMachines/jdk-11.0.2.jdk/Contents/Home/bin/jlink \
 --module-path jars/:$JAVA_HOME/jmods \
 --add-modules easytext.cli,adee.api.classwork,adee.api.homework \
 --strip-debug --compress=2 \
 --output image 
./image/bin/java -m easytext.cli/javamodularity.easytext.cli.AdeeCli
