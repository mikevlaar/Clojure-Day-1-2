(ns Day1)

(defn big [st n]
  (> (count st) n) )

(defn collection-type [col]
  (cond
    (list? col) :list
    (vector? col) :vector
    (map? col) :map))

(println "Foo:" (big "Foo" 0)) ;should return true cause 0 is smaller then the string length.
(println "Bar:" (big "Bar" 10)) ;should return false cause 10 is bigger then the string length.

(def aList '(9 7 2))
(def aMap {:a 9, :b 7, :c 2})
(def aVector [2 7 9])

(println "It is an" (collection-type aList)) ;should return :list.
(println "It is an" (collection-type aMap)) ;should return :map.
(println "It is an" (collection-type aVector)) ;should return :vector.