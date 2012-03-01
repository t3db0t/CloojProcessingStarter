#!/bin/bash

PROCESSING_DIR=/Applications/Processing.app/Contents/Resources/Java
PROCESSING_OGL=$PROCESSING_DIR/modes/java/libraries/opengl/library

java -Djava.library.path=$PROCESSING_OGL/macosx -jar /Applications/clooj-0.2.8-standalone.jar