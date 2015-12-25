(ns clojure.data.json-benchmark
  (:use criterium.core
        clojure.java.io)
  (:require [clojure.data.json :as json]
            [clojure.data.json :as json1]
            [clojure.test :refer [deftest]]))

(defn test-json1 []
  (with-open [rdr (reader (resource "test.json"))]
    (json/write-str (json/read rdr))))

(defn test-json2 []
  (with-open [rdr (reader (resource "test.json"))]
    (json1/write-str (json1/read rdr))))

(deftest test-benchmark
  (with-progress-reporting (bench (test-json1) :verbose))
  #_(with-progress-reporting (bench (test-json2) :verbose)))
