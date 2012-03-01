# Clooj/Processing Starter Project
### by [Ted Hayes](http://log.liminastudio.com)

Ever wanted to write Processing sketches in Clojure? This is a quick-start project folder for the [Clooj](https://github.com/arthuredelstein/clooj) environment by Arthur Edelstein that contains the [clj-processing](https://github.com/rosado/clj-processing) library and requisite Processing libraries.

Note that as clj-processing is changed, the library (`processing.core.jar`) included here may not; I'm including it pre-built here for ease of use and setup.  I will try to update it as necessary, though!

These instructions are also [available here](http://log.liminastudio.com/programming/getting-started-with-clojure-processing) as well as [instructions for building the clj-processing core](http://log.liminastudio.com/programming/how-to-build-clj-processing).

---

### How To Use
1. Clone or [Download](https://github.com/virgildisgr4ce/CloojProcessingStarter/zipball/master) the Starter Project into a directory of your choice
1. Download [Clooj standalone](https://github.com/arthuredelstein/clooj/downloads) and run it
1. In Clooj, do Project > Open... and point at your new CloojProcessingProject folder
1. Click on one of the example scripts in the src/ directory
1. Hit Command-E to run it.
1. Enjoy! Note that you don't have to close the applet window to change the code—try changing some code in the (draw) function and hit Command-Enter. Voila, the applet reflects your changes without restarting it! (This is buggy in OpenGL at the moment but works well for regular sketches.)
1. For reference to the names of Processing functions in clj-processing, refer to the core source (for now).

### For OpenGL Support
1. I made a startClooj.sh script that you need to run instead of just double-clicking on Clooj.  Do `chmod +x startClooj.sh` (if necessary) and then `./startClooj.sh`.
	1. Why is this necessary? For whatever reason, to enable OpenGL support, java has to be started with the java.library.path set to the path of Processing's OGL dynamic libraries. These are different for different operating systems, so I'm not including all of them here. Hence, you'll need Processing installed.
	1. The script assumes that:
		1. You have Processing installed in /Applications. If you don't have Processing, [download it](http://processing.org/download/) and put it wherever, and change the startClooj script to point at it.
		2. Clooj is in /Applications and is named `clooj-0.2.8-standalone.jar`. If not, just change it in the script.

### Learning Clojure
- If you've never used Clojure before, but are curious to get started, check out these online tutorials:
	- [Clojure for the Non-LISP Programmer](http://www.moxleystratton.com/article/clojure/for-non-lisp-programmers)
	- [Clojure - Functional Programming for the JVM](http://java.ociweb.com/mark/clojure/article.html)
	- [Intro to Clojure videos on YouTube](http://www.youtube.com/watch?index=0&feature=PlayList&v=Aoeav_T1ARU&list=PLAC43CFB134E85266)
	- [Fast Track Clojure](http://fasttrackclojure.blogspot.com/)
- Books & Wikibooks:
	- [The Joy of Closure](http://joyofclojure.com/)
	- [Programming Clojure](http://pragprog.com/book/shcloj2/programming-clojure)
	- [Learning Clojure](http://en.wikibooks.org/wiki/Learning_Clojure)
	- [Clojure Programming](http://en.wikibooks.org/wiki/Clojure_Programming)

### Licensing
My understanding is that Processing's libraries (core.jar, gluegen-rt.jar, jogl.jar and opengl.jar) are licensed under the [GNU Lesser General Public License](http://www.opensource.org/licenses/lgpl-2.1.php), so I'm including them here for ease of use.