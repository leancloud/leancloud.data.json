(ns leancloud.data.pprint.jmap
  (:import (java.util HashMap)))

(defn jmap [m]
  (let [ret (HashMap.)]
    (doseq [[k v] m]
      (.put ret k v))
    ret))

(defn jget
  ([m k]
   (get m k nil))
  ([^HashMap m k not-found]
   (if-some [x (.get m k)]
     x
     not-found)))

(defn jset
  [^HashMap m k v]
  (.put m k v))

(defn ->map [m]
  (into {} m))
