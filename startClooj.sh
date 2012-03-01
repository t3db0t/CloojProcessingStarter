#!/bin/bash

PROCESSING_DIR=/Applications/Processing.app/Contents/Resources/Java
PROCESSING_OGL=$PROCESSING_DIR/modes/java/libraries/opengl/library
CLJ_PROCESSING_DIR=/Users/daleth/Projects/Clojure/Test/lib
JARS=$PROCESSING_DIR/core.jar:$PROCESSING_OGL/gluegen-rt.jar:$PROCESSING_OGL/jogl.jar:$PROCESSING_OGL/opengl.jar:$CLJ_PROCESSING_DIR/processing.core.jar

#java -cp $JARS -Djava.library.path=$PROCESSING_OGL/macosx -jar /Applications/clooj-0.2.8-standalone.jar
java -Djava.library.path=$PROCESSING_OGL/macosx -jar /Applications/clooj-0.2.8-standalone.jar