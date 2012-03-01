(ns drawing-example)
  (:use [processing.core]
        [processing.core.applet]))

;; here's a function which will be called by Processing's (PApplet)
;; draw method every frame. Place your code here. If you eval it
;; interactively, you can redefine it while the applet is running and
;; see effects immediately

(defn cw []
  (/ (width) 2))

(defn ch []
  (/ (height) 2))

(def a (atom 0))

(defn draw
  "Example usage of with-translation and with-rotation."
  []
  (background-float 125)
  (stroke-float 10)
  (fill-float (rand-int 125) (rand-int 125) (rand-int 125))
;  (fill-float 
  (with-translation [(cw) (ch)]
    (with-rotation [@a];[QUARTER-PI]
      (begin-shape)
      (vertex -50  50)
      (vertex  50  50)
      (vertex  50 -50)
      (vertex -50 -50)
      (end-shape :close)))
  (display-filter :invert)
  (swap! a + 0.01))

(defn setup []
  "Runs once."
  (smooth)
  (no-stroke)
  (fill 226)
  (frame-rate 30))

;; Now we just need to define an applet:

(defapplet drawing-example
  :title "Drawing Example"
  :setup setup
  :draw draw
  :size [200 200])

(applet-start drawing-example)