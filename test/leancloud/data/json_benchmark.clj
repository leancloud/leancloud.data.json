(ns leancloud.data.json-benchmark
  (:use criterium.core
        clojure.java.io)
  (:require [leancloud.data.json :as json]
            [clojure.test :refer [deftest]]))

(defn parse-json []
  (with-open [rdr (reader (resource "test.json"))]
    (json/write-str (json/read rdr))))

(deftest test-benchmark
  (with-progress-reporting (bench (parse-json) :verbose)))
