(ns test.Day1Test
  (:use [Day1])
  (:use [clojure.test]))

(deftest big-returns-true-on-negative-numbers
  (is true (big "" -1)))

(deftest big-returns-true-on-0-and-any-string
  (is true (big "Foo" 0)))

(deftest big-returns-false-on-strings-smaller-then-10-long
  (is (= false (big "Bar" 10))))

(run-all-tests)