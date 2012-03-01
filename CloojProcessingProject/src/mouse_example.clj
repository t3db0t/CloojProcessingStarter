(ns mouse-example
  (:use [processing.core]
        [processing.core.applet]))

(def mouse-position (atom [0 0]))

(defn draw []
  (background-float 100 150 200)
  (stroke-weight 40)
  (stroke-float 100 20 100)
  (let [[x y] @mouse-position]
    (point x y)))

(defn setup []
  (smooth)
  (no-stroke))

(defn mouse-moved []
  (let [x (mouse-x)  y (mouse-y)]
    (reset! mouse-position [x y])))

(defapplet mouse-example
  :title "Mouse example."
  :size [500 500]
  :setup setup
  :draw draw
  :mouse-moved mouse-moved)

(applet-start mouse-example)