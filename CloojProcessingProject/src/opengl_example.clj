(ns opengl-example
  (:use [processing.core]
        [processing.core.applet]))

(def mouse-position (atom [0 0]))
(def a (atom 0))
(def b (atom 0))
(def cubelen 50)
(def -cubelen (* -1 cubelen))
(def dcubelen (* 2 cubelen))
(def -dcubelen (* -2 cubelen))
(def rotmax (* 2 PI))

(defn mouse-moved []
  (let [x (mouse-x)  y (mouse-y)]
    (reset! mouse-position [x y])))

(defn setup []
  (no-stroke))

(defn makebox []
  ; Red side
  (fill 200 102 0)
  (rect -cubelen -cubelen dcubelen dcubelen)
  
  ; Brown side
  (rotate-x (/ PI 2))
  (translate 0 cubelen cubelen)
  (fill 200 20 50)
  (rect -cubelen -cubelen dcubelen dcubelen)
  
  ; Green side
  (rotate-y (/ PI 2))
  (translate cubelen 0 cubelen)
  (fill 50 252 0)
  (rect -cubelen -cubelen dcubelen dcubelen)
  
  ; Yellow side
  (translate 0 0 -dcubelen)
  (fill 200 252 50)
  (rect -cubelen -cubelen dcubelen dcubelen)
  
  ; Teal side
  (rotate-y (/ PI 2))
  (translate -cubelen 0 cubelen)
  (fill 150 250 250)
  (rect -cubelen -cubelen dcubelen dcubelen)
  
  ; Purple side
  (rotate-x (/ PI 2))
  (translate 0 -cubelen -cubelen)
  (fill 200 50 250)
  (rect -cubelen -cubelen dcubelen dcubelen)
)

(defn draw []
  (background-float 255)
  
  ;(rotate-x @a)
  ;(rotate-y @b)
  
  (translate (/ (width) 2) (/ (height) 2))
  
  (let [[x y] @mouse-position]
    (rotate-x (map-to y 0 (width) 0 rotmax))
    (rotate-y (map-to x 0 (height) 0 rotmax)))
  (rotate-z @a)
  (makebox)
  
  (swap! a + 0.01)
  ;(swap! b + 0.02)
)

(defapplet opengl-example
  :title "OpenGL Example"
  :size [800 600 OPENGL]
  :setup setup
  :draw draw
  :mouse-moved mouse-moved)

(applet-start opengl-example)