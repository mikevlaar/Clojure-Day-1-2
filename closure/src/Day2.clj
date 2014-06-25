(ns Day2)

(defmacro unless [test ifBody elseBody]
        (list 'if(list 'not test ) ifBody elseBody))

(unless false (println "if condition") (println "else condition"))
(unless true (println "if condition") (println "else condition"))

(defprotocol Person
  (talk [this message]))

(defrecord Student [name]
  Person
  (talk [this message] (str name " zegt: " message)))

(def Mike (Student. "Mike"))
(println (talk Mike "Hello World!"))