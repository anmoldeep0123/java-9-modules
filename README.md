# java-9-modules

JAVA MODULARITY

rt.jar 

java modules
java.desktop
jdk.httpserver
java.sql
java.prefs
java.logging
java.xml
java.base. - base module - all modules depend on it

module has publicly accessible packages and ifaces & internal pacakges and classes 


MODULE DESCRIPTORS
java.base module

module-info.java

module java.base {
	exports
	exports
	...


	requires java.anothermodule
	requires 

}


javac --module-source-path src -d out $(find . -name '*.java')


adeep-r:java9-poc adeep$ pwd
/Users/adeep/workspace/atom/java9-poc
adeep-r:java9-poc adeep$ java --module-path out -m easytext/javamodularity.easytext.MainClass
Hello World


adeep-r:java9-poc adeep$ java --module-path out -m easytext.cli/javamodularity.easytext.cli.AdeeCli
Hello World  - CLI
AdeeAnalysis = javamodularity.easytext.analysis.AdeeAnalysis@3d8c7aca


adeep-r:java9-poc adeep$ java --module-path out -m easytext.cli/javamodularity.easytext.cli.AdeeCli
Error occurred during initialization of boot layer
java.lang.module.FindException: Module easytext.analysis not found, required by easytext.cli

requires transitive ---- 
this is for implied readability 

app requires sql requires logging 
app cannot access logger

vs 

app requires sql requires transitive loggin
app can access logger

----- aggregator module - aggregates multiple modules with requires transitive dependency

// finding the right module
java --list-modules
java --describe-module java.transaction.xa


// limited exports
exports a.b.c.d. to x.y.z

create jars

jlink --module-path jars/:$JAVA_HOME/jmods --add-modules easytext.cli --strip-debug --compress=2 --output image

javac --add-exports java.base/sun.security.x509=ALL-UNNAMED Main.java 

javac --add-modules java.xml.bind

Automatic Modules
-----------------
add non modular jar to module path
- exports all packages
requires common.lang in our app module
add jar to module path 
